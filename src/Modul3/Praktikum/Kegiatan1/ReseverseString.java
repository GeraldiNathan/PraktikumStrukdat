package Modul3.Praktikum.Kegiatan1;
import java.util.*;

class ReseverseString {

    public static String kebalik(String str){
        char[] kebalik = new char[str.length()];
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }
        int i = 0;
        while (!stack.isEmpty()){
            kebalik[i++] = stack.pop();
        }
        return new String(kebalik);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Inputan : ");
        String str = input.next();
        System.out.println("Inputan Original : " + str);
        System.out.println("Inputan Kebalik : " + kebalik(str));
    }
}
