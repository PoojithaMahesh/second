package onetomany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomany.dto.Company;
import onetomany.dto.Employee;

public class CompanyCont {
	public static void main(String[] args) {

		Company company = new Company();
		company.setId(1);
		company.setName("Tcs");
		company.setGst("tcs@123");
		Employee employee1 = new Employee();
		employee1.setId(101);
		employee1.setName("Mohammed");
		Employee employee2 = new Employee();
		employee2.setId(102);
		employee2.setName("AnanthKumar");

		List<Employee> list = new ArrayList<Employee>();
		list.add(employee1);
		list.add(employee2);

		company.setEmployees(list);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.find(Company.class, 1);

		EntityManagerFactory entityManagerFactory2 = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager2 = entityManagerFactory2.createEntityManager();
		entityManager2.find(Company.class, 1);
	}

}
