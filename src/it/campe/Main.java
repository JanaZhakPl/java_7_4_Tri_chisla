package it.campe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a == b && a == c)
            System.out.println(a + " " + b + " " + c);
        else if(a == b)
            System.out.println(a + " " + b);
        else if(a == c)
            System.out.println(a + " " + c);
        else if(b == c)
            System.out.println(b + " " + c);
    }
}
