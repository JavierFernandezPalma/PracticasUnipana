/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TAsignarGrupo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Javier_Toto
 */
@Stateless
public class TAsignarGrupoFacade extends AbstractFacade<TAsignarGrupo> implements TAsignarGrupoFacadeLocal {

    @PersistenceContext(unitName = "AplicacionPracticasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TAsignarGrupoFacade() {
        super(TAsignarGrupo.class);
    }
    
}
