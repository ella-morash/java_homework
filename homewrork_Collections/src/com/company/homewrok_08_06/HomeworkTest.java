package com.company.homewrok_08_06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



class HomeworkTest {

    @Test
    void validateList() {
        List<String> list = Arrays.asList("1","2","g*","@","4");
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"g*");
        map.put(3,"@");
        Assertions.assertEquals(map,Main.validateList(list));

    }

    @Test
    void validateListOtherValues() {
        List<String> list = Arrays.asList("a","2","h","$$","4");
        Map<Integer,String> map = new HashMap<>();
        map.put(0,"a");
        map.put(2,"h");
        map.put(3,"$$");
        Assertions.assertEquals(map,Main.validateList(list));

    }

    @Test
    void getFullyNotFullyVaccinatedIfTheEnd() {
        Record record = new Record(new Person(1,"Alex"), Instant.now().getEpochSecond());
        Record record1 = new Record(new Person(2,"Nata"), Instant.now().getEpochSecond());
        Record record2 = new Record(new Person(2,"Nata"), Instant.now().getEpochSecond());
        Record record3 = new Record(new Person(1,"Alex"), Instant.now().getEpochSecond());
        Record record4 = new Record(new Person(3,"Igor"), Instant.now().getEpochSecond());

        List<Record> records = Arrays.asList(record,record1,record2,record4,record3);
        Person expected = new Person(3,"Igor");

        Assertions.assertEquals(expected,Main.getNotFullyVaccinated(records));

    }

    @Test
    void getFullyNotFullyVaccinatedIfTheBeginning() {
        Record record = new Record(new Person(1,"Alex"), Instant.now().getEpochSecond());
        Record record1 = new Record(new Person(2,"Nata"), Instant.now().getEpochSecond());
        Record record2 = new Record(new Person(2,"Nata"), Instant.now().getEpochSecond());
        Record record3 = new Record(new Person(3,"Igor"), Instant.now().getEpochSecond());
        Record record4 = new Record(new Person(3,"Igor"), Instant.now().getEpochSecond());

        List<Record> records = Arrays.asList(record,record1,record2,record4,record3);
        Person expected = new Person(1,"Alex");

        Assertions.assertEquals(expected,Main.getNotFullyVaccinated(records));

    }

    @Test
    void getFullyNotFullyVaccinatedIfTheMiddle() {
        Record record = new Record(new Person(1,"Alex"), Instant.now().getEpochSecond());
        Record record1 = new Record(new Person(1,"Alex"), Instant.now().getEpochSecond());
        Record record2 = new Record(new Person(2,"Nata"), Instant.now().getEpochSecond());
        Record record3 = new Record(new Person(3,"Igor"), Instant.now().getEpochSecond());
        Record record4 = new Record(new Person(3,"Igor"), Instant.now().getEpochSecond());

        List<Record> records = Arrays.asList(record,record1,record2,record4,record3);
        Person expected = new Person(2,"Nata");

        Assertions.assertEquals(expected,Main.getNotFullyVaccinated(records));

    }

    @Test
    void getFullyNotFullyVaccinatedIfTheEndUsingMap() {
        Record record = new Record(new Person(1,"Alex"), Instant.now().getEpochSecond());
        Record record1 = new Record(new Person(2,"Nata"), Instant.now().getEpochSecond());
        Record record2 = new Record(new Person(2,"Nata"), Instant.now().getEpochSecond());
        Record record3 = new Record(new Person(1,"Alex"), Instant.now().getEpochSecond());
        Record record4 = new Record(new Person(3,"Igor"), Instant.now().getEpochSecond());

        List<Record> records = Arrays.asList(record,record1,record2,record4,record3);
        Person expected = new Person(3,"Igor");

        Assertions.assertEquals(expected,Main.getNotFullyVaccinated1(records));

    }

    @Test
    void getFullyNotFullyVaccinatedIfTheBeginningUsingMap() {
        Record record = new Record(new Person(1,"Alex"), Instant.now().getEpochSecond());
        Record record1 = new Record(new Person(2,"Nata"), Instant.now().getEpochSecond());
        Record record2 = new Record(new Person(2,"Nata"), Instant.now().getEpochSecond());
        Record record3 = new Record(new Person(3,"Igor"), Instant.now().getEpochSecond());
        Record record4 = new Record(new Person(3,"Igor"), Instant.now().getEpochSecond());

        List<Record> records = Arrays.asList(record,record1,record2,record4,record3);
        Person expected = new Person(1,"Alex");

        Assertions.assertEquals(expected,Main.getNotFullyVaccinated1(records));

    }

    @Test
    void getFullyNotFullyVaccinatedIfTheMiddleUsingMap() {
        Record record = new Record(new Person(1,"Alex"), Instant.now().getEpochSecond());
        Record record1 = new Record(new Person(1,"Alex"), Instant.now().getEpochSecond());
        Record record2 = new Record(new Person(2,"Nata"), Instant.now().getEpochSecond());
        Record record3 = new Record(new Person(3,"Igor"), Instant.now().getEpochSecond());
        Record record4 = new Record(new Person(3,"Igor"), Instant.now().getEpochSecond());

        List<Record> records = Arrays.asList(record,record1,record2,record4,record3);
        Person expected = new Person(2,"Nata");

        Assertions.assertEquals(expected,Main.getNotFullyVaccinated1(records));

    }


}