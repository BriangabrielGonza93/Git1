
package jpa.Daos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.ExemptionMechanismException;
import jpa.Entidades.Persona;


public class PersonaDao extends Dao {
    
    public Persona crear (Persona persona){
        try {
            
            entityManager.getTransaction().begin();
            entityManager.persist(Persona);
            entityManager.getTransaction().commit();
            return persona;
            
        }
    }
    catch (Exception e) static {
        try {
            throw new Exception("Ocurrio un error" )
        } catch (Exception ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    
    
 
}
