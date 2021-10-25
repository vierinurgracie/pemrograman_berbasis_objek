/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptingHendling;

/**
 *
 * @author My PC
 */
public class latihan4 {
      public static void main(String[] args){
        int bil = 10;
        String huruf[]= {"a","b","c"};
        try{
            System.out.println(huruf[3]);
            System.out.println(bil / 0);
        }catch(ArithmeticException ai){
            System.out.println("Error arimatik");
        }catch(ArrayIndexOutOfBoundsException n){
            System.out.println("ada error yang terjadi karena melebihi kapasitas array");
        }catch(Exception e){
            System.out.println("ada Error yang terjadi");
        }
    }
}
