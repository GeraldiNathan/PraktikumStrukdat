package Modul1.Praktikum;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kembali;
        do{
            System.out.println("Luas Segitiga");
            System.out.println("1.Integer \n2.Double");
            System.out.print("Masukan Pilihan :");

            int pilih = input.nextInt();
            System.out.print("Masukan Alas dan Tinggi : ");
            if(pilih == 1){
                int IntAlas = input.nextInt();
                int IntTinggi = input.nextInt();
                Segitiga<Integer> LuasTipeInt = new Segitiga<>(IntAlas, IntTinggi);
                System.out.println("Luas Segitiga Integer: "+ LuasTipeInt.getResultAsInt());
            } else if (pilih == 2) {
                double DblAlas = input.nextDouble();
                double DblTinggi = input.nextDouble();
                Segitiga<Double> LuasTipeDbl = new Segitiga<>(DblAlas,DblTinggi);
                System.out.println("Luas Segitiga Doubl" + LuasTipeDbl.getResultAsDouble());
            }
            System.out.println("Ingin Mengulang? 1/2");
            kembali = input.nextInt();
        }while(kembali ==1);
    }
}
