/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

/**
 *
 * @author leona
 */
public class Refrigerante extends Bebida {
    
    private String sabor;

    public Refrigerante(String nome, String marca, String sabor) {
        
        super(nome, marca);
        this.sabor = sabor;
    
    }
    
    public void r(){
    
        System.out.println("Refrigerante");
    
    }
    
    
    
}
