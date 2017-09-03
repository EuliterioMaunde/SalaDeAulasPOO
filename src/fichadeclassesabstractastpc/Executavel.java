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
public class Executavel {
    public static void main(String[] args) {
        ContaBancaria um= new ContaCorrente();
        ContaBancaria dois= new ContaPoupanca();

        um.setSaldo(2000);
        dois.setSaldo(2000);
        dois.sacar(3000);

        //new Relatorio().gerarRelatório(um); MISSING
    }
}
