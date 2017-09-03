/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichadeclassesabstractastpc;

import java.util.ArrayList;
import visao.TelaPrincipal;

/**
 *
 * @author Toni Maunde
 */
public class Banco implements Imprimivel{
    private static int totalDeContas=0;
    private static int totalDeContasCorrentes=0;
    private static int totalDeContasPoupanca=0;
    private static double saldoTotal=0;
    private ArrayList<ContaBancaria> listaDeContas= new ArrayList<>();
    

    public void criarConta(){
        TelaPrincipal tela= new TelaPrincipal();
    }

    public void inserir(ContaBancaria conta){
        listaDeContas.add(conta);
    }

    public void remover(ContaBancaria conta){
        listaDeContas.remove(conta);
    }

    public ContaBancaria procurarConta(int numeroDaConta){
        int contador;
        for(contador=0; contador<listaDeContas.size();contador++){
            if(listaDeContas.get(contador).getNumeroDaConta()==numeroDaConta) return listaDeContas.get(contador);
        }
        return null;
    }

    @Override
    public void mostralDados() {
//        int contador;
//        for(contador=0; contador<listaDeContas.size();contador++){
//            listaDeContas.get(contador).toString();
//        }
    }
}
