package com.company.homewrok_08_06;

import com.company.homewrok_08_06.user.User;

import java.time.Instant;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        User user = new User("5;;40;lennon@mail.com");


    }

    //Есть List. Все элементы в нем должны быть целые числа, но некоторые данные повреждены
    // (например, содержат символы).
    // Необходимо преобразовать данный список в List.
    // При этом сформировать детализированный список «ошибок» т.е.
    // в каких ячейках и какие значения не были распарсены.
    public static Map<Integer, String> validateList(List<String> list) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            try {
                Integer.parseInt(list.get(i));
            } catch (NumberFormatException exception) {
                map.put(i, list.get(i));

            }

        }
        return map;
    }


    //Дан List. Каждый Record состоит из Person(int id, String name) и некого числового значения Long timeCode.
    // Естественно, id – уникально. Известно, что каждому Person в списке соответствует две записи
    //
    // (предположим, два этапа вакцинации). Но один Person имеет только одну запись (вторую вакцинацию пропустил).
    // Необходимо найти этого Person’а. Решите эту задачу всеми известными Вам способами


    // two pointers approach. time O(logN) space O(1)
    public static Person getNotFullyVaccinated(List<Record> records) {
        Collections.sort(records);
        Person person = null;
        Iterator<Record> iterator = records.listIterator();
        Record singleVaccination = iterator.next();

        while (iterator.hasNext()) {
            Record currentRecord = iterator.next();
            if (currentRecord.getPerson().compareTo(singleVaccination.getPerson()) == 0) {
                currentRecord = iterator.next();
                singleVaccination = currentRecord;
            }

            person = singleVaccination.getPerson();

        }

        return person;

    }

    // using HashMap. time O(N) space O(N)
    public static Person getNotFullyVaccinated1(List<Record> records) {
        Map<Person, Integer> map = new HashMap<>();
        Person person = null;

        for (Record record : records) {
            person = record.getPerson();
            map.put(person, map.containsKey(person) ? map.get(person) + 1 : 1);

        }

        for (Map.Entry<Person, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                person = entry.getKey();
            }

        }

        return person;

    }

}

