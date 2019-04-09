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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "t_oferta_estudiante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TOfertaEstudiante.findAll", query = "SELECT t FROM TOfertaEstudiante t")
    , @NamedQuery(name = "TOfertaEstudiante.findByIdoferta", query = "SELECT t FROM TOfertaEstudiante t WHERE t.idoferta = :idoferta")
    , @NamedQuery(name = "TOfertaEstudiante.findByIdestado", query = "SELECT t FROM TOfertaEstudiante t WHERE t.idestado = :idestado")
    , @NamedQuery(name = "TOfertaEstudiante.findByEstidentificacion", query = "SELECT t FROM TOfertaEstudiante t WHERE t.estidentificacion = :estidentificacion")
    , @NamedQuery(name = "TOfertaEstudiante.findByFoferta", query = "SELECT t FROM TOfertaEstudiante t WHERE t.foferta = :foferta")
    , @NamedQuery(name = "TOfertaEstudiante.findByDescoferta", query = "SELECT t FROM TOfertaEstudiante t WHERE t.descoferta = :descoferta")
    , @NamedQuery(name = "TOfertaEstudiante.findByAnexooferta", query = "SELECT t FROM TOfertaEstudiante t WHERE t.anexooferta = :anexooferta")
    , @NamedQuery(name = "TOfertaEstudiante.findByObservacionoferta", query = "SELECT t FROM TOfertaEstudiante t WHERE t.observacionoferta = :observacionoferta")
    , @NamedQuery(name = "TOfertaEstudiante.findByFbajaoferta", query = "SELECT t FROM TOfertaEstudiante t WHERE t.fbajaoferta = :fbajaoferta")})
public class TOfertaEstudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_oferta")
    private Integer idoferta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_estado")
    private int idestado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "Est_identificacion")
    private String estidentificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "F_oferta")
    @Temporal(TemporalType.DATE)
    private Date foferta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Desc_oferta")
    private String descoferta;
    @Size(max = 50)
    @Column(name = "Anexo_oferta")
    private String anexooferta;
    @Size(max = 500)
    @Column(name = "Observacion_oferta")
    private String observacionoferta;
    @Column(name = "F_baja_oferta")
    @Temporal(TemporalType.DATE)
    private Date fbajaoferta;

    public TOfertaEstudiante() {
    }

    public TOfertaEstudiante(Integer idoferta) {
        this.idoferta = idoferta;
    }

    public TOfertaEstudiante(Integer idoferta, int idestado, String estidentificacion, Date foferta, String descoferta) {
        this.idoferta = idoferta;
        this.idestado = idestado;
        this.estidentificacion = estidentificacion;
        this.foferta = foferta;
        this.descoferta = descoferta;
    }

    public Integer getIdoferta() {
        return idoferta;
    }

    public void setIdoferta(Integer idoferta) {
        this.idoferta = idoferta;
    }

    public int getIdestado() {
        return idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }

    public String getEstidentificacion() {
        return estidentificacion;
    }

    public void setEstidentificacion(String estidentificacion) {
        this.estidentificacion = estidentificacion;
    }

    public Date getFoferta() {
        return foferta;
    }

    public void setFoferta(Date foferta) {
        this.foferta = foferta;
    }

    public String getDescoferta() {
        return descoferta;
    }

    public void setDescoferta(String descoferta) {
        this.descoferta = descoferta;
    }

    public String getAnexooferta() {
        return anexooferta;
    }

    public void setAnexooferta(String anexooferta) {
        this.anexooferta = anexooferta;
    }

    public String getObservacionoferta() {
        return observacionoferta;
    }

    public void setObservacionoferta(String observacionoferta) {
        this.observacionoferta = observacionoferta;
    }

    public Date getFbajaoferta() {
        return fbajaoferta;
    }

    public void setFbajaoferta(Date fbajaoferta) {
        this.fbajaoferta = fbajaoferta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idoferta != null ? idoferta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TOfertaEstudiante)) {
            return false;
        }
        TOfertaEstudiante other = (TOfertaEstudiante) object;
        if ((this.idoferta == null && other.idoferta != null) || (this.idoferta != null && !this.idoferta.equals(other.idoferta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TOfertaEstudiante[ idoferta=" + idoferta + " ]";
    }
    
}
