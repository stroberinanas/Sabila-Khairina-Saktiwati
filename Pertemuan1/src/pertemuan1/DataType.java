/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author LENOVO
 */
public class DataType {
    public static void main(String[] args) {
        byte b=1;
        short s=10;
        int i=100;
        long l=1000;
        char c='c';
        float f=19.93f;
        double d=19.9356;
        boolean t=true;
        final double PHI=3.14;
        
        System.out.println("Byte : "+b);
        System.out.println("Short : "+s);
        System.out.println("Int : "+i);
        
        i=010;
        System.out.println("Int: "+i+" ini adalah bilangan oktal");
        
        i=0xFF;
        System.out.println("Int : "+i+" ini adalah bilangan hexa");
        
    }
}
