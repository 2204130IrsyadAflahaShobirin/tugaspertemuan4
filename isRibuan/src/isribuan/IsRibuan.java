/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isribuan;

/**
 *
 * @author User
 */

import java.util.Scanner;
public class IsRibuan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input angka
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // cek kondisi (bilangan antara 1000 sampai 9999)
        boolean isRibuan1 = num1 >= 1000 && num1 <= 9999;
        boolean isRibuan2 = num2 >= 1000 && num2 <= 9999;
        boolean isRibuan3 = num3 >= 1000 && num3 <= 9999;

        // Cetak hasil
        if (isRibuan1) {
            System.out.println("Bilangan " + num1 + " adalah ribuan");
        } else {
            System.out.println("Bilangan " + num1 + " bukan ribuan");
        }

        if (isRibuan2) {
            System.out.println("Bilangan " + num2 + " adalah ribuan");
        } else {
            System.out.println("Bilangan " + num2 + " bukan ribuan");
        }

        if (isRibuan3) {
            System.out.println("Bilangan " + num3 + " adalah ribuan");
        } else {
            System.out.println("Bilangan " + num3 + " bukan ribuan");
        }
    }
    
}
