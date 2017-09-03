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
public class ContaCorrente extends ContaBancaria implements Imprimivel{
    private final double TAXADEOPERACAO=0.5;
    
    @Override
    public boolean sacar(double valor) {
        if(this.getSaldo()<=valor+TAXADEOPERACAO) {
            //System.out.println("O montante pretendido nao esta disponivel");
            return false;
        }

        this.setSaldo(this.getSaldo()-valor+TAXADEOPERACAO);
        return true;
    }

    @Override
    public boolean depositar(double valor) {
        if(valor<=0) return false;
        
        this.setSaldo(this.getSaldo()-TAXADEOPERACAO+valor);
        return true;
    }

    @Override
    public boolean transferir(double valor, ContaBancaria contaAlvo) {
        if(this.sacar(valor) && contaAlvo.depositar(valor)) {
            this.sacar(valor);
            contaAlvo.depositar(valor);
            return true;
        }
        
        else return false;

    }

    @Override
    public void mostralDados() {
        System.out.println("Saldo: "+super.getSaldo()+", Numero da Conta: "+super.getNumeroDaConta()+", Taxa de Operacao: "+TAXADEOPERACAO);
    }
}
