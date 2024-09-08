import java.util.Scanner;

public class DataKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Silakan masukkan nama lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("Silakan masukkan alamat lengkap: ");
        String tempatTinggal = input.nextLine();

        System.out.print("Silakan masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Silakan masukkan jumlah gaji (angka saja): ");
        double jumlahGaji = input.nextDouble();

        System.out.println("\nInformasi Karyawan:");
        System.out.println("Nama lengkap  : " + namaLengkap);
        System.out.println("Alamat        : " + tempatTinggal);
        System.out.println("Umur          : " + umur + " tahun");
        System.out.printf("Gaji          : Rp %.2f%n", jumlahGaji);
    }
}
