package Modul2.latihanPrak;

import java.util.ArrayList;
import java.util.List;

public class latihan1 {
    static ArrayList<String> namaHewan = new ArrayList<>(List.of("Sapi", "Kelinci", "Kambing", "Unta", "Domba"));
    static ArrayList<String> deleteHewan = new ArrayList<>(List.of("Kelinci", "Kambing", "Unta"));

    public static void main(String[] args) {
        System.out.println("Hewan :" + namaHewan);
        System.out.println("Hewan yang dihapus :");
        System.out.println(deleteHewan);

        for (String hapushewan: deleteHewan){
            namaHewan.remove(hapushewan);
        }

        System.out.println("Output hewan :");
        System.out.println(namaHewan);
    }
}
