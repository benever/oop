package second;

public class Shirt extends Clothes{
    public void dressWoman(Enumeration e, String s, double d) {
        super.size = e;
        super.color = s;
        super.price = d;
        super.verification = true;
    }
    public void dressMan(Enumeration e, String s, double d) {
        super.size = e;
        super.color = s;
        super.price = d;
        super.verification = false;
    }
}
