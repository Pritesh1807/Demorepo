package com.sun;

public class Primenumber {
    static void prime(int n) {
        int i, m, f = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number");
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                System.out.println(n + "is a prime number");
            }
        }
    }

    public static void main(String[] args) {
        prime(73);
        prime(31);
        prime(41);

    }

}