/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import Entityes.TMails;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import Session.TMailsFacade;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Javier_Toto
 */
@Named(value = "mailsManagedBean")
@RequestScoped
public class MailsManagedBean {


    
    
    public MailsManagedBean() {
    }
    

    public void createMails(TMails eMails) {
        
        TMailsFacade tMailsFacade = new TMailsFacade();
        try {
            tMailsFacade.crearEmail(eMails);

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Error al crear mails."));
        }
    }
    
}
