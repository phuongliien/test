/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Triangles {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a: ");
        float a = s.nextFloat();
        System.out.println("Enter b: ");
        float b = s.nextFloat();
        System.out.println("Enter c: ");
        float c = s.nextFloat();
        int result = checkTriangle(a, b, c);
        if (result < 0) {
            System.out.println("this is not a triangle");
        } else {
            float p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            switch (result) {
                case 1:
                    System.out.println("this is deu tam giac");
                    break;
                case 2:
                    System.out.println("this is can tam giac");
                    break;
                default :
                    System.out.println("this is v tam giac");
                    break;
                    
            }
            System.out.println("P=" + (p * 2));
            System.out.println("S= "+area);
        }
    }

    public static int checkTriangle(float a, float b, float c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if ((a == b) && (a == c)) {
                return 1;
            }
            if ((a == b) || (a == c) || (b == c)) {
                return 2;
            }
            if ((a * a + b * b == c * c)) {
                return 3;
            }
            return 0;
        }
        return -1;
    }
}
