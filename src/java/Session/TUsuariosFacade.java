/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TPerfilUsuarios;
import Entityes.TUsuarios;
import Entityes.TUsuariosPK;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;

/**
 *
 * @author Javier_Toto
 */
@Stateless
public class TUsuariosFacade extends AbstractFacade<TUsuarios> implements TUsuariosFacadeLocal {

    @PersistenceContext(unitName = "AplicacionPracticasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    private DataSource ds;

    public TUsuariosFacade() {
        super(TUsuarios.class);
        
                try {
            Context ctx = new InitialContext();
            ds = (DataSource) ctx.lookup("jdbc/practicasPool");
        } catch (NamingException e) {
        }
    }

    @Override
    public TUsuarios validar(String usuario, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TUsuarios iniciarSesion(TUsuarios login) {
        TUsuarios log = null;

        try {
            log =  (TUsuarios) em.createNamedQuery("TUsuarios.login").setParameter("usuario", login.getUsuario()).setParameter("password", login.getPassword()).getResultList();
        } catch (NoResultException e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Error " + e));
        }
        return log;
    }
    
    
//        @Override
//       public TUsuarios iniciarSesion(TUsuarios login) {
//        TUsuarios resultLogin = null;
//        String consulta;
//        try {
//            consulta = "SELECT t. FROM TUsuarios t, TPerfilUsuarios p WHERE t.usuario = ?1 AND t.password = ?2  AND p.idperfil = t.tUsuariosPK.idperfil";
//            Query query = em.createQuery(consulta);
//            query.setParameter(1, login.getUsuario());
//            query.setParameter(2, login.getPassword());
//            List<TUsuarios> lista = query.getResultList();
//            if (!lista.isEmpty()) {
//                resultLogin = lista.get(0);
//            }
//        } catch (Exception e) {
//            throw e;
//        }
//        return resultLogin;
//    }
      
    

}
