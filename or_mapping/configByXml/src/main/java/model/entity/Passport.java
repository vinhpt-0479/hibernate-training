package model.entity;

public class Passport {
    private int id;
    private String number;
    private Person person;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public Passport(String number, Person person) {
        this.number = number;
        this.person = person;
    }
    public Passport() {
    }
    
}