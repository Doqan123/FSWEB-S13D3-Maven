package org.example;

public class Person {
    String firstName;
    String lastName;
    String department;
    int age;
    int ID;
    int salary;


    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName,
                  String department , int age, int ID, int salary ){
        this(firstName, lastName, age);
        this.department = department;
        this.ID = ID;
        this.salary = salary;
    }
    public String getFirstName (){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return (age>=13 && age<=19);
    }


}
