/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author LENOVO
 */
public class Latihan {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 6; i++) {
            for (j = 0; j <=6-i; j++) {
                System. out. print(" ");
            }
            for (j = 0; j <=(i*2)-1; j++) {
                System. out. print("*");
            }
            System. out. print(" ");
        }

    }
}
