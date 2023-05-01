package memoryJava;

public class Task9 {
    public static class Person  {
        String name;
        String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
    }
    public static void changePerson (Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }

    public static void main(String[] args) {
        String name = "Lyapis"; // имя
        String surname = "Trubetskoy"; // фамилия
        Person person = new Person(name, surname);

        changePerson(person);
        System.out.println(person.name + " " + person.surname);
    }
}
