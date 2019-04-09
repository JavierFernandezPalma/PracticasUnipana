/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entityes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Javier_Toto
 */
@Entity
@Table(name = "t_perfil_usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TPerfilUsuarios.findAll", query = "SELECT t FROM TPerfilUsuarios t")
    , @NamedQuery(name = "TPerfilUsuarios.findByIdperfil", query = "SELECT t FROM TPerfilUsuarios t WHERE t.idperfil = :idperfil")
    , @NamedQuery(name = "TPerfilUsuarios.findByRol", query = "SELECT t FROM TPerfilUsuarios t WHERE t.rol = :rol")
    , @NamedQuery(name = "TPerfilUsuarios.findByPermisos", query = "SELECT t FROM TPerfilUsuarios t WHERE t.permisos = :permisos")})
public class TPerfilUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_perfil")
    private Integer idperfil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Rol")
    private String rol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Permisos")
    private String permisos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tPerfilUsuarios")
    private List<TUsuarios> tUsuariosList;

    public TPerfilUsuarios() {
    }

    public TPerfilUsuarios(Integer idperfil) {
        this.idperfil = idperfil;
    }

    public TPerfilUsuarios(Integer idperfil, String rol, String permisos) {
        this.idperfil = idperfil;
        this.rol = rol;
        this.permisos = permisos;
    }

    public Integer getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(Integer idperfil) {
        this.idperfil = idperfil;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }

    @XmlTransient
    public List<TUsuarios> getTUsuariosList() {
        return tUsuariosList;
    }

    public void setTUsuariosList(List<TUsuarios> tUsuariosList) {
        this.tUsuariosList = tUsuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idperfil != null ? idperfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TPerfilUsuarios)) {
            return false;
        }
        TPerfilUsuarios other = (TPerfilUsuarios) object;
        if ((this.idperfil == null && other.idperfil != null) || (this.idperfil != null && !this.idperfil.equals(other.idperfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TPerfilUsuarios[ idperfil=" + idperfil + " ]";
    }
    
}
