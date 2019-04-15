/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import Entityes.TUsuarios;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import Session.TUsuariosFacadeLocal;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;






/**
 *
 * @author javi
 */

@Named(value = "loginManagedBean")
@RequestScoped

public class LoginManagedBean implements Serializable {

    @EJB
    private TUsuariosFacadeLocal loginFacadeLocal;
    private TUsuarios login;
    
    @PostConstruct
    public void init(){
        login = new TUsuarios();
    }

    public TUsuarios getTUsuarios() {
        return login;
    }

    public void setTUsuarios(TUsuarios login) {
        this.login = login;
    }

    public LoginManagedBean() {
        login = new TUsuarios();
    }

    public String validar() {

        TUsuarios lg = null;
        String redireccion = null;

        try {
            lg = loginFacadeLocal.validar(login.getUsuario(), login.getPassword());
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "No se pudo realizar el login."));
        }

        if (lg != null) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("login", lg);
            redireccion = "menu?faces-redirect=true"; //?faces-redirect=true para mostrar la  "Navegacion explicita"
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "El usuario no existe y/o clave errada."));
        }

        return redireccion;
    }
    
    
        public String iniciarSesion() {

        TUsuarios log = login;
        String redireccion = null;
redireccion = "production/principal";
//        try {
//            log = loginFacadeLocal.iniciarSesion(login);
//
//            if (log != null) {
//                redireccion = "production/principal";
//            } else {
//                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "El usuario no existe y/o clave errada."));
//            }
//        } catch (Exception e) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "No se pudo realizar el login."));
//        }
        return redireccion;
    }
        
}
