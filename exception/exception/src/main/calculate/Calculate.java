package main.calculate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Calculate {

    public static void yr1(String text){
        String str = text.replaceAll("[А-Яа-я: ]","");
        String regex = "(?<=op)|(?=op)|=".replace("op", "[-+*/()]");
        String[] s = str.split(regex);
        String l="";
        System.out.println(str);

        String pattern1 = "^\\s*([-?a-zA-Z]+)\\s*(\\*|/|\\+|-)\\s*([-?0-9]+)\\s*=\\s*(-?[0-9]+)\\s*$";
        String pattern2 = "^\\s*([-?0-9]+)\\s*(\\*|/|\\+|-)\\s*([-?a-zA-Z]+)\\s*=\\s*(-?[0-9]+)\\s*$";
        String pattern3 = "^\\s*([-?0-9]+)\\s*(\\*|/|\\+|-)\\s*([-?0-9]+)\\s*=\\s*([-?a-zA-Z]+)\\s*$";

        double temp = 0, a = 1,b=0;
        if (str.matches(pattern1) || str.matches(pattern2) || str.matches(pattern3)) {
            if(s[0].equals("-")) {
                a = 2;
            }
            if(s[(int)a+1].equals("-")) {
                b=1;
            }
            if(str.matches(pattern1)){
                l = s[(int)a-1];
                switch (s[(int) a]){
                    case "*":
                        if(b==1){
                            if(s[(int) a+2] == s[s.length-2]){
                                temp = -1*Double.parseDouble(s[s.length-1])/Double.parseDouble(s[(int) a+2]);
                                break;
                            }
                            else{
                                temp = Double.parseDouble(s[s.length-1])/Double.parseDouble(s[(int) a+2]);
                                break;
                            }
                        }
                        else{
                            if(s[(int) a+1] == s[s.length-2]){
                                temp = Double.parseDouble(s[s.length-1])/Double.parseDouble(s[(int) a+1]);
                                break;
                            }
                            else{
                                temp = -1*Double.parseDouble(s[s.length-1])/Double.parseDouble(s[(int) a+1]);
                                break;
                            }
                        }

                    case "/":
                        if(s[(int) a+1] == s[s.length-2]){
                            temp = Double.parseDouble(s[s.length-1])*Double.parseDouble(s[(int) a+1]);
                            break;
                        }
                        else{
                            temp = -1*Double.parseDouble(s[s.length-1])*Double.parseDouble(s[(int) a+1]);
                            break;
                        }
                    case "+":
                        if(s[(int) a+1] == s[s.length-2]){
                            temp = Double.parseDouble(s[s.length-1])-Double.parseDouble(s[(int) a+1]);
                            break;
                        }
                        else{
                            temp = -1*Double.parseDouble(s[s.length-1])-Double.parseDouble(s[(int) a+1]);
                            break;
                        }
                    case "-":
                        if(s[(int) a+1] == s[s.length-2]){
                            temp = Double.parseDouble(s[s.length-1])+Double.parseDouble(s[(int) a+1]);
                            break;
                        }
                        else{
                            temp = -1*Double.parseDouble(s[s.length-1])+Double.parseDouble(s[(int) a+1]);
                            break;
                        }
                }
            }
            else if (str.matches(pattern2)){
                l = s[(int)a+(int)b+1];
                switch (s[(int) a]){
                    case "*":
                        if(s[(int) a+2] == s[s.length-1]){
                            temp = Double.parseDouble(s[s.length-1])/Double.parseDouble(s[(int) a-1]);
                            break;
                        }
                        else{
                            temp = -1*Double.parseDouble(s[s.length-1])/Double.parseDouble(s[(int) a-1]);
                            break;
                        }
                    case "/":
                        if(s[(int) a+1] == s[s.length-2]){
                            temp = Double.parseDouble(s[(int)a-1]) / Double.parseDouble(s[s.length-1]);
                            break;
                        }
                        else{
                            temp = -1*Double.parseDouble(s[s.length-1])*Double.parseDouble(s[(int) a+1]);
                            break;
                        }
                    case "+":
                        if(s[(int) a+1] == s[s.length-2]){
                            temp = Double.parseDouble(s[s.length-1])-Double.parseDouble(s[(int) a+1]);
                            break;
                        }
                        else{
                            temp = -1*Double.parseDouble(s[s.length-1])-Double.parseDouble(s[(int) a+1]);
                            break;
                        }
                    case "-":
                        if(s[(int) a+1] == s[s.length-2]){
                            temp = Double.parseDouble(s[s.length-1])+Double.parseDouble(s[(int) a+1]);
                            break;
                        }
                        else{
                            temp = -1*Double.parseDouble(s[s.length-1])+Double.parseDouble(s[(int) a+1]);
                            break;
                        }
                }
            }
            else{
                l=s[s.length-1];
                a = 0;
                b = 0;
                if(s[0].equals("-")){
                    a = 1;
                }
                if(s[2+(int)a].equals("-")){
                    b = 1;
                }
                if(s[1+(int)a].equals("*")){
                    temp = Double.parseDouble(s[(int)a]) * Double.parseDouble(s[2+(int)a+(int)b]);
                    if(b==1){
                        temp*=-1;
                    }
                    if(a==1){
                        temp*=-1;
                    }
                }
                else if(s[1+(int)a].equals("/")){
                    temp = Double.parseDouble(s[0+(int)a]) / Double.parseDouble(s[2+(int)a+(int)b]);
                    if(b==1) {
                        temp *= -1;
                    }
                    if(a==1){
                        temp*=-1;
                    }
                }
                else if(s[1+(int)a].equals("+")){
                    if(s[0].equals("-")){
                        temp = -1*Double.parseDouble(s[0+(int)a]) + Double.parseDouble(s[2+(int)a+(int)b]);
                    }
                }
                else if(s[1+(int)a].equals("-")){
                    if(s[0].equals("-")){
                        temp = -1*Double.parseDouble(s[0+(int)a]) - Double.parseDouble(s[2+(int)a+(int)b]);
                    }
                }
                if(s[3+(int)a+(int)b].equals("-")){
                    temp = -1*temp;
                }
                System.out.println(l + " = " + temp);
                b=-1;
            }
        } else {
            System.out.println("Неверный формат");
        }
        if(a==2){
            temp = -1*temp;
        }
        if(b!=-1){
            System.out.println(l + " = " + temp);

        }
    }

    public static void yr2(String text){
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        double temp = 0;
        String str = text.replaceAll("[А-Яа-я: ]","");
        System.out.println(str);
        String regex = "(?<=op)|(?=op)|=".replace("op", "[-+*/()]");
        String[] s = str.split(regex);
        for (int i = 0; i < s.length; i++) {
            switch (s[i]){
                case "*":
                    temp = multiplication(Double.parseDouble(s[i-1]),Double.parseDouble(s[i+1]));
                    arrayList.add(String.valueOf(temp));
                    i++;
                    break;
                case "/":
                    temp = division(Double.parseDouble(s[i-1]),Double.parseDouble(s[i+1]));
                    arrayList.add(String.valueOf(temp));
                    arrayList.add("/");
                    i++;
                    break;
                default:
                    if(i==s.length-1){
                        arrayList.add(s[i]);
                    }
                    else{
                        if(!s[i+1].equals("*") && !s[i+1].equals("/")){
                            arrayList.add(s[i]);
                        }
                    }

            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if(i==0){
                arrayList2.add(arrayList.get(0));
            }
            if(i%2==1 && arrayList.get(i).equals("+")){
                arrayList2.add(arrayList.get(i+1));
            }
            else if (i%2==1 && arrayList.get(i).equals("-")){
                arrayList2.add(String.valueOf((-1*Double.parseDouble(arrayList.get(i+1)))));
            }
        }
        temp = sum(arrayList2);
        System.out.println(str + "=" + temp);
    }
    public static void yr3(String text) {
        double a=0,b=0,c=0;
        String str = text.replaceAll("[А-Яа-я: ]","");
        String regex = "(?<=op)|(?=op)|=".replace("op", "[-+*/()]");
        String[] s = str.split(regex);
        System.out.println(str);
        Pattern pattern;
        Matcher matcher;
        pattern = Pattern.compile("[0-9]");
        matcher = pattern.matcher(String.valueOf(str.charAt(0)));


        if(matcher.find()){
            if(s[0].equals("-")){
                a = -1*Double.parseDouble(String.valueOf(s[1]));
                if(s[0].equals("-")){
                    b = -1*Double.parseDouble(String.valueOf(s[5]));
                }
                else {
                    b = Double.parseDouble(String.valueOf(s[5]));
                }
                if(s[8].equals("-")){
                    c = -1*Double.parseDouble(String.valueOf(s[9]));
                }
                else {
                    c = Double.parseDouble(String.valueOf(s[9]));
                }
            }
            else{
                a = Double.parseDouble(String.valueOf(s[0]));
                if(s[3].equals("-")){
                    b = -1*Double.parseDouble(String.valueOf(s[4]));
                }
                else {
                    b = Double.parseDouble(String.valueOf(s[4]));
                }
                if(s[7].equals("-")){
                    c = -1*Double.parseDouble(String.valueOf(s[8]));
                }
                else {
                    c = Double.parseDouble(String.valueOf(s[8]));
                }
            }

        }

        else{
            if(s[0].equals("-")){
                a = -1;
                if(s[2].equals("-")){
                    b = -1*Double.parseDouble(String.valueOf(s[3]));
                }
                else {
                    b = Double.parseDouble(String.valueOf(s[3]));
                }
                if(s[6].equals("-")){
                    c = -1*Double.parseDouble(String.valueOf(s[7]));
                }
                else {
                    c = Double.parseDouble(String.valueOf(s[7]));
                }
            }
            else{
                a = 1;
                if(s[1].equals("-")){
                    b = -1*Double.parseDouble(String.valueOf(s[2]));
                }
                else {
                    b = Double.parseDouble(String.valueOf(s[2]));
                }
                if(s[5].equals("-")){
                    c = -1*Double.parseDouble(String.valueOf(s[6]));
                }
                else {
                    c = Double.parseDouble(String.valueOf(s[6]));
                }
            }
        }
        double finalB = b;
        double finalA = a;
        double finalC = c;
        Function<Double, Double> discriminant = (coef) -> Math.pow(finalB, 2) - 4 * finalA * finalC;
        double D = discriminant.apply(a);
        if(D<0){
            System.out.println("Решений нет");
        } else if (D==0) {
            double temp = (-b)/(2*a);
            System.out.println("x = " + temp);
        }
        else{
            double temp = (-b+Math.pow(D,0.5))/(2*a);
            System.out.println("x1 = " + temp);

            temp = (-b-Math.pow(D,0.5))/(2*a);
            System.out.println("x2 = " + temp);
        }
    }

    public static double sum(ArrayList<String> arrayList){
        double x = 0;
        for (String a: arrayList) {
            x += Double.parseDouble(a);
        }
        return Math.round(x*1000.0)/1000.0;
    }
    public static double difference(double... args){
        double x = args[0];
        for (double a:args) {
            x -= a;
        }
        x += args[0];
        return Math.round(x*1000.0)/1000.0;
    }
    public static double multiplication(double... args){
        double x = 1;
        for (double a:args) {
            x*=a;
        }
        return Math.round(x*1000.0)/1000.0;
    }
    public static double division(double... args){
        double x = args[0];
        int i=0;
        for (double a:args) {
            if (a==0 && i!=0)
            {
                throw new ArithmeticException("Ошибка. Нельзя делить на 0");
            }
            if (a==0 && i==0)
            {
                return 0;
            }
            x/=a;
            i++;
        }
        x*=args[0];

        return Math.round(x*1000.0)/1000.0;
    }
}