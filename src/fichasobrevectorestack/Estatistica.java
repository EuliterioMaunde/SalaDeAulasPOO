/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichasobrevectorestack;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author Toni Maunde
 * Esta classe contem metodos que calculam os valores de tendencia central como Media, Moda e Mediana em vectores 
 */
public class Estatistica {
    
        
    /**
     * 
     * @param vector Este vector e do tipo Double
     * @return O metodo retorna um double que corresponde a media
     * 
     * O metodo calcularMedia recebe um Vector do tipo double e calcula a media aritmetica do mesmo
     */
        public double calcularMedia(Vector<Double> vector){
            int i;
            double temp=0;
            for(i=0; i<vector.size();i++){
                temp=temp+vector.get(i);
            }
            return temp/(i-1);
        }
        
        
        /**
         * 
         * @param vector Este vector e do tipo Double
         * @return O metodo retorna um double que corresponde a media
         * O metodo calcularModa recebe um Vector do tipo double e verifica a moda no vector
         */
        public double calcularModa(Vector<Double> vector){
            int i, j, contador=0;
            double moda;
            
            
            for(i=0; i<vector.size();i++){
                for(j=0; j<vector.size(); j++){
                    if(vector.get(i)==vector.get(j)) contador++;
                }
                if(contador>vector.size()/2) return vector.get(i);
            }
            
            return -1;//A moda e AMODAL
        }
        
        /**
         * 
         * @param vector Este vector e do tipo Double
         * @return O metodo retorna um double que corresponde a media
         * O metodo calcularMediana recebe um Vector do tipo double e calcula o valor da mediana dos valores contidos no Vector
         * 
         */
        
       
        public double calcularMediana(Vector<Double> vector){   
         vector.sort((o1, o2) -> {
                return (01>02) ? 1 : (01==02) ? 0 : -1;
            });
            
            if(vector.size()%2==0) return (vector.get(vector.size()-1/2)+ vector.get(vector.size()/2))/2;
            else return vector.get((vector.size()/2)); //size() vs capacity();
        }
    
        public static void main(String[] args) {
            
        
    }
}
