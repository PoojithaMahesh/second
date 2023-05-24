package onetomany.dto;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Cacheable
public class Employee {
	@Id
private int id;
private String name;
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
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}

}
