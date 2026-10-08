import java.util.Scanner;

public class Studikasus227 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = sc.nextLine();
        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = sc.nextInt();
        System.out.print("Peringkat juara : ");
        int juara = sc.nextInt();
        System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
        int pendanaan = sc.nextInt();

         if (jumlahDokumen == 4) {
            if (jenis.equalsIgnoreCase("BELMAWA")
                    || jenis.equalsIgnoreCase("BAKORMA")
                    || jenis.equalsIgnoreCase("MANDIRI")) {
                if (juara >= 1 && juara <= 3) {
                    System.out.println("Status : Dokumen lengkap. Juara " + juara
                            + ", dana penghargaan DIBERIKAN.");
                } else {
                    System.out.println("Status : Dokumen lengkap, tetapi bukan Juara 1, 2, atau 3. "
                            + "Dana penghargaan tidak diberikan.");
                }
            }
        } else {
            int kurang = 4 - jumlahDokumen;
            System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang
                    + " dokumen). Dana penghargaan tidak diberikan.");
        }

        sc.close();
    }

}
