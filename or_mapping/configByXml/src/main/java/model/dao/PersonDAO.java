package model.dao;

import model.entity.Person;

public class PersonDAO extends GenericDAO<Person>  {
    public PersonDAO() {
        super(Person.class);
    }
}
