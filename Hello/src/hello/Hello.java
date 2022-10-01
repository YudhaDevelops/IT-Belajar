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
    public static int g(int n){
        if (n == 1) {
            return 2;
        }else{
            return 3 * g(n/2)+ g(n/2) + 5;
        }
    }
    public static void main(String[] args) {
        System.out.println(g(4));
    }
//        Scanner key = new Scanner(System.in);
//
//        double a, b, c, D, x1, x2;
//        Scanner dataKuadrat = new Scanner(System.in);
//        // Baca data koefisien persamaan dari keyboard
//        System.out.println(" Koefisien x2 (a) : ");
//        a = dataKuadrat.nextDouble();
//        System.out.println(" Koefisien x (b)  : ");
//        b = dataKuadrat.nextDouble();
//        System.out.println(" Konstanta (c)    : ");
//        c = dataKuadrat.nextDouble();
////         Hitung nilai D     
//        D = b* b - (4*a*c);
//
//        if (D < 0 || a == 0) {// tidak punya akar real
//            System.out.println("Tidak mempunyai akar nyata/real");
//        } else if (D == 0) {// akarnya sama
//            x1 = -b / (2 * a);
//            System.out.println("Akarnya tunggal yakni : " + x1);
//        }else if(a >= 0){
//            
//        } 
//        else {// akarnya dua berbeda
//            x1 = (-b + Math.sqrt(D)) / (2 * a);
//            x2 = (-b - Math.sqrt(D)) / (2 * a);
//            System.out.println("Akar pertama : " + x1);
//            System.out.println("Akar kedua   : " + x2);
//        }
//    }

//        System.out.println("## Program Java Mencari Akar Persamaan Kuadrat ##");
//        System.out.println("=================================================");
//        System.out.println();
//
//        int a, b, c, D;
//        double x1, x2;
//
//        System.out.println("Format persamaan: ax^2 + bx + c = 0 ");
//        System.out.print("Input nilai a: ");
//        a = key.nextInt();
//        System.out.print("Input nilai b: ");
//        b = key.nextInt();
//        System.out.print("Input nilai c: ");
//        c = key.nextInt();
//
//        System.out.println();
//
//        D = (b * b) - (4 * a * c);
//        System.out.print("Diskriminan = " + D);
//
//        if (D > 0 || a == 0) {
//            System.out.println(" (Tidak punya akar)");
//
//            x1 = (-b + Math.sqrt(D)) / (2 * a);
//            x2 = (-b - Math.sqrt(D)) / (2 * a);
//
//            System.out.println("x1 = " + x1);
//            System.out.println("x2 = " + x2);
//        } else if (D == 0) {
//            System.out.println(" (akar real dan sama)");
//
//            x1 = x2 = (-b + Math.sqrt(D)) / (2 * a);
//
//            System.out.println("x1 = " + x1);
//            System.out.println("x2 = " + x2);
//        } else {
//            System.out.println(" (akar tidak real / imajiner)");
//        }
//
//    }
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
