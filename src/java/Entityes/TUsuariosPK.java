/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entityes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Javier_Toto
 */
@Embeddable
public class TUsuariosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "Identificacion")
    private String identificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_perfil")
    private int idperfil;

    public TUsuariosPK() {
    }

    public TUsuariosPK(String identificacion, int idperfil) {
        this.identificacion = identificacion;
        this.idperfil = idperfil;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(int idperfil) {
        this.idperfil = idperfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificacion != null ? identificacion.hashCode() : 0);
        hash += (int) idperfil;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TUsuariosPK)) {
            return false;
        }
        TUsuariosPK other = (TUsuariosPK) object;
        if ((this.identificacion == null && other.identificacion != null) || (this.identificacion != null && !this.identificacion.equals(other.identificacion))) {
            return false;
        }
        if (this.idperfil != other.idperfil) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TUsuariosPK[ identificacion=" + identificacion + ", idperfil=" + idperfil + " ]";
    }
    
}
