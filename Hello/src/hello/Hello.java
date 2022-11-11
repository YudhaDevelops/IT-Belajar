package hello;
import java.util.Scanner;
public class Hello {
    public static int g(int n){
        if (n == 1) {
            return 2;
        }else{
            return 3 * g(n/2)+ g(n/2) + 5;
        }
    }
    public static void main(String[] args) {
//        for (int i = 5; i < 100; i+=5) {
//            System.out.println("i = " + i);
//        }
        
//        int angka[] = {5,19,30,48,38};
//        System.out.print("Data dari depan: ");
//        for (int i = 0; i < angka.length; i++) {
//            System.out.print(angka[i] + ",");
//        }
//        System.out.println("");
//        System.out.print("Data dari belakang : ");
//        for (int i = angka.length - 1; i >= 0; i--) {
//            System.out.print(angka[i] + ",");
//        }
        Scanner c = new Scanner(System.in);
        System.out.print("Masukan angka yang ingin di cari : ");
        int b = c.nextInt();
        int temp = -1;
        
        int A[] = {2,7,3,9,4,1,34,25,76,80,90,54,21,78};
        for (int i = 0; i < A.length; i++) {
            if (b == A[i]) {
                temp = i;
            }
        }
        if (temp == -1) {
            System.out.println("Data " + b +" tidak ada di dalam array");
        }else{
            System.out.println("Data " + b + " terdapat di index ke- " + temp);
        }
//        System.out.println(g(4));
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
