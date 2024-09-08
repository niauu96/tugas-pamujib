package com.mycompany.bab11soal1;

public class Bab11Soal1 {

    public static void main(String[] args) {
       Karyawan karyawan1 = new Karyawan();
        karyawan1.setKaryawan(0001, "nia", "B", "dokter", 9000000);
        karyawan1.getKaryawan();
        
        System.out.println("----------------------------");
        
        Karyawan karyawan2 = new Karyawan();
        karyawan2.setKaryawan(0002, "david", "A", "perawat", 2000000);
        karyawan2.getKaryawan();
        
    }
}
