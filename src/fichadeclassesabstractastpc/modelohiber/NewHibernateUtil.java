/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichadeclassesabstractastpc.modelohiber;

import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Toni Maunde
 */
public class NewHibernateUtil {
    
    private static final SessionFactory SESSAO;
    
    static{
        try{
            SESSAO = new AnnotationConfiguration().configure().buildSessionFactory();
            
        }catch(Throwable excepcao){
            System.err.println("A inicializacao da sesao falhou"+excepcao);
            throw new ExceptionInInitializerError(excepcao);
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return SESSAO;
    }
    
}
