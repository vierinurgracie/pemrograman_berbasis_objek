/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptingHendling;

/**
 *
 * @author My PC
 */
public class latihan7 {
    void method1() throws ArithmeticException {
        throw new ArithmeticException("calculate error");
    }
    void method2() throws ArithmeticException{
        method1();
    }
    void method3 (){
        try{
            method2();
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception hendled");
        }
    }
    public static void main(String[] args){
        latihan7 obj = new latihan7();
        obj.method3();
        System.out.println("end of program");
    }
}
