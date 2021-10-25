/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptingHendling;

/**
 *
 * @author My PC
 */
public class latihan8 {
    public static void main(String[] args){
    int a[]= {1,2,3};
    
    try{
    System.out.println(a[10]);
    }catch(ArrayIndexOutOfBoundsException n){
    System.out.println("terjadi kesalahan karena array melebihi kapasitas");
    }finally{
    System.out.println("proses try-catch selesai");
}
    }
}
