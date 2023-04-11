package Modul4;
import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String Scan;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Manda", "3H", "StrukturData", 20211037));
        mhs.put("2", new Mahasiswa("Mandi", "3B", "StrukturData", 20211033));
        mhs.put("3", new Mahasiswa("Mandu", "3C", "StrukturData", 20211035));

        System.out.println("Masukan ID: ");
        Scan = input.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("Data Mahasiswa :" + data.nama + ", Kelas : " + data.kelas
            + ", Matkul Praktikum : " + data.matkulPraktikum + ", Nim : " + data.nim);
        }
    }
}
