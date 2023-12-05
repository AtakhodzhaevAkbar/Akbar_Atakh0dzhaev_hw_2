import java.util.Random;

public class Main {
    public static void main(String[] args) {
        test(23,10);
        test(generateRandomAge(),10);
        int variant1 = progulka(25,25);
        int variant2 = progulka(15,66);
        int variant3 = progulka(42,33);
        int variant4 = progulka(15,-20);
        int variant5 = progulka(43,21);
    }
    public static int progulka(int age, int temperature) {
        if (age>=20 && age<=45 && temperature>=-20 && temperature<=30) {
            System.out.println("Можно идти гулять");
        }
        else if (age<20 && temperature>=0 && temperature<=28){
            System.out.println("Можно идти гулять");
        }
        else if (age>=45 && temperature>=-10 && temperature<=25){
            System.out.println("Можно идти гулять");
        }
        else {
            System.out.println("Оставайтесь дома");
        }
        return age;
    }
    public static int generateRandomAge(){
        Random randomAge = new Random();
        return randomAge.nextInt(100) + 1;
    }
    public static void test(int age,int temperature){
        progulka(age, temperature);
    }
}