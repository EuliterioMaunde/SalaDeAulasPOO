/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichasobrevectorestack;

import java.util.Vector;

/**
 *
 * @author Toni Maunde & Assane Mateus
 */
public class Exercicio4 {
    
    /**
     * 
     * @param vector0 um dos vectores booleanos a ser comparado
     * @param vector1 segundo vector booleano a ser comparado com o primeiro
     * @return vai retornar true se os vectores forem iguais e false caso contrario
     * 
     * O metodo abaixo e booleano e recebe dois vectores do tipo booleano e compara os dois retornando TRUE se forem iguais e FALSE se forem diferentes
     * Dois vectores sao considerados iguais se tiverem o mesmo tamanho e tiverem o mesmo valor logico em cada posicao
     */
    public boolean compararVectores( Vector<Boolean> vector0, Vector<Boolean> vector1){
        
        if(vector0.size()==vector1.size()){
            int contador=0;
            int i;
            for(i=0; i<vector0.size(); i++){
                if (vector0.get(i)==vector1.get(i)) contador++;
            }
            
            if(contador==vector0.size()-1) return true;
            else return false;
        } else return false;
    }
    
}
