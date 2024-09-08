import java.util.Scanner;

public class HitungLuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input nilai alas segitiga: ");
        double dasar = input.nextDouble();

        System.out.print("Input nilai tinggi segitiga: ");
        double tinggiSegitiga = input.nextDouble();

        double hasilLuas = (dasar * tinggiSegitiga) / 2;
        System.out.println("Hasil luas segitiga adalah: " + hasilLuas);
    }
}
