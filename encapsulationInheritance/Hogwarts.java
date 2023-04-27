package encapsulationInheritance;

public class Hogwarts {
    public Hogwarts(int power, int distance) {
        this.power = power;
        this.distance = distance;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    private int power;
    private int distance;

    public static void main(String[] args) {


        Slytherin[] student1 = {
                new Slytherin(10,20,30,40,50,60,70,"Драко Малфой"),
                new Slytherin(20,20,40,40,60,70,80,"Грэхэм Монтегю"),
                new Slytherin(30,40,50,60,70,80,90,"Грегори Гойл")
        };
        Puffenduy[] student2 = {
                new Puffenduy(25,45,76,87,70,"Захария Смит"),
                new Puffenduy(35,55,44,45,87,"Седрик Диггори"),
                new Puffenduy(45,65,77,54,70,"Джастин Финч-Флетчли")
        };
        Gryffindor[] student3 = {
                new Gryffindor(33,65,11,45,14,"Гарри Поттер"),
                new Gryffindor(55, 32, 77, 12, 70, "Гермиона Грейнджер"),
                new Gryffindor(78,65,99,54,89,"Рон Уизли")
        };
        Kogtevran[] student4 = {
                new Kogtevran(78,65,99,66,89,67,"Чжоу Чанг"),
                new Kogtevran(56,22,45,28,89,34,"Падма Патил"),
                new Kogtevran(63,65,51,54,59,23,"Маркус Белби")
        };

        PrintStudents printStudents = new PrintStudents();
        printStudents.print(student1);
        printStudents.print(student2);
        printStudents.print(student3);
        printStudents.print(student4);

        CompareStudents.compareStudents(student1, student2);

    }

}


