package model.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="department_id	")
	private int id;
	@Column(name="department_name")
	private String name;

	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private List<Employee> employees  = new ArrayList<>();
	
	public Department() {
	}

    public Department(int id, String name, List<Employee> employees) {
		this.id = id;
		this.name = name;
		this.employees = employees;
	}

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




    public List<Employee> getEmployees() {
        return employees;
    }




    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}