package encapsulationInheritance;

public class Puffenduy extends Hogwarts{
    private int industrious; //трудолюбие
    private int faithful; // верность
    private int honest; // честность
    private String person;

    public Puffenduy(int industrious, int faithful, int honest,
                     int power, int distance, String person) {
        super(power, distance);
        this.industrious = industrious;
        this.faithful = faithful;
        this.honest = honest;
        this.person = person;
    }

    public int getIndustrious() {
        return industrious;
    }
    public void setIndustrious(int industrious) {
        this.industrious = industrious;
    }
    public int getFaithful() {
        return faithful;
    }
    public void setFaithful(int faithful) {
        this.faithful = faithful;
    }
    public int getHonest() {
        return honest;
    }
    public void setHonest(int honest) {
        this.honest = honest;
    }
    public String getPerson() {
        return person;
    }
    public void setPerson(String person) {
        this.person = person;
    }
}
