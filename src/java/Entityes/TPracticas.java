/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entityes;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "t_practicas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TPracticas.findAll", query = "SELECT t FROM TPracticas t")
    , @NamedQuery(name = "TPracticas.findByIdpractica", query = "SELECT t FROM TPracticas t WHERE t.tPracticasPK.idpractica = :idpractica")
    , @NamedQuery(name = "TPracticas.findByIdseguimiento", query = "SELECT t FROM TPracticas t WHERE t.idseguimiento = :idseguimiento")
    , @NamedQuery(name = "TPracticas.findByIdentificacion", query = "SELECT t FROM TPracticas t WHERE t.tPracticasPK.identificacion = :identificacion")
    , @NamedQuery(name = "TPracticas.findByFiniciopractica", query = "SELECT t FROM TPracticas t WHERE t.finiciopractica = :finiciopractica")
    , @NamedQuery(name = "TPracticas.findByFfinpractica", query = "SELECT t FROM TPracticas t WHERE t.ffinpractica = :ffinpractica")
    , @NamedQuery(name = "TPracticas.findBySupervisorlaboral", query = "SELECT t FROM TPracticas t WHERE t.supervisorlaboral = :supervisorlaboral")
    , @NamedQuery(name = "TPracticas.findByContactosupervisorlaboral", query = "SELECT t FROM TPracticas t WHERE t.contactosupervisorlaboral = :contactosupervisorlaboral")
    , @NamedQuery(name = "TPracticas.findByCargo", query = "SELECT t FROM TPracticas t WHERE t.cargo = :cargo")
    , @NamedQuery(name = "TPracticas.findByRemuneracion", query = "SELECT t FROM TPracticas t WHERE t.remuneracion = :remuneracion")
    , @NamedQuery(name = "TPracticas.findByNomdireccion", query = "SELECT t FROM TPracticas t WHERE t.nomdireccion = :nomdireccion")
    , @NamedQuery(name = "TPracticas.findByDireccionpractica", query = "SELECT t FROM TPracticas t WHERE t.direccionpractica = :direccionpractica")
    , @NamedQuery(name = "TPracticas.findByAreapractica", query = "SELECT t FROM TPracticas t WHERE t.areapractica = :areapractica")
    , @NamedQuery(name = "TPracticas.findByDescpractica", query = "SELECT t FROM TPracticas t WHERE t.descpractica = :descpractica")
    , @NamedQuery(name = "TPracticas.findByVinculacion", query = "SELECT t FROM TPracticas t WHERE t.vinculacion = :vinculacion")
    , @NamedQuery(name = "TPracticas.findByObservacionofipracticas", query = "SELECT t FROM TPracticas t WHERE t.observacionofipracticas = :observacionofipracticas")})
public class TPracticas implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TPracticasPK tPracticasPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_seguimiento")
    private int idseguimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "F_inicio_practica")
    @Temporal(TemporalType.DATE)
    private Date finiciopractica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "F_fin_practica")
    @Temporal(TemporalType.DATE)
    private Date ffinpractica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Supervisorlaboral")
    private String supervisorlaboral;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Contacto_supervisorlaboral")
    private BigInteger contactosupervisorlaboral;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Cargo")
    private String cargo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Remuneracion")
    private BigDecimal remuneracion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nom_direccion")
    private String nomdireccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Direccion_practica")
    private String direccionpractica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Area_practica")
    private String areapractica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_practica")
    private String descpractica;
    @Column(name = "Vinculacion")
    private Integer vinculacion;
    @Size(max = 50)
    @Column(name = "Observacion_ofi_practicas")
    private String observacionofipracticas;
    @JoinColumn(name = "Id_modalidadpractica", referencedColumnName = "Id_modalidadpractica")
    @ManyToOne(optional = false)
    private TModalidadPractica idmodalidadpractica;
    @JoinColumn(name = "Id_departamento", referencedColumnName = "Id_departamento")
    @ManyToOne
    private TDepartamento iddepartamento;
    @JoinColumn(name = "Id_ciudad", referencedColumnName = "Id_ciudad")
    @ManyToOne
    private TCiudad idciudad;
    @JoinColumn(name = "Id_empresa", referencedColumnName = "Id_empresa")
    @ManyToOne(optional = false)
    private TEmpresas idempresa;
    @JoinColumn(name = "Identificacion", referencedColumnName = "Identificacion", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TEstudiantes tEstudiantes;

    public TPracticas() {
    }

    public TPracticas(TPracticasPK tPracticasPK) {
        this.tPracticasPK = tPracticasPK;
    }

    public TPracticas(TPracticasPK tPracticasPK, int idseguimiento, Date finiciopractica, Date ffinpractica, String supervisorlaboral, BigInteger contactosupervisorlaboral, String cargo, BigDecimal remuneracion, String nomdireccion, String direccionpractica, String areapractica, String descpractica) {
        this.tPracticasPK = tPracticasPK;
        this.idseguimiento = idseguimiento;
        this.finiciopractica = finiciopractica;
        this.ffinpractica = ffinpractica;
        this.supervisorlaboral = supervisorlaboral;
        this.contactosupervisorlaboral = contactosupervisorlaboral;
        this.cargo = cargo;
        this.remuneracion = remuneracion;
        this.nomdireccion = nomdireccion;
        this.direccionpractica = direccionpractica;
        this.areapractica = areapractica;
        this.descpractica = descpractica;
    }

    public TPracticas(int idpractica, String identificacion) {
        this.tPracticasPK = new TPracticasPK(idpractica, identificacion);
    }

    public TPracticasPK getTPracticasPK() {
        return tPracticasPK;
    }

    public void setTPracticasPK(TPracticasPK tPracticasPK) {
        this.tPracticasPK = tPracticasPK;
    }

    public int getIdseguimiento() {
        return idseguimiento;
    }

    public void setIdseguimiento(int idseguimiento) {
        this.idseguimiento = idseguimiento;
    }

    public Date getFiniciopractica() {
        return finiciopractica;
    }

    public void setFiniciopractica(Date finiciopractica) {
        this.finiciopractica = finiciopractica;
    }

    public Date getFfinpractica() {
        return ffinpractica;
    }

    public void setFfinpractica(Date ffinpractica) {
        this.ffinpractica = ffinpractica;
    }

    public String getSupervisorlaboral() {
        return supervisorlaboral;
    }

    public void setSupervisorlaboral(String supervisorlaboral) {
        this.supervisorlaboral = supervisorlaboral;
    }

    public BigInteger getContactosupervisorlaboral() {
        return contactosupervisorlaboral;
    }

    public void setContactosupervisorlaboral(BigInteger contactosupervisorlaboral) {
        this.contactosupervisorlaboral = contactosupervisorlaboral;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(BigDecimal remuneracion) {
        this.remuneracion = remuneracion;
    }

    public String getNomdireccion() {
        return nomdireccion;
    }

    public void setNomdireccion(String nomdireccion) {
        this.nomdireccion = nomdireccion;
    }

    public String getDireccionpractica() {
        return direccionpractica;
    }

    public void setDireccionpractica(String direccionpractica) {
        this.direccionpractica = direccionpractica;
    }

    public String getAreapractica() {
        return areapractica;
    }

    public void setAreapractica(String areapractica) {
        this.areapractica = areapractica;
    }

    public String getDescpractica() {
        return descpractica;
    }

    public void setDescpractica(String descpractica) {
        this.descpractica = descpractica;
    }

    public Integer getVinculacion() {
        return vinculacion;
    }

    public void setVinculacion(Integer vinculacion) {
        this.vinculacion = vinculacion;
    }

    public String getObservacionofipracticas() {
        return observacionofipracticas;
    }

    public void setObservacionofipracticas(String observacionofipracticas) {
        this.observacionofipracticas = observacionofipracticas;
    }

    public TModalidadPractica getIdmodalidadpractica() {
        return idmodalidadpractica;
    }

    public void setIdmodalidadpractica(TModalidadPractica idmodalidadpractica) {
        this.idmodalidadpractica = idmodalidadpractica;
    }

    public TDepartamento getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(TDepartamento iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public TCiudad getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(TCiudad idciudad) {
        this.idciudad = idciudad;
    }

    public TEmpresas getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(TEmpresas idempresa) {
        this.idempresa = idempresa;
    }

    public TEstudiantes getTEstudiantes() {
        return tEstudiantes;
    }

    public void setTEstudiantes(TEstudiantes tEstudiantes) {
        this.tEstudiantes = tEstudiantes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tPracticasPK != null ? tPracticasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TPracticas)) {
            return false;
        }
        TPracticas other = (TPracticas) object;
        if ((this.tPracticasPK == null && other.tPracticasPK != null) || (this.tPracticasPK != null && !this.tPracticasPK.equals(other.tPracticasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TPracticas[ tPracticasPK=" + tPracticasPK + " ]";
    }
    
}
