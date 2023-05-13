package com.jmfg.training.java10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class InferenciaUsos {

    public static void displayNames() {

        var clubList = List.of("Cruz Azul", "Tigres", "Rayados");

        for (var clubName : clubList) {
            System.out.println(clubName);
        }
    }

    public static void readFile() {

        try (var scanner = new Scanner(new File("src/main/java/com/jmfg/training/java10/test.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }


    public static void main(String[] args) {

        displayNames();
        readFile();

    }
}
