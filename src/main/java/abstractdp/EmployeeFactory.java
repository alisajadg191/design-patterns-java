/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdp;

/**
 *
 * @author sali
 */
public class EmployeeFactory {
    
    // get employee
    
    public static Employee getEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();
    }
    
}
