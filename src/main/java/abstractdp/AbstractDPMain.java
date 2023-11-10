/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdp;

/**
 *
 * @author sali
 */
public class AbstractDPMain {

    public static void main(String[] args) {

        // get android developer
        Employee androidEmp = EmployeeFactory.getEmployee(new AndroidDevFactory());
        androidEmp.name();
        
        Employee webDevEmp = EmployeeFactory.getEmployee(new WebDevFactory());
        webDevEmp.name();
        
        Employee managerEmp = EmployeeFactory.getEmployee(new ManagerFactory());
        managerEmp.name();
    }

}
