/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TEstudiantes;
import View.VEstudiantes;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Javier_Toto
 */
@Stateless
public class TEstudiantesFacade extends AbstractFacade<TEstudiantes> implements TEstudiantesFacadeLocal {

    @PersistenceContext(unitName = "AplicacionPracticasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TEstudiantesFacade() {
        super(TEstudiantes.class);
    }
    
    @Override
    public List<VEstudiantes> findAll_Estudiantes() {
        List<VEstudiantes> listaEstudiantesList = null;
        try {

            listaEstudiantesList = em.createNamedQuery("VEstudiantes.findAll").getResultList();
        } catch (NoResultException e) {

        }
        return listaEstudiantesList;
    }
    
}
