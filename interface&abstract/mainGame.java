/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author My PC
 */
public class mainGame {
    public static void main(String[] args){
        kasti Kasti1 = new kasti();
        futsal futsal1 = new futsal();
        
       Kasti1.lempar();
       Kasti1.tangkap();
       
       futsal1.tangkap();
       futsal1.tendang();
    }
}
