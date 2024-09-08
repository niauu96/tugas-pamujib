import java.util.Scanner;

public class PenilaianMahasiswa1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();

        String grade;

        if (nilai >= 85) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 55) {
            grade = "C";
        } else if (nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + grade);
    }
}
