package model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Passport")
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="passport_id")
	private int id;
	@Column(name="passport_number")
	private String number;

	@OneToOne
	@JoinColumn(name="person_id")
	private Person person;

	public Passport() {
	}
	
    public Passport(int id, String number, Person person) {
		this.id = id;
		this.number = number;
		this.person = person;
	}

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

	

}