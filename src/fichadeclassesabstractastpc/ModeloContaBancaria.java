/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichadeclassesabstractastpc;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Toni Maunde
 */
@Entity
public class ModeloContaBancaria {
   @Column
    private int numeroDaConta;
   @Column
    private double saldo;
    
    
}
