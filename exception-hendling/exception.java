/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptingHendling;

/**
 *
 * @author My PC
 */
public class exception {
    public static void main(String args[]){
        int bil = 10;
       try{
           System.out.println(bil / 0);
       }catch(Exception e){
           System.out.println("ada error yang terjadi");
       }
    }
}
