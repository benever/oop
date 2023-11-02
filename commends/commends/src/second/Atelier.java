package second;

public class Atelier {
    public void dressWoman(Clothes[] clothes) {
        for (int i = 0; i < clothes.length; i++) {
            if(clothes[i].verification) {
                System.out.println(clothes[i].size);
                System.out.println(clothes[i].color);
                System.out.println(clothes[i].price);
                System.out.println();
            }
        }
    }
    public void dressMan(Clothes[] clothes) {
        for (int i = 0; i < clothes.length; i++) {
            if(!clothes[i].verification){
                System.out.println(clothes[i].size);
                System.out.println(clothes[i].color);
                System.out.println(clothes[i].price);
                System.out.println();
            }
        }
    }
}
