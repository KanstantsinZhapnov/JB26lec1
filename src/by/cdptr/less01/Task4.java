package by.cdptr.less01;

public class Task4 {
    public static void main(String[] args){
        double a, b; // два катета
        double c; // гипотенуза
        double s; // площадь
        a = 3; b = 4;
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        s = 0.5 * a * b;

        System.out.println("Катет1 = " + a + ", Катет2 = " + b);
        System.out.println("Гипотенуза = " + c + ", Площадь = " + s);

    }
}
