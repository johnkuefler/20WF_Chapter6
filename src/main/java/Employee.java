/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    public Employee(String name, int id, String dep, String pos) {
        this.name = name;
        this.idNumber = id;
        this.department = dep;
        this.position = pos;
    }
    
    public Employee(String name, int id) {
        this.name = name;
        this.idNumber = id;
        this.department = "";
        this.position = "";
    }
    
    public Employee() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
}
