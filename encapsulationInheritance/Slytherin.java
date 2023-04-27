package encapsulationInheritance;

public class Slytherin extends Hogwarts{

    private int cunning;  // хитрость
    private int determination; //решительность
    private int ambition; //амбиции
    private int resourcefulness; //находчивость
    private int authorities; //жажда власти
    private String person;
    public Slytherin(int cunning, int determination, int ambition,
                     int resourcefulness, int authorities, int power,
                     int distance, String person) {
        super(power, distance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authorities = authorities;
        this.person = person;
    }
    public int getCunning() {
        return cunning;
    }
    public void setCunning(int cunning) {
        this.cunning = cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public void setDetermination(int determination) {
        this.determination = determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
    public int getAuthorities() {
        return authorities;
    }
    public void setAuthorities(int authorities) {
        this.authorities = authorities;
    }
    public String getPerson() {
        return person;
    }
    public void setPerson(String person) {
        this.person = person;
    }
}
