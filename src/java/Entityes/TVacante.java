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
@Table(name = "t_vacante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TVacante.findAll", query = "SELECT t FROM TVacante t")
    , @NamedQuery(name = "TVacante.findByIdvacante", query = "SELECT t FROM TVacante t WHERE t.idvacante = :idvacante")
    , @NamedQuery(name = "TVacante.findByVacantes", query = "SELECT t FROM TVacante t WHERE t.vacantes = :vacantes")
    , @NamedQuery(name = "TVacante.findByFpublica", query = "SELECT t FROM TVacante t WHERE t.fpublica = :fpublica")
    , @NamedQuery(name = "TVacante.findByDescvacante", query = "SELECT t FROM TVacante t WHERE t.descvacante = :descvacante")
    , @NamedQuery(name = "TVacante.findByRemuneracionvacante", query = "SELECT t FROM TVacante t WHERE t.remuneracionvacante = :remuneracionvacante")
    , @NamedQuery(name = "TVacante.findByAnexovacante", query = "SELECT t FROM TVacante t WHERE t.anexovacante = :anexovacante")
    , @NamedQuery(name = "TVacante.findByObservacante", query = "SELECT t FROM TVacante t WHERE t.observacante = :observacante")
    , @NamedQuery(name = "TVacante.findByFbajavacante", query = "SELECT t FROM TVacante t WHERE t.fbajavacante = :fbajavacante")})
public class TVacante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_vacante")
    private Integer idvacante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Vacantes")
    private int vacantes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "F_publica")
    @Temporal(TemporalType.DATE)
    private Date fpublica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Desc_vacante")
    private String descvacante;
    @Column(name = "Remuneracion_vacante")
    private Integer remuneracionvacante;
    @Size(max = 20)
    @Column(name = "Anexo_vacante")
    private String anexovacante;
    @Size(max = 500)
    @Column(name = "Obser_vacante")
    private String observacante;
    @Column(name = "F_baja_vacante")
    @Temporal(TemporalType.DATE)
    private Date fbajavacante;
    @JoinColumn(name = "Id_empresa", referencedColumnName = "Id_empresa")
    @ManyToOne(optional = false)
    private TEmpresas idempresa;
    @JoinColumn(name = "Id_modalidad", referencedColumnName = "Id_modalidad")
    @ManyToOne(optional = false)
    private TModalidadEstudio idmodalidad;
    @JoinColumn(name = "Id_estado", referencedColumnName = "Id_estado")
    @ManyToOne(optional = false)
    private TEstados idestado;
    @JoinColumn(name = "Id_especialidad", referencedColumnName = "Id_especialidad")
    @ManyToOne(optional = false)
    private TEspecialidad idespecialidad;

    public TVacante() {
    }

    public TVacante(Integer idvacante) {
        this.idvacante = idvacante;
    }

    public TVacante(Integer idvacante, int vacantes, Date fpublica, String descvacante) {
        this.idvacante = idvacante;
        this.vacantes = vacantes;
        this.fpublica = fpublica;
        this.descvacante = descvacante;
    }

    public Integer getIdvacante() {
        return idvacante;
    }

    public void setIdvacante(Integer idvacante) {
        this.idvacante = idvacante;
    }

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public Date getFpublica() {
        return fpublica;
    }

    public void setFpublica(Date fpublica) {
        this.fpublica = fpublica;
    }

    public String getDescvacante() {
        return descvacante;
    }

    public void setDescvacante(String descvacante) {
        this.descvacante = descvacante;
    }

    public Integer getRemuneracionvacante() {
        return remuneracionvacante;
    }

    public void setRemuneracionvacante(Integer remuneracionvacante) {
        this.remuneracionvacante = remuneracionvacante;
    }

    public String getAnexovacante() {
        return anexovacante;
    }

    public void setAnexovacante(String anexovacante) {
        this.anexovacante = anexovacante;
    }

    public String getObservacante() {
        return observacante;
    }

    public void setObservacante(String observacante) {
        this.observacante = observacante;
    }

    public Date getFbajavacante() {
        return fbajavacante;
    }

    public void setFbajavacante(Date fbajavacante) {
        this.fbajavacante = fbajavacante;
    }

    public TEmpresas getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(TEmpresas idempresa) {
        this.idempresa = idempresa;
    }

    public TModalidadEstudio getIdmodalidad() {
        return idmodalidad;
    }

    public void setIdmodalidad(TModalidadEstudio idmodalidad) {
        this.idmodalidad = idmodalidad;
    }

    public TEstados getIdestado() {
        return idestado;
    }

    public void setIdestado(TEstados idestado) {
        this.idestado = idestado;
    }

    public TEspecialidad getIdespecialidad() {
        return idespecialidad;
    }

    public void setIdespecialidad(TEspecialidad idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvacante != null ? idvacante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TVacante)) {
            return false;
        }
        TVacante other = (TVacante) object;
        if ((this.idvacante == null && other.idvacante != null) || (this.idvacante != null && !this.idvacante.equals(other.idvacante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TVacante[ idvacante=" + idvacante + " ]";
    }
    
}
