/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdp;

/**
 *
 * @author sali
 */
public class Manager implements Employee {

    @Override
    public String name() {
        System.out.println("i am a manager");
        return "MANAGER";
    }

    @Override
    public int salary() {
        return 75000;
    }
    
}
