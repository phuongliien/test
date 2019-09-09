/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author DELL
 */
public class DemoMath {
    public static void main(String[] args) {
       long n=Math.round(Math.random()*100);
       if(n<10)
            System.out.println("ket qua de : 0"+n);
       else
            System.out.println("ket qua de : "+n);
    }
}
