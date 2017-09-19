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
    
    
    
    private static void gravarDados(){
        SessionFactory s= NewHibernateUtil.getSessionFactory();
        Session sessao = s.openSession();
        sessao.beginTransaction();
        
        String nome=JOptionPane.showInputDialog("Nome: ");
        Date data= java.sql.Date.valueOf(JOptionPane.showInputDialog("Data de nascimento (Ano-Mes-Dia) "));
        String cadeira=JOptionPane.showInputDialog("Cadeira: ");
        String estadoCivil=JOptionPane.showInputDialog("Estado civil: ");
        Professor docente= new Professor(nome, estadoCivil, cadeira, data);
        sessao.save(docente);
        
        sessao.getTransaction().commit();
        sessao.close();
        s.close();
    }
    
    private static void actualizarNome(Long i){
        SessionFactory s= NewHibernateUtil.getSessionFactory();
        Session sessao = s.openSession();
        sessao.beginTransaction();
        
        Professor temp;
        temp=(Professor)sessao.get(Professor.class, i);
        temp.setNome("Alfredo");
        sessao.update(temp);
        
        
        sessao.getTransaction().commit();
        sessao.close();
        s.close();
        
    }
    
    private static void actualizarEstadoCivil(Long i, String estadoCivil){
        SessionFactory s= NewHibernateUtil.getSessionFactory();
        Session sessao = s.openSession();
        sessao.beginTransaction();
        
        Professor temp;
        temp=(Professor)sessao.get(Professor.class, i);
        temp.setEstadoCivil(estadoCivil);
        sessao.update(temp);
        
        
        sessao.getTransaction().commit();
        sessao.close();
        s.close();
        
    }
    
    private static void actualizarCadeira(Long i, String cadeira){
        SessionFactory s= NewHibernateUtil.getSessionFactory();
        Session sessao = s.openSession();
        sessao.beginTransaction();
        
        Professor temp;
        temp=(Professor)sessao.get(Professor.class, i);
        temp.setCadeira(cadeira);
        sessao.update(temp);
        
        
        sessao.getTransaction().commit();
        sessao.close();
        s.close();
        
    }
    
    private static void pesquisar(Long ID){
        SessionFactory s= NewHibernateUtil.getSessionFactory();
        Session sessao = s.openSession();
        sessao.beginTransaction();
        
        Professor temp;
        temp=(Professor)sessao.get(Professor.class, ID);
        JOptionPane.showMessageDialog(null, temp.toString());
        sessao.update(temp);
        
        
        sessao.getTransaction().commit();
        sessao.close();
        s.close();
    }
    
    private static void apagar(){
        SessionFactory s= NewHibernateUtil.getSessionFactory();
        Session sessao = s.openSession();
        sessao.beginTransaction();
        
        Professor temp;
        temp=(Professor)sessao.get(Professor.class, 2L);
        
        sessao.delete(temp);
        
        sessao.getTransaction().commit();
        sessao.close();
        s.close();
        
    }
    
    
    public static void main(String[] args) {
        
       
        int resposta;
        do{
            resposta=Integer.parseInt(JOptionPane.showInputDialog("1.Registar \n2.Pesquisar \n3.Actualizar \n4.Apagar \n5.Sair"));
            
            switch(resposta){
                case 1:{
                    gravarDados();
                }break;
                
                case 2:{
                    pesquisar(3L);
                    
                }break;
                
                case 3:{
                    //actualizar(3L);
                }break;
                
                case 4:{
                    apagar();
                    
                }break;
                
                case 5:{
                    System.exit(0);
                }break;
            }
        }while(resposta!=100);
        
        
    }
    
}
