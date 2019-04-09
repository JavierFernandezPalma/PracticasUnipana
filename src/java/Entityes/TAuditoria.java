/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entityes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Javier_Toto
 */
@Entity
@Table(name = "t_auditoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TAuditoria.findAll", query = "SELECT t FROM TAuditoria t")
    , @NamedQuery(name = "TAuditoria.findByIdauditoria", query = "SELECT t FROM TAuditoria t WHERE t.idauditoria = :idauditoria")
    , @NamedQuery(name = "TAuditoria.findByAccion", query = "SELECT t FROM TAuditoria t WHERE t.accion = :accion")
    , @NamedQuery(name = "TAuditoria.findByCadena", query = "SELECT t FROM TAuditoria t WHERE t.cadena = :cadena")
    , @NamedQuery(name = "TAuditoria.findByFaccion", query = "SELECT t FROM TAuditoria t WHERE t.faccion = :faccion")})
public class TAuditoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_auditoria")
    private Integer idauditoria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Accion")
    private String accion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Cadena")
    private String cadena;
    @Basic(optional = false)
    @NotNull
    @Column(name = "F_accion")
    @Temporal(TemporalType.DATE)
    private Date faccion;
    @JoinColumn(name = "Identificacion", referencedColumnName = "Identificacion")
    @JoinColumn(name = "Id_perfil", referencedColumnName = "Id_perfil")
    @ManyToOne(optional = false)
    private TUsuarios identificacion;

    public TAuditoria() {
    }

    public TAuditoria(Integer idauditoria) {
        this.idauditoria = idauditoria;
    }

    public TAuditoria(Integer idauditoria, String accion, String cadena, Date faccion) {
        this.idauditoria = idauditoria;
        this.accion = accion;
        this.cadena = cadena;
        this.faccion = faccion;
    }

    public Integer getIdauditoria() {
        return idauditoria;
    }

    public void setIdauditoria(Integer idauditoria) {
        this.idauditoria = idauditoria;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public Date getFaccion() {
        return faccion;
    }

    public void setFaccion(Date faccion) {
        this.faccion = faccion;
    }

    public TUsuarios getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(TUsuarios identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idauditoria != null ? idauditoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TAuditoria)) {
            return false;
        }
        TAuditoria other = (TAuditoria) object;
        if ((this.idauditoria == null && other.idauditoria != null) || (this.idauditoria != null && !this.idauditoria.equals(other.idauditoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TAuditoria[ idauditoria=" + idauditoria + " ]";
    }
    
}
