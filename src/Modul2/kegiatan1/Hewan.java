package Modul2.kegiatan1;

import java.util.ArrayList;
import java.util.List;

public class Hewan {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>(List.of("Angsa", "Bebek", "cicak", "Domba", "Elang", "Gajah", "Badak", "Bebek"));
        int jmlbebek = 0;

        System.out.println("== Step 1 ==");
        System.out.println("Hewan: " +hewan);

        System.out.println("\n== Step 2==");
        for (int i = 0; i < hewan.size(); i++){
            if(hewan.get(i).equals("Bebek")) {
                jmlbebek++;
                System.out.println("Bebek ada di index ke-"+i);
            }
        }

        System.out.println("\n== Step 3 ==");
        hewan.remove("Bebek");
        System.out.println("Hewan: " +hewan);

        System.out.println("\n == Step 4 ==");
        System.out.println("Hewan index ke-0: "+hewan.get(0));
        System.out.println("Hewan index ke-2: "+hewan.get(2));

        System.out.println("\n== Step 5 ==");
        hewan.remove(0);
        System.out.println("Hewan: " +hewan);
        hewan.set(0, "Ular");
        hewan.add(2, "Itik");
        System.out.println("Update: " +hewan);

        System.out.println("\n== Step 6 ==");
        hewan.subList(2, 5).clear();
        System.out.println("Hewan: " +hewan);

        System.out.println("\n== Step 7 ==");
        System.out.println("Elemen Pertama: "+ hewan.get(0));
        System.out.println("Elemen Terakhir: "+ hewan.get(hewan.size()-1));

        System.out.println("\n== Step 8 ==");
        System.out.println("Total Elemen Pada ArrayList: "+hewan.size());

        System.out.println("\n== Step 9 ==");
        System.out.println("Badak berada pada index ke-"+hewan.indexOf("Badak"));
        }
    }
