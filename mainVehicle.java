/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractMetod;

/**
 *
 * @author My PC
 */
public class mainVehicle {
   public static void main(String[] args){
       vehicle mobil = new car();
       vehicle sepeda = new bicycle();
       
       mobil.go();
       sepeda.go();
   } 
}
