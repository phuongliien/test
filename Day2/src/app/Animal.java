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
public class Animal {
    public String name;
    protected String hitpoint;
    private float dame;
    int age;
    public static void show()
    {
        System.out.println("This is animal class");
    }
    public static void main(String...args) {
        show();
//        Animal a=new Animal();
//        a.show();
    }
}
