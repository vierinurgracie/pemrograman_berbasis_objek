/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptingHendling;

/**
 *
 * @author My PC
 */
public class arrayIndexOfBounds {
    public static void main(String args[]){
        int a[]= new int[5];
        try{
        a[5]=100;    
        }catch(Exception e){
            System.out.println("anda mengakses index yang melewati batas");
        }
        
    }
}
