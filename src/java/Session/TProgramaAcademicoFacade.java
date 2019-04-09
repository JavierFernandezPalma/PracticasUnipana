/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TProgramaAcademico;
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
public class TProgramaAcademicoFacade extends AbstractFacade<TProgramaAcademico> implements TProgramaAcademicoFacadeLocal {

    @PersistenceContext(unitName = "AplicacionPracticasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TProgramaAcademicoFacade() {
        super(TProgramaAcademico.class);
    }

    @Override
    public List<TProgramaAcademico> findAll_Programa() {
        List<TProgramaAcademico> listaProgramaList = null;
        try {

            listaProgramaList = em.createNamedQuery("TProgramaAcademico.findAll").getResultList();
        } catch (NoResultException e) {

        }
        return listaProgramaList;
    }
    
}
