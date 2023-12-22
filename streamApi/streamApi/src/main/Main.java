package main;
//Блок 1 №1
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long countOfEvenNumbers = Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println("Количество парных чисел: " + countOfEvenNumbers);
    }
}

// №2
/*import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<String> surnames = Arrays.asList("Johnson", "Smith", "Jackson", "Johnsonson");
        List<String> surnamesWithJ = surnames.stream()
                .filter(surname -> surname.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println(surnamesWithJ);
    }
}*/
// №3
/*import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] strings = {"b", "a", "c", "f", "d", "e"};
        Arrays.stream(strings)
                .sorted()
                .forEach(System.out::println);
    }
}*/
//Блок 2 №1
/*import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(getEvenNumbersPro(list));
    }
    public static List<Integer> getEvenNumbersPro(List<Integer> list) {
        return list.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }
}*/
// №2
/*import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Egor", "Max", "Ivan", "Petr", "Patric", "");
        List<String> upperCaseNames = new ArrayList<>();
        for (String name : names) {
            if (!name.isEmpty()) {
                upperCaseNames.add(name.toUpperCase());
            }
        }
        System.out.println("Имена в верхнем регистре: " + upperCaseNames);
        char letter = 'P'; 
        int count = 0;
        for (String name : names) {
            if (!name.isEmpty() && name.charAt(0) == Character.toUpperCase(letter)) {
                count++;
            }
        }
        System.out.println("Количество имен, начинающихся с буквы " + letter + ": " + count);
    }
}*/