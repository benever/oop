package second;

import static second.Enumeration.getDescription;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[6];

        Shirt shirtMan = new Shirt();
        Shirt shirtWoman = new Shirt();
        shirtWoman.dressWoman(Enumeration.XXS, "Red", 1000);
        shirtMan.dressMan(Enumeration.XS, "Yellow", 400);

        Trousers trousersMan = new Trousers();
        Trousers trousersWoman = new Trousers();
        trousersWoman.dressWoman(Enumeration.M, "Black", 3);
        trousersMan.dressMan(Enumeration.XS, "Blue", 2);

        Skirt skirt = new Skirt();
        skirt.dressWoman(Enumeration.S,"White",122);

        Tie tie = new Tie();
        tie.dressMan(Enumeration.L,"Green",300);


        clothes[0] = shirtWoman;
        clothes[1] = shirtMan;
        clothes[2] = trousersMan;
        clothes[3] = trousersWoman;
        clothes[4] = skirt;
        clothes[5] = tie;

        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        System.out.println("\n");
        atelier.dressWoman(clothes);

        System.out.println(getDescription(clothes[0].size));
    }
}
