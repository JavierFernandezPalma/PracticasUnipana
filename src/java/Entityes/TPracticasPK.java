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
public class TPracticasPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Id_practica")
    private int idpractica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "Identificacion")
    private String identificacion;

    public TPracticasPK() {
    }

    public TPracticasPK(int idpractica, String identificacion) {
        this.idpractica = idpractica;
        this.identificacion = identificacion;
    }

    public int getIdpractica() {
        return idpractica;
    }

    public void setIdpractica(int idpractica) {
        this.idpractica = idpractica;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idpractica;
        hash += (identificacion != null ? identificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TPracticasPK)) {
            return false;
        }
        TPracticasPK other = (TPracticasPK) object;
        if (this.idpractica != other.idpractica) {
            return false;
        }
        if ((this.identificacion == null && other.identificacion != null) || (this.identificacion != null && !this.identificacion.equals(other.identificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TPracticasPK[ idpractica=" + idpractica + ", identificacion=" + identificacion + " ]";
    }
    
}
