/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author My PC
 */
public class futsal implements bolaSepak,bolaTangan{

    @Override
    public void tangkap() {
        System.out.println("tangkap bola itu");
    }

    @Override
    public void tendang() {
        System.out.println("tendang bola itu");
    }

    @Override
    public void lempar() {
        System.out.println("lempar bola itu");
    }
    
}
