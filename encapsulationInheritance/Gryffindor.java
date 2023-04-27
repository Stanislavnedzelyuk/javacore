package encapsulationInheritance;

public class Gryffindor extends Hogwarts {
    private int nobility; // благородный
    private int honor; // уровень чести
    private int bravery; // храбрость

    private String person;

    public Gryffindor(int nobility, int honor, int bravery, int power,
                      int distance, String person) {
        super(power, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.person = person;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}
