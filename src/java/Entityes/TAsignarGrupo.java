/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entityes;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Javier_Toto
 */
@Entity
@Table(name = "t_asignar_grupo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TAsignarGrupo.findAll", query = "SELECT t FROM TAsignarGrupo t")
    , @NamedQuery(name = "TAsignarGrupo.findByCodigogrupo", query = "SELECT t FROM TAsignarGrupo t WHERE t.tAsignarGrupoPK.codigogrupo = :codigogrupo")
    , @NamedQuery(name = "TAsignarGrupo.findByIdestudiante", query = "SELECT t FROM TAsignarGrupo t WHERE t.tAsignarGrupoPK.idestudiante = :idestudiante")})
public class TAsignarGrupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TAsignarGrupoPK tAsignarGrupoPK;

    public TAsignarGrupo() {
    }

    public TAsignarGrupo(TAsignarGrupoPK tAsignarGrupoPK) {
        this.tAsignarGrupoPK = tAsignarGrupoPK;
    }

    public TAsignarGrupo(int codigogrupo, String idestudiante) {
        this.tAsignarGrupoPK = new TAsignarGrupoPK(codigogrupo, idestudiante);
    }

    public TAsignarGrupoPK getTAsignarGrupoPK() {
        return tAsignarGrupoPK;
    }

    public void setTAsignarGrupoPK(TAsignarGrupoPK tAsignarGrupoPK) {
        this.tAsignarGrupoPK = tAsignarGrupoPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tAsignarGrupoPK != null ? tAsignarGrupoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TAsignarGrupo)) {
            return false;
        }
        TAsignarGrupo other = (TAsignarGrupo) object;
        if ((this.tAsignarGrupoPK == null && other.tAsignarGrupoPK != null) || (this.tAsignarGrupoPK != null && !this.tAsignarGrupoPK.equals(other.tAsignarGrupoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TAsignarGrupo[ tAsignarGrupoPK=" + tAsignarGrupoPK + " ]";
    }
    
}
