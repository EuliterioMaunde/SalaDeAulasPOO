/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichadeclassesabstractastpc.modelohiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Toni Maunde
 */
public class TesteDeHibernate {
    public static void main(String[] args) {
        
        SessionFactory s= NewHiber.getSessionFactory();
        Session sessao = s.openSession();
        sessao.beginTransaction();
        
        Professor docente = new Professor();
        docente.setCadeira("POO");
        docente.setEstadoCivil("Casado");
        docente.setNome("Marco Cangela");
        docente.setDataDeNascimento(java.sql.Date.valueOf("1980-06-18"));
        
        sessao.save(docente);
        sessao.getTransaction().commit();
        sessao.close();
        s.close();
    }
    
}
