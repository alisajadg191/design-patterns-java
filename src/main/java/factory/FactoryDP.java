/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import factory.Employee;

/**
 *
 * @author sali
 */
public class FactoryDP {
    
    public static void main(String[] args) {
        
        Employee androidEmp = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(androidEmp.salary());
        
        Employee webdevEmp = EmployeeFactory.getEmployee("WEB DEVELOPER");
        System.out.println(webdevEmp.salary());
    }
}
