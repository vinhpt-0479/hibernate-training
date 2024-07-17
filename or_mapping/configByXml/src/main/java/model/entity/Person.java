package model.entity;

public class Person {
    private int id;
    private String name;
    private Passport passport;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Passport getPassport() {
        return passport;
    }
    public void setPassport(Passport passport) {
        this.passport = passport;
    }
    public Person(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }
    public Person() {
    }
    
}
