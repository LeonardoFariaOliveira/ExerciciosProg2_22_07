/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

/**
 *
 * @author leona
 */
public class BebidaAlcoolica extends Bebida {
    
    private double teorAlcoolico;

    public BebidaAlcoolica(String nome, String marca, double teorAlcoolico) {
        
        super(nome, marca);
        this.teorAlcoolico = teorAlcoolico;
    
    }
    
    public void ba(){
    
        System.out.println("Bebida Alcoolica");
    
    }
    
    
    
}
