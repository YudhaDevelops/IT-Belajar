/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.Scanner;

/**
 *
 * @author bimab
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("## Program Java Mencari Akar Persamaan Kuadrat ##");
        System.out.println("=================================================");
        System.out.println();

        int a, b, c, D;
        double x1, x2;

        System.out.println("Format persamaan: ax^2 + bx + c = 0 ");
        System.out.print("Input nilai a: ");
        a = key.nextInt();
        System.out.print("Input nilai b: ");
        b = key.nextInt();
        System.out.print("Input nilai c: ");
        c = key.nextInt();

        System.out.println();

        D = (b * b) - (4 * a * c);
        System.out.print("Diskriminan = " + D);

        if (D > 0) {
            System.out.println(" (akar real dan berbeda)");

            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (D == 0) {
            System.out.println(" (akar real dan sama)");

            x1 = x2 = (-b + Math.sqrt(D)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println(" (akar tidak real / imajiner)");
        }

    }

//        double total, diskon, harga;
//        System.out.print("Masukkan Nama Barang Yang Di Beli : ");
//        String barang = key.next();
//        System.out.print("Masukkan Harga barang nya : ");
//        harga = key.nextDouble();
//        
//        if (harga > 100000) {
////            double diskon = ;
//            total = harga - (harga * 0.1);
//        }else{
//            total = harga;
//        }
//        System.out.println("Harga yang harus di bayar : " + total);
//        int tinggi, hasil;
//        float beratIdeal, meter;
//        
//        System.out.println("Menghitung berat badan ideal");
//        System.out.print("Tinggi Badan : ");
//        tinggi = key.nextInt();
//        hasil = tinggi - 100;
//        System.out.println("Berat Ideal : " + hasil);
//        System.out.println(a);
//        int x,y,b;
// 
//        b=3; //karna tidak ada deklarasi, tidak ada titik koma
//        x=4;
//        y=x+b; //karna a tidak di inisialisasi, aritmatika a dengan x tidak ada 
//        System.out.println("Hasil dari persamaan y adalah :"+y);
//        float a;
//        a = 3.12e2F;
//        System.out.println(a);
//        System.out.println("Hello World");
//        System.out.println("Hallo Nama Saya Yudha");
//        
//        System.out.print("Saya Anak Informatika");
//        System.out.print("Saya Dari Lampung");
//        System.out.println("Saya");
//}

}
