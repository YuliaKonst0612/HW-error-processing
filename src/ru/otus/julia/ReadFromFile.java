package ru.otus.julia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static ru.otus.julia.FileExceptions.readFile;

public class ReadFromFile {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("n")) {
            fileWriter.write("String");
        } catch (IOException ex) {
        }
        try {
            readFile();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        } try  {
            readFile();

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Error", e);
        }

    }



    }
