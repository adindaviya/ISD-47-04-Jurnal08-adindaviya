import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DatabaseMahasiswa database = new DatabaseMahasiswa();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Tambah Nilai");
            System.out.println("4. Liat Semua Nilai dan Rata-rata");
            System.out.println("5. Keluar");
            System.out.print("pilih: ");
            int pilihan = s.nextInt();
            s.nextLine();  

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = s.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = s.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = s.nextLine();
                    database.tambahMahasiswa(nim, kelas, nama);
                    break;
                case 2:
                    System.out.print("Masukkan NIM : ");
                    nim = s.nextLine();
                    database.hapusMahasiswa(nim);
                    break;
                case 3:
                    System.out.print("Masukkan NIM: ");
                    nim = s.nextLine();
                    System.out.print("Masukkan Nilai: ");
                    double nilai = s.nextDouble();
                    database.tambahNilai(nim, nilai);
                    break;
                case 4:
                    database.tampilkanSemuaNilaiDanRataRata();
                    break;
                case 5:
                    System.out.println("Keluar");
                    System.exit(0);
                default:
                    System.out.println("pilih yg bener");
            }
        }
    }
}