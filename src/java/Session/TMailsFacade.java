/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TMails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;

/**
 *
 * @author Javier_Toto
 */
@Stateless
public class TMailsFacade extends AbstractFacade<TMails> implements TMailsFacadeLocal {

    @PersistenceContext(unitName = "AplicacionPracticasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    private DataSource ds;

    public TMailsFacade() {
        super(TMails.class);
        
        try {
            Context ctx = new InitialContext();
            ds = (DataSource) ctx.lookup("jdbc/practicasPool");
        } catch (NamingException e) {
        }
    }
    
    public void crearEmail(TMails tMails) {
        
        try {
            String consulta = "INSERT INTO practicas.t_mails values(?,?)";
            
            Connection con = ds.getConnection();
            PreparedStatement cq = con.prepareStatement(consulta);

            cq.setString(1, tMails.getIdentificacion().getTUsuariosPK().getIdentificacion());
            cq.setString(2, tMails.getMail()); 
            cq.execute();
        } catch (SQLException ex) {
            
            Logger.getLogger(TMailsFacade.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Error al insertar mail."));
        }

    }

}
