/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptingHendling;

/**
 *
 * @author My PC
 */
public class latihan5 {
    public static void main(String[] args){
        int bil = 10;
        String huruf[]= {"a","b","c"};
        try{
            System.out.println(bil / 0);
        }catch(ArithmeticException ai){
            System.out.println("pesan dari getMessage():");
            System.out.println(ai.getMessage());
        }finally{
            System.out.println("blok finally akan selalu di eksekusi");
        }
    }
}
