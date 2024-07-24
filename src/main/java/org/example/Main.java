package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Furkan", "Kızılbuğa", 23, 1.78, 56.0, 42);

        System.out.println("Firstname: " + person1.getFirstName());

        System.out.println("LastName: " + person2.getLastName());

        System.out.println("Age: " + person1.getAge());

        System.out.println("*********************************");

        Wall wall = new Wall(50, 30);

        System.out.println("Width: " + wall.getWidth());
        System.out.println("Height: " + wall.getHeight());
        wall.setWidth(40);
        wall.setHeight(69);
        System.out.println("New Width: " + wall.getWidth());
        System.out.println("New Height: " + wall.getHeight());
        wall.setWidth(-12);
        System.out.println("Last Width: " + wall.getWidth());
    }
}
