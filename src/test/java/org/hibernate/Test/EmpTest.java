package org.hibernate.Test;

import org.hibernate.Dao.EmployeeDao;
import org.hibernate.model.Employee;

public class EmpTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Vaishnavi");
        e.setEmail("Vaishu24@gmail.com");
        e.setSalary(25000);
        e.setAddress("Pune");

        EmployeeDao dao = new EmployeeDao();
        dao.CreateEmployee(e);
        System.out.printf("Successfully Created Employee");


    }
}
