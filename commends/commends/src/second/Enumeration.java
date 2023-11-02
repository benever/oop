package second;

public enum Enumeration {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);
    private int euroSize;
    Enumeration(int numVal){
        this.euroSize = numVal;
    }
    public static String getDescription(Enumeration e){
        if(e == XXS){
            return "Детский размер";

        }
        return "Взрослый размер";
    }
}
