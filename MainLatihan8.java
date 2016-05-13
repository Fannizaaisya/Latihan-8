package latihan8;

import java.util.Scanner;

public class MainLatihan8 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nalai  : ");
        double x = input.nextDouble();
        Pemlat p = new Pemlat();
        if (x != (int) x){
            p.methodI1();
            
        }else{
            p.methodD1();
        }
        }
    }
    

