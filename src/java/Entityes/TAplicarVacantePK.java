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
public class TAplicarVacantePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "Id_estudiante")
    private String idestudiante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_vacante")
    private int idvacante;

    public TAplicarVacantePK() {
    }

    public TAplicarVacantePK(String idestudiante, int idvacante) {
        this.idestudiante = idestudiante;
        this.idvacante = idvacante;
    }

    public String getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(String idestudiante) {
        this.idestudiante = idestudiante;
    }

    public int getIdvacante() {
        return idvacante;
    }

    public void setIdvacante(int idvacante) {
        this.idvacante = idvacante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestudiante != null ? idestudiante.hashCode() : 0);
        hash += (int) idvacante;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TAplicarVacantePK)) {
            return false;
        }
        TAplicarVacantePK other = (TAplicarVacantePK) object;
        if ((this.idestudiante == null && other.idestudiante != null) || (this.idestudiante != null && !this.idestudiante.equals(other.idestudiante))) {
            return false;
        }
        if (this.idvacante != other.idvacante) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TAplicarVacantePK[ idestudiante=" + idestudiante + ", idvacante=" + idvacante + " ]";
    }
    
}
