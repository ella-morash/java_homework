package com.telran;

import java.util.Objects;

public class Order {

    private int id;
    private String name;

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(name, order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public boolean isEqual(Order o) {
        if (o!=null){
            if (o.hashCode()==this.hashCode()&&this.equals(o)) {
                return true;
            }
        }
        return false;
    }
}
