/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entityes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Javier_Toto
 */
@Entity
@Table(name = "t_tipo_telefonos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTipoTelefonos.findAll", query = "SELECT t FROM TTipoTelefonos t")
    , @NamedQuery(name = "TTipoTelefonos.findByIdtelefono", query = "SELECT t FROM TTipoTelefonos t WHERE t.idtelefono = :idtelefono")
    , @NamedQuery(name = "TTipoTelefonos.findByDesctelefono", query = "SELECT t FROM TTipoTelefonos t WHERE t.desctelefono = :desctelefono")})
public class TTipoTelefonos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_telefono")
    private Integer idtelefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_telefono")
    private String desctelefono;

    public TTipoTelefonos() {
    }

    public TTipoTelefonos(Integer idtelefono) {
        this.idtelefono = idtelefono;
    }

    public TTipoTelefonos(Integer idtelefono, String desctelefono) {
        this.idtelefono = idtelefono;
        this.desctelefono = desctelefono;
    }

    public Integer getIdtelefono() {
        return idtelefono;
    }

    public void setIdtelefono(Integer idtelefono) {
        this.idtelefono = idtelefono;
    }

    public String getDesctelefono() {
        return desctelefono;
    }

    public void setDesctelefono(String desctelefono) {
        this.desctelefono = desctelefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtelefono != null ? idtelefono.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTipoTelefonos)) {
            return false;
        }
        TTipoTelefonos other = (TTipoTelefonos) object;
        if ((this.idtelefono == null && other.idtelefono != null) || (this.idtelefono != null && !this.idtelefono.equals(other.idtelefono))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TTipoTelefonos[ idtelefono=" + idtelefono + " ]";
    }
    
}
