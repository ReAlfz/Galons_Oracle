package list;

import java.util.Scanner;

public class Galon {
    public static void main(String[] args){
        SideMethod side = new SideMethod();
        Scanner data = new Scanner(System.in);

        System.out.print("Input isi galon anda : ");
        side.setValue(data.nextInt());

        System.out.println("hasil isi galon anda adalah : " + side.getValue());
    }
}
