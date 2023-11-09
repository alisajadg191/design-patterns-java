/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpatterns;

/**
 *
 * @author sali
 */
public class Singleton {

    // lazy way of creating singleton object
    private static Singleton singleton;

    // in order to make the constructor singleton, we have to make it private
    private Singleton() {

    }

    public static Singleton getSingleton() {

        // lazy initiliaztion - object will be created when you want it.
        if (singleton == null) {
            
            synchronized (Singleton.class) {
                singleton = new Singleton();    
            }
            
        }

        return singleton;
    }
    
    public static void main(String[] args) {
        
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println("hash code of an singleton1: " + singleton1.hashCode());
        
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println("hash code of an singleton2: " + singleton2.hashCode());
        
        System.out.println(EagerSingletonObject.getEagerSingletonObject().hashCode());
        System.out.println(EagerSingletonObject.getEagerSingletonObject().hashCode());
    }
}

class EagerSingletonObject {
    
    // eager way of creating singleton object
    private static EagerSingletonObject eager = new EagerSingletonObject();
    
    public static EagerSingletonObject getEagerSingletonObject() {
        return eager;
    }
}

/**
 * 1. make constructor private
 * 2. create object with the help of method
 * 3. create field to store private object 
 */
