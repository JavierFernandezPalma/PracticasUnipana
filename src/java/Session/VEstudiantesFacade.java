/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import View.VEstudiantes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Javier_Toto
 */
@Stateless
public class VEstudiantesFacade extends AbstractFacade<VEstudiantes> implements VEstudiantesFacadeLocal {

    @PersistenceContext(unitName = "AplicacionPracticasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VEstudiantesFacade() {
        super(VEstudiantes.class);
    }
    
}
