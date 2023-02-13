package com.sun;

class Encapsulate {
    private String name;
    private int id;
    private int age;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }
    
    public void display() {
    	System.out.println("student name:" + name +" " +"student id:" +id +" "+"student age:"+ age);
    }

    
}



