package model;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

import java.util.Set;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private Set<Phone> phones;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "persion_meeting",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "meeting_id")
    )
    private Set<Meeting> meetings;

    public Person() {
    }

    public Person(long id, String name, int age, Address address, Set<Phone> phones, Set<Meeting> meetings) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phones = phones;
        this.meetings = meetings;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

    public Set<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(Set<Meeting> meetings) {
        this.meetings = meetings;
    }
}
