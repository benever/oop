package main.decision;

import main.calculate.Calculate;
import main.parser.Parser;

import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static main.calculate.Calculate.*;

public class CompletingTasks {
    public static void main(String[] args) throws FileNotFoundException {
        Parser parser = new Parser();
        parser.parse("D:\\main\\project's\\oop\\exception\\src\\resourse\\23_09_tasks.txt");



        for (int i = 0; i < parser.getArrayList().size(); i++) {
            if(parser.getArrayList().get(i).contains("Решите уравнение")){
                System.out.println("===Task " + i + "===");
                System.out.print("Решите уравнение: ");
                yr1(parser.getArrayList().get(i));
            }
            else if(parser.getArrayList().get(i).contains("Найдите значение выражения")){
                System.out.println("===Task " + i + "===");
                System.out.print("Найдите значение выражения: ");
                yr2(parser.getArrayList().get(i));
            }
            else if(parser.getArrayList().get(i).contains("Найдите решение квадратного уравнения")){
                System.out.println("===Task " + i + "===");
                System.out.print("Найдите решение квадратного уравнения: ");
                yr3(parser.getArrayList().get(i));
            }
        }
    }
}