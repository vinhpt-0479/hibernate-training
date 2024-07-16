package test;

import dao.PersonDAO;
import model.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();

//        // Create person
//        Person person = new Person();
//        person.setName("Mai Thu Phuong");
//        person.setAge(20);
//
//        // Create address
//        Address address = new Address();
//        address.setStreet("68/2 Ho Ba On");
//        address.setCity("Da Nang");
//        address.setPerson(person);
//        person.setAddress(address);
//
//        // Create phones
//        Phone phone1 = new Phone();
//        phone1.setNumber("0921233432");
//        phone1.setPerson(person);
//
//        Phone phone2 = new Phone();
//        phone2.setNumber("0945274528");
//        phone2.setPerson(person);
//
//        Set<Phone> phones = new HashSet<>();
//        phones.add(phone1);
//        phones.add(phone2);
//        person.setPhones(phones);
//
//        // Create meetings
//        Meeting meeting1 = new Meeting();
//        meeting1.setTopic("Daily Meeting");
//
//        Meeting meeting2 = new Meeting();
//        meeting2.setTopic("Java Sharing Meeting");
//
//        Set<Meeting> meetings = new HashSet<>();
//        meetings.add(meeting1);
//        meetings.add(meeting2);
//        person.setMeetings(meetings);
//
//        personDAO.insert(person);


//        // Update person
//        Person person = new Person();
//        person.setId(1);
//        person.setName("Nguyen Minh Anh");
//        person.setAge(20);
//        personDAO.update(person);

//         // Get person
//        Person person = new Person();
//        person.setId(1);
//        Person personFromDB = personDAO.selectById(person);
//        System.out.println(personFromDB.getName());

//        // Get all persons
//        personDAO.selectAll().forEach(p -> System.out.println(p.getName()));

//         // Delete person
        Person person = new Person();
        person.setId(3);
        personDAO.delete(person);
    }
}
