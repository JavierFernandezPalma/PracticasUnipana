/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import Entityes.TEspecialidad;
import Entityes.TEstados;
import Entityes.TEstudiantes;
import Entityes.TMails;
import Entityes.TPerfilUsuarios;
import Entityes.TTelefonos;
import Entityes.TUsuarios;
import Entityes.TUsuariosPK;
import Session.TEstudiantesFacadeLocal;
import Session.TTelefonosFacadeLocal;
import Session.TUsuariosFacadeLocal;
import View.VEstudiantes;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.inject.Named;

/**
 *
 * @author Javier_Toto
 */

@Named(value = "usuariosMB")
@RequestScoped

public class UsuariosMB  implements Serializable {
    
    
    @EJB
    TUsuariosFacadeLocal usuariosFacadeLocal;
    
    java.util.Date fechaActual = new Date();
    
    private TEstudiantes estudiantes;
    private TUsuarios usuarios;
    private VEstudiantes vEstudiantes = null;
    private TUsuariosPK tUsuariosPK = null;
    private TMails tMails = null;
    private TPerfilUsuarios tPerfilUsuarios = null;
    private TEstados tEstados = null;
    private TTelefonos tTelefono = null;
    private TTelefonos tTelefonoMovil = null;
    
    private int selectedTipoDocumento;
    private int selectedEstados;
    private Date fexpdoc;
    
    @PostConstruct
    public void init() {
        estudiantes = new TEstudiantes();
        usuarios = new TUsuarios();
        vEstudiantes = new VEstudiantes();
        tUsuariosPK = new TUsuariosPK();
        tPerfilUsuarios = new TPerfilUsuarios();
        tMails = new TMails();
        tTelefono = new TTelefonos();
        tTelefonoMovil = new TTelefonos();
    }

    public TEstudiantes getTEstudiantes() {
        return estudiantes;
    }

    public void setTEstudiantes(TEstudiantes estudiantes) {
        this.estudiantes = estudiantes;
    }

    public TUsuarios getTUsuarios() {
        return usuarios;
    }

    public void setTUsuarios(TUsuarios usuarios) {
        this.usuarios = usuarios;
    }

    public VEstudiantes getVEstudiantes() {
        return vEstudiantes;
    }

    public void setVEstudiantes(VEstudiantes vEstudiantes) {
        this.vEstudiantes = vEstudiantes;
    }

    public TUsuariosPK gettUsuariosPK() {
        return tUsuariosPK;
    }

    public void settUsuariosPK(TUsuariosPK tUsuariosPK) {
        this.tUsuariosPK = tUsuariosPK;
    }

    public TEstados gettEstados() {
        return tEstados;
    }

    public void settEstados(TEstados tEstados) {
        this.tEstados = tEstados;
    }

    public TPerfilUsuarios gettPerfilUsuarios() {
        return tPerfilUsuarios;
    }

    public void settPerfilUsuarios(TPerfilUsuarios tPerfilUsuarios) {
        this.tPerfilUsuarios = tPerfilUsuarios;
    }
    
    public int getSelectedEstados() {
        return selectedEstados;
    }

    public void setSelectedEstados(int selectedEstados) {
        this.selectedEstados = selectedEstados;
    }

    public TMails getTMails() {
        return tMails;
    }

    public void setTMails(TMails tMails) {
        this.tMails = tMails;
    }

    public TTelefonos getTTelefonos() {
        return tTelefono;
    }

    public void setTTelefonos(TTelefonos tTelefonos) {
        this.tTelefono = tTelefonos;
    }

    public TTelefonos getTTelefonoMovil() {
        return tTelefonoMovil;
    }

    public void setTTelefonoMovil(TTelefonos tTelefonoMovil) {
        this.tTelefonoMovil = tTelefonoMovil;
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public Date getFexpdoc() {
        return fexpdoc;
    }

    public void setFexpdoc(Date Fexpdoc) {
        this.fexpdoc = Fexpdoc;
    }

    public int getSelectedTipoDocumento() {
        return selectedTipoDocumento;
    }

    public void setSelectedTipoDocumento(int selectedTipoDocumento) {
        this.selectedTipoDocumento = selectedTipoDocumento;
    }
    
    
    public UsuariosMB() {
        
    }
    
    public void createUsuario(){
        
        tUsuariosPK = new TUsuariosPK(vEstudiantes.getIdentificacion(),4);
        tPerfilUsuarios = new TPerfilUsuarios(tUsuariosPK.getIdperfil());
        tEstados = new TEstados(selectedEstados);
        
        usuarios.setTUsuariosPK(tUsuariosPK);
        usuarios.setIddocumento(selectedTipoDocumento);
        usuarios.setTPerfilUsuarios(tPerfilUsuarios);
        usuarios.setIdestado(tEstados);
        usuarios.setNombres(vEstudiantes.getNombres());
        usuarios.setApellidos(vEstudiantes.getApellidos());
        usuarios.setUsuario(tMails.getMail());
        usuarios.setPassword(vEstudiantes.getIdentificacion());
        usuarios.setFcreacion(fechaActual);
        
        tMails.setIdentificacion(usuarios);
        tTelefono.setIdentificacion(usuarios);
        tTelefonoMovil.setIdentificacion(usuarios);
        
        
        try {
            usuariosFacadeLocal.create(usuarios);
            
            MailsManagedBean m = new MailsManagedBean();
            m.createMails(tMails);
            
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Estudiante con documento: " + vEstudiantes.getIdentificacion() + " creado satisfactoriamente."));

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Error al crear el estudiante con documento: " + vEstudiantes.getIdentificacion() + "."));
        }

 

    }
    

}
