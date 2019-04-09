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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "t_telefonos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTelefonos.findAll", query = "SELECT t FROM TTelefonos t")
    , @NamedQuery(name = "TTelefonos.findByTelefonousuario", query = "SELECT t FROM TTelefonos t WHERE t.telefonousuario = :telefonousuario")
    , @NamedQuery(name = "TTelefonos.findByIdtelefono", query = "SELECT t FROM TTelefonos t WHERE t.idtelefono = :idtelefono")})
public class TTelefonos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Telefono_usuario")
    private String telefonousuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_telefono")
    private int idtelefono;
    @JoinColumn(name = "Identificacion", referencedColumnName = "Identificacion")
    @JoinColumn(name = "Id_perfil", referencedColumnName = "Id_perfil")
    @ManyToOne(optional = false)
    private TUsuarios identificacion;

    public TTelefonos() {
    }

    public TTelefonos(String telefonousuario) {
        this.telefonousuario = telefonousuario;
    }

    public TTelefonos(String telefonousuario, int idtelefono) {
        this.telefonousuario = telefonousuario;
        this.idtelefono = idtelefono;
    }

    public String getTelefonousuario() {
        return telefonousuario;
    }

    public void setTelefonousuario(String telefonousuario) {
        this.telefonousuario = telefonousuario;
    }

    public int getIdtelefono() {
        return idtelefono;
    }

    public void setIdtelefono(int idtelefono) {
        this.idtelefono = idtelefono;
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
        hash += (telefonousuario != null ? telefonousuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTelefonos)) {
            return false;
        }
        TTelefonos other = (TTelefonos) object;
        if ((this.telefonousuario == null && other.telefonousuario != null) || (this.telefonousuario != null && !this.telefonousuario.equals(other.telefonousuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TTelefonos[ telefonousuario=" + telefonousuario + " ]";
    }
    
}
