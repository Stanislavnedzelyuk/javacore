package encapsulationInheritance;

public class Kogtevran extends Hogwarts{
    private int smart; // умный
    private int wise; // мудрый
    private int witty; // остроумный
    private int creativity; // творческий
    private String person;
    public Kogtevran(int smart, int wise, int witty, int creativity,
                     int power, int distance, String person) {
        super(power, distance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
        this.person = person;
    }
    public int getSmart() {
        return smart;
    }
    public void setSmart(int smart) {
        this.smart = smart;
    }
    public int getWise() {
        return wise;
    }
    public void setWise(int wise) {
        this.wise = wise;
    }
    public int getWitty() {
        return witty;
    }
    public void setWitty(int witty) {
        this.witty = witty;
    }
    public int getCreativity() {
        return creativity;
    }
    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public String getPerson() {
        return person;
    }
    public void setPerson(String person) {
        this.person = person;
    }
}
