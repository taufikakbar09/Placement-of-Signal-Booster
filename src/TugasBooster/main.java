package TugasBooster;

import java.util.Scanner;

public class main {
    public static void main(String [] args){
        Boosters x = new Boosters();
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan jumlah data : ");
        int y = in.nextInt();
        for(int i = 0; i < y; i++){
            System.out.println("Data ke " + (i+1) + " = ");
            x.insert(in.nextInt());
            x.place(x.root);
        }
        x.toString();
    }
}
