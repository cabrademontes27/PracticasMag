package org.example;

import java.util.Scanner;

public class ConsoleReaderInput implements InputReader {

    private final Scanner SCANNER = new Scanner(System.in);

    @Override
    public String readInput(String message) {
        System.out.println(message);
        return SCANNER.nextLine();
    }
}