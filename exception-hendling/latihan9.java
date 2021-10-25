/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptingHendling;

/**
 *
 * @author My PC
 */
public class latihan9 {
    void validate(int age)throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("umur tidak valid");
        }else{
            System.out.println("anda cukup usia");
        }
    }
    public static void main (String[]args){
        latihan9 objk = new latihan9 ();
        objk.validate(8);
    }
}
