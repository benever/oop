package adapter;

public class Main {
    public static void main(String[] args) {
        TotalLength totalLength = new TotalLength(1500);
        Length length = new TotalLengthAdapter(totalLength);
        System.out.println(length.getKm()+"km and "+length.getM() + "m");


        Length length1 = new Length(1,500);
        TotalLength totalLength1 = new LengthAdapter(length1);
        System.out.println(totalLength1.getTotalLength() + "m");
    }
}