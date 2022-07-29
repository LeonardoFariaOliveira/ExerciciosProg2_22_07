/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio5;

/**
 *
 * @author leona
 */
public abstract class Jogador implements Comparable {
    
  
    private String nome;
    private int pontuacao;
  

    public int compareTo(Jogador j) {
        
        if (this.pontuacao < j.pontuacao) {
            return -1;
        }
        if (this.pontuacao > j.pontuacao) {
            return 1;
        }
        return 0;
    
    
    }

 

    
}
