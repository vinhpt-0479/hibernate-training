package model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String topic;
    @ManyToMany(mappedBy = "meetings")
    private Set<Person> persons;

    public Meeting() {
    }

    public Meeting(long id, String topic, Set<Person> persons) {
        this.id = id;
        this.topic = topic;
        this.persons = persons;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }
}
