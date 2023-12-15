package adapter;

public class Length {
    private int km;
    private int m;

    public Length(int km,int m) {
        this.km = km;
        this.m = m;
    }

    public Length() {
    }

    public int getKm(){ return km; }
    public int getM(){ return m; }
}