package com.epam.rd.autotasks.meetanagent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int password = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        //put you code here
        Scanner scanner = new Scanner(System.in);
        checkPass(scanner.nextInt());
    }

    public static void checkPass(int password){
        if (password == MeetAnAgent.password){
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }

    }
}
