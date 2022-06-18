package com.company.lambdasAndGenerics;



public class Person {
   /* 1)  	В программе задан список Person{
   String fName, String lName, String email, String phone, Address address}.
   Address{String postcode, String city, String street, String house}
    Реализовать следующие функции:
            -получить список всех ФИО
	       	-получить список всех e-mail
       		-получить список всех телефонов
       		-получить список всех адресов в виде строки адреса
    Естественно, все вышеперечисленные функции может и должен реализовать один метод,
     в который в качестве параметра должен приходить список Person и
     реализация необходимого способа обработки. Ограничения:
     не использовать стандартные Java интерфейсы, все необходимые классы и интерфейсы описывать
     и реализовывать самостоятельно. Не использовать stream.
*/
    private String fName;
    private String lName;
    private String email;
    private String phone;
    private Address address;

 public Person(String fName, String lName, String email, String phone, Address address) {
  this.fName = fName;
  this.lName = lName;
  this.email = email;
  this.phone = phone;
  this.address = address;
 }

 public String getfName() {
  return fName;
 }

 public String getlName() {
  return lName;
 }

 public String getEmail() {
  return email;
 }

 public String getPhone() {
  return phone;
 }

 public Address getAddress() {
  return address;
 }

 public String getFullName() {
  return fName + " " + lName;
 }
}
