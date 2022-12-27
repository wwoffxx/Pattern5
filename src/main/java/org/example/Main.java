package org.example;

public class Main {
    public static void main(String[] args) {
        oAccess objectAccess = new Proxy("D:/path to the file","admin");
        objectAccess.access();
    }
}