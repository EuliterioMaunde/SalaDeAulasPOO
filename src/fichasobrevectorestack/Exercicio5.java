/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichasobrevectorestack;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Toni Maunde
 * Classe que contem um metodo para ordenar um vector de doubles copiando os maiores valores e jogando na ultima posicao livre de outro vector
 */
public class Exercicio5 {
    
    
    public Vector<Double> ordenarVector(Vector<Double> vector){
        
        if(vector.size()<1) return vector;
        
        Vector<Double> vector1= new Vector<>();
        
        int i, j;
        int tamanho=vector.size();
        double maior=vector.get(0);
        for(j=0;j<vector.size(); j++){
            for(i=1;i<vector.size(); i++){
                if(maior<=vector.get(i)) maior=vector.get(i);
            }
            vector1.setElementAt(maior, tamanho-1);
            tamanho--;
        }
        
        return vector1;
    }
}
