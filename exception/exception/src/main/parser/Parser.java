package main.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;

public class Parser {
    private final ArrayList<String> arrayList = new ArrayList<>();

    public void parse(String path) throws FileNotFoundException {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                arrayList.add(scanner.nextLine());
            }
            scanner.close();
        }catch (FileNotFoundException e){
            System.err.println("Файл src/resourse/23_09_tasks.txt не найден");
            System.exit(1);
        }
    }


    public ArrayList<String> getArrayList() {return arrayList;}
}