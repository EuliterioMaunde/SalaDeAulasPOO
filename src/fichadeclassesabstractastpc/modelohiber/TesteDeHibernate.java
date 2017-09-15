/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichadeclassesabstractastpc.modelohiber;

import java.sql.Date;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Toni Maunde
 */
public class TesteDeHibernate {
    
    private static void fecharSessao(Session sessao, SessionFactory s){
        sessao.getTransaction().commit();
        sessao.close();
        s.close();
    }
    
    public static void main(String[] args) {
        SessionFactory s= NewHiber.getSessionFactory();
        Session sessao = s.openSession();
        sessao.beginTransaction();
        
        int resposta;
        do{
            resposta=Integer.parseInt(JOptionPane.showInputDialog("1.Registar \n2.Pesquisar \n3.Apagar \n4.Actualizar \n5.Sair"));
            
            switch(resposta){
                case 1:{
                    String nome=JOptionPane.showInputDialog("Nome: ");
                    Date data= java.sql.Date.valueOf(JOptionPane.showInputDialog("Data de nascimento (Ano-Mes-Dia) "));
                    String cadeira=JOptionPane.showInputDialog("Cadeira: ");
                    String estadoCivil=JOptionPane.showInputDialog("Estado civil: ");
                    Professor docente= new Professor(nome, estadoCivil, cadeira, data);
                    sessao.save(docente);
                }break;
                
                case 2:{
                    String nome=JOptionPane.showInputDialog("Nome a pesquisar: ");
                    
                    
                }break;
                
                case 3:{
                    
                }break;
                
                case 4:{
                    
                }break;
                
                case 5:{
                    fecharSessao(sessao, s);
                    System.exit(0);
                }
            }
        }while(resposta!=100);
        
        
        
        
//        Professor docente = new Professor();
//        docente.setCadeira("POO");
//        docente.setEstadoCivil("Casado");
//        docente.setNome("Marco Cangela");
//        docente.setDataDeNascimento(java.sql.Date.valueOf("1980-06-18"));
//        
//        Professor docentee = new Professor();
//        docentee.setCadeira("EDA");
//        docentee.setDataDeNascimento(java.sql.Date.valueOf("1981-01-01"));
//        docentee.setEstadoCivil("Casado");
//        docentee.setNome("Herquiloide Hele");
        
        //Adicionando um professor a tabela de professores
//        sessao.save(docente);
//        sessao.save(docentee);
        
    }
    
}
