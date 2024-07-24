package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;

    double height;
    double weight;
    int shoeSize;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double height, double weight, int shoeSize) {
        this(firstName, lastName, age);
        this.height = height;
        this.weight = weight;
        this.shoeSize = shoeSize;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
