package com.sun;

public class Encapsulation extends Encapsulate{
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setname("pritesh patel");
        obj.setage(23);
        obj.setid(110089516);
        obj.display();
    
    System.out.println("student name is:"+ obj.getname());
    System.out.println("Age of the student is:"+ obj.getage());
    System.out.println("Enrollment id of Pritesh patel:" +obj.getid());
    
    }
    
}


