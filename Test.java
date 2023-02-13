package com.sun;

interface Showable {
    void show();

    interface Message {
        void msg();
    }
}

class Test implements Showable.Message {
    public void msg() {
        System.out.println("Hello nested interface");
    }

    public static void main(String args[]) {
        Showable.Message message = new Test();// upcasting here
        message.msg();
    }
}
