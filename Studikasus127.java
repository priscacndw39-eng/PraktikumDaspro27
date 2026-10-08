import java.util.Scanner;

public class Studikasus127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int hargaPerCup = 1800;
        int totalHarga;
        int diskon;
        int totalBayar;
        int kembalian;
        int kurang;

        System.out.print("masukkan jumlah cup");
        int jumlahCUP = sc.nextInt();
        System.out.print("masukkan jumlah uang yang dibayarkan");
        int uangBayar = sc.nextInt();

        totalHarga = jumlahCUP * hargaPerCup;
        diskon = 0;

        if (totalHarga>100000) {
            diskon = totalHarga * 10/100;
         } 
            totalBayar = totalHarga - diskon;
         

        
         System.out.println("Total Harga: "+ totalHarga);
         System.out.println("Diskon: "+ diskon);
         System.out.println("Total Bayar: "+ totalBayar);

         if (uangBayar>= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian: "+ kembalian);
         } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp: "+ kurang);
         }
         sc.close();


       

    }
}
