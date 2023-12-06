import com.sun.source.tree.BreakTree;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        test(23,10);
        test(generateRandomAge(),10);
        System.out.println(progulka(25,44));
        System.out.println(progulka(21,10));
        System.out.println(progulka(40,55));
        System.out.println(progulka(13,23));
        System.out.println(progulka(45,-23));

    }
    public static String progulka(int age, int temperature) {
        if (((age>=20 && age<=45 && temperature>=-20 && temperature<=30)||
                (age<20 && temperature>=0 && temperature<=28)||
                (age>=45 && temperature>=-10 && temperature<=25))) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static int generateRandomAge(){
        Random randomAge = new Random();
        return randomAge.nextInt(100) + 1;
    }
    public static void test(int age,int temperature){
        System.out.println(progulka(age,temperature));
    }
}