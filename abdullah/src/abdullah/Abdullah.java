/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.util.Scanner;
package abdullah;
public class Abdullah {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       double p,l,t, luaspt, luas,volume;
        System.out.print("Ma%sukkan Nilai dari P: ");
        p=input.nextDouble();
        System.out.print("Masukkan Nilai dari L: ");
        l=input.nextDouble();
        System.out.println("Masukkan Nilai dari LuasPT: ");
        luaspt=input.nextDouble();
        t=luaspt/l;
        System.out.print("Tinggi dari balok adalah: "+t);
        volume= p*l*t;
        System.out.print("volume balok adalah: "+volume);
        luas = (2*p*l)+ (2*p*t)+(2*l*t);
        System.out.println("Luas balok adalah: "+luas);

        
    }
    
}
