public class NilaiVariabel {
  public static void main(String[] args) {
    int w, x, y, z;
    x = 10;
    w = 17;

    y = 8 - x++;
    z = 8 - ++w;

    System.out.println("Nilai w: " + w);
    System.out.println("Nilai x: " + x);
    System.out.println("Nilai y: " + y);
    System.out.println("Nilai z: " + z);
  }
}
