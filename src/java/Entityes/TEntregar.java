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
@Table(name = "t_entregar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TEntregar.findAll", query = "SELECT t FROM TEntregar t")
    , @NamedQuery(name = "TEntregar.findByCodigoentregas", query = "SELECT t FROM TEntregar t WHERE t.tEntregarPK.codigoentregas = :codigoentregas")
    , @NamedQuery(name = "TEntregar.findByCodigogrupo", query = "SELECT t FROM TEntregar t WHERE t.tEntregarPK.codigogrupo = :codigogrupo")
    , @NamedQuery(name = "TEntregar.findByIdestudiante", query = "SELECT t FROM TEntregar t WHERE t.tEntregarPK.idestudiante = :idestudiante")
    , @NamedQuery(name = "TEntregar.findByFentregar", query = "SELECT t FROM TEntregar t WHERE t.fentregar = :fentregar")
    , @NamedQuery(name = "TEntregar.findByArchivoentregar", query = "SELECT t FROM TEntregar t WHERE t.archivoentregar = :archivoentregar")
    , @NamedQuery(name = "TEntregar.findByObservacionentregar", query = "SELECT t FROM TEntregar t WHERE t.observacionentregar = :observacionentregar")})
public class TEntregar implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TEntregarPK tEntregarPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "F_entregar")
    @Temporal(TemporalType.DATE)
    private Date fentregar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Archivo_entregar")
    private String archivoentregar;
    @Size(max = 50)
    @Column(name = "Observacion_entregar")
    private String observacionentregar;
    @JoinColumn(name = "Codigo_entregas", referencedColumnName = "Codigo_entregas", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TEntregas tEntregas;
    @JoinColumn(name = "Codigo_grupo", referencedColumnName = "Codigo_grupo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TGrupo tGrupo;

    public TEntregar() {
    }

    public TEntregar(TEntregarPK tEntregarPK) {
        this.tEntregarPK = tEntregarPK;
    }

    public TEntregar(TEntregarPK tEntregarPK, Date fentregar, String archivoentregar) {
        this.tEntregarPK = tEntregarPK;
        this.fentregar = fentregar;
        this.archivoentregar = archivoentregar;
    }

    public TEntregar(int codigoentregas, int codigogrupo, String idestudiante) {
        this.tEntregarPK = new TEntregarPK(codigoentregas, codigogrupo, idestudiante);
    }

    public TEntregarPK getTEntregarPK() {
        return tEntregarPK;
    }

    public void setTEntregarPK(TEntregarPK tEntregarPK) {
        this.tEntregarPK = tEntregarPK;
    }

    public Date getFentregar() {
        return fentregar;
    }

    public void setFentregar(Date fentregar) {
        this.fentregar = fentregar;
    }

    public String getArchivoentregar() {
        return archivoentregar;
    }

    public void setArchivoentregar(String archivoentregar) {
        this.archivoentregar = archivoentregar;
    }

    public String getObservacionentregar() {
        return observacionentregar;
    }

    public void setObservacionentregar(String observacionentregar) {
        this.observacionentregar = observacionentregar;
    }

    public TEntregas getTEntregas() {
        return tEntregas;
    }

    public void setTEntregas(TEntregas tEntregas) {
        this.tEntregas = tEntregas;
    }

    public TGrupo getTGrupo() {
        return tGrupo;
    }

    public void setTGrupo(TGrupo tGrupo) {
        this.tGrupo = tGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tEntregarPK != null ? tEntregarPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TEntregar)) {
            return false;
        }
        TEntregar other = (TEntregar) object;
        if ((this.tEntregarPK == null && other.tEntregarPK != null) || (this.tEntregarPK != null && !this.tEntregarPK.equals(other.tEntregarPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TEntregar[ tEntregarPK=" + tEntregarPK + " ]";
    }
    
}
