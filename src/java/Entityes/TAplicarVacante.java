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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Javier_Toto
 */
@Entity
@Table(name = "t_aplicar_vacante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TAplicarVacante.findAll", query = "SELECT t FROM TAplicarVacante t")
    , @NamedQuery(name = "TAplicarVacante.findByIdestudiante", query = "SELECT t FROM TAplicarVacante t WHERE t.tAplicarVacantePK.idestudiante = :idestudiante")
    , @NamedQuery(name = "TAplicarVacante.findByIdvacante", query = "SELECT t FROM TAplicarVacante t WHERE t.tAplicarVacantePK.idvacante = :idvacante")
    , @NamedQuery(name = "TAplicarVacante.findByIdestado", query = "SELECT t FROM TAplicarVacante t WHERE t.idestado = :idestado")
    , @NamedQuery(name = "TAplicarVacante.findByFaplica", query = "SELECT t FROM TAplicarVacante t WHERE t.faplica = :faplica")})
public class TAplicarVacante implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TAplicarVacantePK tAplicarVacantePK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_estado")
    private int idestado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "F_aplica")
    @Temporal(TemporalType.DATE)
    private Date faplica;

    public TAplicarVacante() {
    }

    public TAplicarVacante(TAplicarVacantePK tAplicarVacantePK) {
        this.tAplicarVacantePK = tAplicarVacantePK;
    }

    public TAplicarVacante(TAplicarVacantePK tAplicarVacantePK, int idestado, Date faplica) {
        this.tAplicarVacantePK = tAplicarVacantePK;
        this.idestado = idestado;
        this.faplica = faplica;
    }

    public TAplicarVacante(String idestudiante, int idvacante) {
        this.tAplicarVacantePK = new TAplicarVacantePK(idestudiante, idvacante);
    }

    public TAplicarVacantePK getTAplicarVacantePK() {
        return tAplicarVacantePK;
    }

    public void setTAplicarVacantePK(TAplicarVacantePK tAplicarVacantePK) {
        this.tAplicarVacantePK = tAplicarVacantePK;
    }

    public int getIdestado() {
        return idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }

    public Date getFaplica() {
        return faplica;
    }

    public void setFaplica(Date faplica) {
        this.faplica = faplica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tAplicarVacantePK != null ? tAplicarVacantePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TAplicarVacante)) {
            return false;
        }
        TAplicarVacante other = (TAplicarVacante) object;
        if ((this.tAplicarVacantePK == null && other.tAplicarVacantePK != null) || (this.tAplicarVacantePK != null && !this.tAplicarVacantePK.equals(other.tAplicarVacantePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TAplicarVacante[ tAplicarVacantePK=" + tAplicarVacantePK + " ]";
    }
    
}
