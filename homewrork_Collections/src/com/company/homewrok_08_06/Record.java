package com.company.homewrok_08_06;

import java.util.Objects;

public class Record implements Comparable<Record>{
    private Person person;
    private Long timeCode;

    public Record(Person person, Long timeCode) {
        this.person = person;
        this.timeCode = timeCode;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return Objects.equals(person, record.person) && Objects.equals(timeCode, record.timeCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, timeCode);
    }



    @Override
    public int compareTo(Record o) {
        return person.getId() - o.person.getId();
    }
}
