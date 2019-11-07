/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan53;

/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class Tester {
    private static String name;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        name = rabbit.getName();
        
        System.out.println("Hello, His name is " +name);
        System.out.println(name+" is vegetarian? " +rabbit.isVegetarian());
        System.out.println(name+ " eats " +rabbit.getEats());
        System.out.println(name+ " has " +rabbit.getNoOfLegs()+ " legs");
        System.out.println(name+" color is "+rabbit.getColor());
        
    }
    
}
