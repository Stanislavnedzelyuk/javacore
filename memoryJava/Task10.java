package memoryJava;

public class Task10 {

    public static class Person {
        String name;
        String surname;
        private Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        @Override
        public String toString() {
            return name + " " + surname;
        }
    }
    public static void changePerson(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";

    }
    public static void main(String[] args) {
        String name = "Lyapis"; //
        String surname = "Trubetskoy"; // фамилия
        Person person = new Person(name, surname);

        changePerson(person);
        System.out.println(person);
    }
}

