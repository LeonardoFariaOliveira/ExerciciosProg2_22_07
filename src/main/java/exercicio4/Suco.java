/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

/**
 *
 * @author leona
 */
public class Suco extends Bebida {
    
    private String fruta;

    public Suco(String nome, String marca, String fruta) {
        
        super(nome, marca);
        this.fruta = fruta;
        
    }
    
    
    public void s(){
    
        System.out.println("Suco");
    
    }
    
}
