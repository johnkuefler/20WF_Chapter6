/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class EmployeeDemo {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        
        Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        
        Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        
        System.out.println(emp1.getName() + ", " + emp1.getIdNumber() + ", " + emp1.getDepartment() + ", " + emp1.getPosition());
        System.out.println(emp2.getName() + ", " + emp2.getIdNumber() + ", " + emp2.getDepartment() + ", " + emp2.getPosition());
        System.out.println(emp3.getName() + ", " + emp3.getIdNumber() + ", " + emp3.getDepartment() + ", " + emp3.getPosition());

    }
}
