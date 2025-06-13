package com.team.greeting;

public class App {
    public static String greeting(String nombre) {
        return "¡Hello, " + nombre + "!";
    }
    public static void main(String[] args) {
        System.out.println(greeting("DevOps"));
    }
}