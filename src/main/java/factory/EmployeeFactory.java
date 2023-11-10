/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import factory.Employee;
import factory.AndroidDeveloper;

/**
 *
 * @author sali
 */
public class EmployeeFactory {

    // get the employee
    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }
}
