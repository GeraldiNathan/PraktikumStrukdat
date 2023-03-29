package Modul1.Praktikum;

public class Segitiga<T extends Number> {
    private T alas;
    private T tinggi;

    public Segitiga(T alas, T tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getResultAsInt(){
        return (int) this.alas * (int) this.tinggi /2;
    }

    public double getResultAsDouble(){
        return (double) this.alas * (double) this.alas /2;
    }
}