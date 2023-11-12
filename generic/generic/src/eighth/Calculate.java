package eighth;

public class Calculate {
    public static <T> double sum(T obj1, T obj2){
        double obj = Double.parseDouble(obj1.toString()) + Double.parseDouble(obj2.toString());
        return obj;
    }

    public static <T> double multiply(T obj1, T obj2){
        double obj = Double.parseDouble(obj1.toString()) * Double.parseDouble(obj2.toString());
        return obj;
    }

    public static <T> double divide(T obj1, T obj2){
        if(!obj2.toString().equals("0")){
            double obj = Double.parseDouble(obj1.toString()) / Double.parseDouble(obj2.toString());
            return obj;
        }
        else{
            System.out.println("На 0 делить нельзя");
            return 0;
        }
    }

    public static <T> double subtraction(T obj1, T obj2){
        double obj = Double.parseDouble(obj1.toString()) - Double.parseDouble(obj2.toString());
        return obj;
    }
}