/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptingHendling;

/**
 *
 * @author My PC
 */
public class latihan6 {
    public static void main(String[] args){
        try{
            throw new Exception ("kesalahan terjadi");
        }catch(Exception e){
            System.out.println(e);
        } 
    }
}
