/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cetaknbintang;

/**
 *
 * @author User
 */

import java.util.Scanner;
public class CetakNBintang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca nilai N
        int n = scanner.nextInt();

        // Mencetak pola berdasarkan nilai N
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }  
}
