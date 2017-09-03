/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichadeclassesabstractastpc;

/**
 *
 * @author Toni Maunde
 */
public class ContaPoupanca extends ContaBancaria implements Imprimivel{
    private final double LIMITE=-1000;

    @Override
    public boolean sacar(double valor) {
        if(this.getSaldo()-valor<-LIMITE) return false;
        
        this.setSaldo(this.getSaldo()-valor);
        return true;
    }

    @Override
    public boolean depositar(double valor) {
        if(valor<=0) return false;
        
        this.setSaldo(this.getSaldo()+valor);
        return true;
    }

    @Override
    public boolean transferir(double valor, ContaBancaria contaAlvo) {
        if(valor<=0) return false;
        
        this.sacar(valor);
        contaAlvo.depositar(valor);
        return true;
    }

    @Override
    public void mostralDados() {
        System.out.println("Saldo: "+super.getSaldo()+", Numero da Conta: "+super.getNumeroDaConta()+", Valor limite: "+LIMITE);
    }
}
