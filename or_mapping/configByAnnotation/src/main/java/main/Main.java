package main;

import config.HibernateConfig;
import model.entity.Course;
import model.entity.Department;
import model.entity.Employee;
import model.entity.Passport;
import model.entity.Person;
import model.entity.Student;
import model.dao.CourseDAO;
import model.dao.DepartmentDAO;
import model.dao.EmployeeDAO;
import model.dao.PassportDAO;
import model.dao.PersonDAO;
import model.dao.StudentDAO;

public class Main {
    public static void main(String[] args) {
        HibernateConfig.config();
        PersonDAO personDAO = new PersonDAO();
        PassportDAO passportDAO = new PassportDAO();
        DepartmentDAO departmentDAO = new DepartmentDAO();
        EmployeeDAO employeeDAO = new EmployeeDAO();
        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();

        // Tạo và lưu Person và Passport
        Person person = new Person();
        person.setName("John Doe");
        Passport passport = new Passport();
        passport.setNumber("123456789");
        passport.setPerson(person);
        person.setPassport(passport);
        personDAO.save(person);

        // Tạo và lưu Department và Employee
        Department department = new Department();
        department.setName("IT");
        Employee employee = new Employee();
        employee.setName("Vinh");
        employee.setDepartment(department);
        Employee employee2 = new Employee();
        employee2.setName("Truong");
        employee2.setDepartment(department);
        department.getEmployees().add(employee);
        department.getEmployees().add(employee2);
        departmentDAO.save(department);

        // Tạo và lưu Student và Course
        Student student1 = new Student();
        student1.setName("Tin");
        Student student2 = new Student();
        student2.setName("Khoi");
        Course course1 = new Course();
        course1.setName("Hibernate");
        Course course2 = new Course();
        course2.setName("Spring boot");
        
        student1.getCourses().add(course1);
        student1.getCourses().add(course2);
        student2.getCourses().add(course1);
        course1.getStudents().add(student1);
        course1.getStudents().add(student2);
        course1.getStudents().add(student1);
        studentDAO.save(student1);
        studentDAO.save(student2);

        // Tìm và hiển thị Person
        Person foundPerson = personDAO.find(person.getId());
        System.out.println("Found Person: " + foundPerson.getName());

        // Tìm và hiển thị Department
        Department foundDepartment = departmentDAO.find(department.getId());
        System.out.println("Found Department: " + foundDepartment.getName());

        // Tìm và hiển thị Student
        Student foundStudent = studentDAO.find(student1.getId());
        System.out.println("Found Student: " + foundStudent.getName());
    }
}