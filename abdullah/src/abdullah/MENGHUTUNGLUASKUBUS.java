/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdullah;

/**
 *
 * @author ABDULLAH
 */import java.util.Scanner;
public class MENGHUTUNGLUASKUBUS {
    public static void main(String[] args) {
         double sisi,luaspermukaan,volume,luassisikubus;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Panjang Sisi: ");
        sisi=input.nextDouble();
        luassisikubus=sisi*sisi;
        System.out.println("luas sisi kubusnya adalah "+luassisikubus);
        luaspermukaan=6*luassisikubus;
        System.out.println("luas permukaannya: "+luaspermukaan);
        System.out.println("Mencari volume!!!");
        volume=sisi*sisi*sisi;
        System.out.print("volumenyass adalah: "+ volume);
        
    }
    
}
