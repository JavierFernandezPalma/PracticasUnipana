/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TEntregas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author Javier_Toto
 */
@Stateless
public class TEntregasFacade extends AbstractFacade<TEntregas> implements TEntregasFacadeLocal {

    public TEntregasFacade() {
        super(TEntregas.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
