package encapsulationInheritance;

public class PrintStudents {

    public void print(Slytherin[] student1) {
        System.out.println("*******************");
        System.out.println("Студенты Слизерина");
        for (int i = 0; i < student1.length; i++) {
            Slytherin slytherin = student1[i];
            System.out.println("Имя: " + slytherin.getPerson() + ", " + "хитрость - " + slytherin.getCunning() + ", "
                    + "решительность - " + slytherin.getAuthorities() + ", " + "амбициозность - "
                    + slytherin.getAmbition() + ", " + "находчивость - " + slytherin.getDetermination() + ", "
                    + "жажда власти - " + slytherin.getResourcefulness() + ", " + "мощность магии - "
                    + slytherin.getPower() + ", " + "дальность удара магии - " + slytherin.getDistance());
        }
    }

    public void print(Puffenduy[] student2) {
        System.out.println("*******************");
        System.out.println("Студенты Пуффендуя");
        for (int i = 0; i < student2.length; i++) {
            Puffenduy puffenduy = student2[i];
            System.out.println("Имя: " + puffenduy.getPerson() + ", " + "трудолюбие - " + puffenduy.getIndustrious() + ", "
                    + "верность - " + puffenduy.getFaithful() + ", " + "честность - "
                    + puffenduy.getHonest() + ", "  + "мощность магии - " + puffenduy.getPower() + ", "
                    + "дальность удара магии - " + puffenduy.getDistance());
        }
    }

    public void print(Gryffindor[] student3) {
        System.out.println("*******************");
        System.out.println("Студенты Гриффиндорца");
        for (int i = 0; i < student3.length; i++) {
            Gryffindor gryffindor = student3[i];
            System.out.println("Имя: " + gryffindor.getPerson() + ", " + "благородный - " + gryffindor.getNobility() + ", "
                    + "уровень чести - " + gryffindor.getHonor() + ", " + "храбрость - "
                    + gryffindor.getBravery() + ", "  + "мощность магии - " + gryffindor.getPower() + ", "
                    + "дальность удара магии - " + gryffindor.getDistance());
        }
    }

    public void print(Kogtevran[] student4) {
        System.out.println("*******************");
        System.out.println("Студенты Когтевранца");
        for (int i = 0; i < student4.length; i++) {
            Kogtevran kogtevran = student4[i];
            System.out.println("Имя: " + kogtevran.getPerson() + ", " + "умный - " + kogtevran.getSmart() + ", "
                    + "мудрый - " + kogtevran.getWise() + ", " + "остроумный - "
                    + kogtevran.getWitty() + ", "  + "творческий - " + kogtevran.getCreativity() + ", "
                    + ", " + "мощность магии - " + kogtevran.getPower() + ", " + "дальность удара магии - "
                    + kogtevran.getDistance());
        }
    }
}
