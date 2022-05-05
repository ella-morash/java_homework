package com.company;

public class MyLinkedEmployee {
    private Node head;
    private Node tail;
    private int length;


    private static class Node {
        Employee employee;
        Node next;
        Node prev;

        public Node(Employee employee) {
            this.employee = employee;
        }
    }

    public MyLinkedEmployee(Employee employee) {
        Node newNode = new Node(employee);
        head = newNode;
        tail = newNode;
        length = 1;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.employee);
            temp = temp.next;
        }
    }

    public int size() {
        return length;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean insert(Employee employee, int index) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            addToHead(employee);
            return true;
        }
        if (index == length) {
            addToTail(employee);
            return true;
        }
        Node newNode = new Node(employee);
        Node before = get(index - 1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;

    }

    public void addToTail(Employee employee) {
        Node newNode = new Node(employee);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;

    }

    public void addToHead(Employee employee) {
        Node newNode = new Node(employee);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFromTail() {
        Node temp = tail;
        if (length == 0) {
            return null;
        } else if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public Node removeFromHead() {
        Node temp = head;
        if (length == 0) {
            return null;
        } else if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) removeFromHead();
        if (index == length) removeFromTail();
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;

        length--;
        return temp;

    }

    public boolean set(Employee employee, int index) {

        Node temp = get(index);
        if (temp != null) {
            temp.employee = employee;
            return true;
        }
        return false;

    }

    public int find(Employee e) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.employee != null) {
                if (e.hashCode() == temp.employee.hashCode() && temp.employee.equals(e)) {
                    return index;
                }
                temp = temp.next;
                index++;
            }
        }
        return -1;
    }
}
