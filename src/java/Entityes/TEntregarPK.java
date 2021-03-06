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
public class TEntregarPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "Codigo_entregas")
    private int codigoentregas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Codigo_grupo")
    private int codigogrupo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "Id_estudiante")
    private String idestudiante;

    public TEntregarPK() {
    }

    public TEntregarPK(int codigoentregas, int codigogrupo, String idestudiante) {
        this.codigoentregas = codigoentregas;
        this.codigogrupo = codigogrupo;
        this.idestudiante = idestudiante;
    }

    public int getCodigoentregas() {
        return codigoentregas;
    }

    public void setCodigoentregas(int codigoentregas) {
        this.codigoentregas = codigoentregas;
    }

    public int getCodigogrupo() {
        return codigogrupo;
    }

    public void setCodigogrupo(int codigogrupo) {
        this.codigogrupo = codigogrupo;
    }

    public String getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(String idestudiante) {
        this.idestudiante = idestudiante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigoentregas;
        hash += (int) codigogrupo;
        hash += (idestudiante != null ? idestudiante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TEntregarPK)) {
            return false;
        }
        TEntregarPK other = (TEntregarPK) object;
        if (this.codigoentregas != other.codigoentregas) {
            return false;
        }
        if (this.codigogrupo != other.codigogrupo) {
            return false;
        }
        if ((this.idestudiante == null && other.idestudiante != null) || (this.idestudiante != null && !this.idestudiante.equals(other.idestudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TEntregarPK[ codigoentregas=" + codigoentregas + ", codigogrupo=" + codigogrupo + ", idestudiante=" + idestudiante + " ]";
    }
    
}
