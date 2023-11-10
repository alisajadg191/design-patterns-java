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
public class WebDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.print("getting web developer salary: ");
        return 40000;
    }
    
}
