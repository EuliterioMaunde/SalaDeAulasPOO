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
public abstract class ContaBancaria {
    private int numeroDaConta;
    private double saldo;

    public abstract boolean sacar(double valor);
    public abstract boolean depositar(double valor);
    public abstract boolean transferir(double valor, ContaBancaria contaAlvo);

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
