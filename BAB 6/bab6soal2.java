import java.util.Scanner;

public class PenilaianMahasiswa2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();

        String grade;
        String keterangan;

        if (nilai >= 85) {
            grade = "A";
            keterangan = "Lulus";
        } else if (nilai >= 70) {
            grade = "B";
            keterangan = "Lulus";
        } else if (nilai >= 55) {
            grade = "C";
            keterangan = "Lulus Bersyarat";
        } else if (nilai >= 40) {
            grade = "D";
            keterangan = "Tidak Lulus";
        } else {
            grade = "E";
            keterangan = "Gagal";
        }

        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }
}
