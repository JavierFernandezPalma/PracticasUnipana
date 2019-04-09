/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entityes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Javier_Toto
 */
@Entity
@Table(name = "t_empresas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TEmpresas.findAll", query = "SELECT t FROM TEmpresas t")
    , @NamedQuery(name = "TEmpresas.findByIdempresa", query = "SELECT t FROM TEmpresas t WHERE t.idempresa = :idempresa")
    , @NamedQuery(name = "TEmpresas.findByNit", query = "SELECT t FROM TEmpresas t WHERE t.nit = :nit")
    , @NamedQuery(name = "TEmpresas.findByNombreempresa", query = "SELECT t FROM TEmpresas t WHERE t.nombreempresa = :nombreempresa")
    , @NamedQuery(name = "TEmpresas.findByNumempleados", query = "SELECT t FROM TEmpresas t WHERE t.numempleados = :numempleados")
    , @NamedQuery(name = "TEmpresas.findByCajacompensacion", query = "SELECT t FROM TEmpresas t WHERE t.cajacompensacion = :cajacompensacion")
    , @NamedQuery(name = "TEmpresas.findByNomdireccion", query = "SELECT t FROM TEmpresas t WHERE t.nomdireccion = :nomdireccion")
    , @NamedQuery(name = "TEmpresas.findByDireccionempresa", query = "SELECT t FROM TEmpresas t WHERE t.direccionempresa = :direccionempresa")
    , @NamedQuery(name = "TEmpresas.findByBarrio", query = "SELECT t FROM TEmpresas t WHERE t.barrio = :barrio")})
public class TEmpresas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_empresa")
    private Integer idempresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "Nit")
    private String nit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nombre_empresa")
    private String nombreempresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Num_empleados")
    private int numempleados;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Caja_compensacion")
    private String cajacompensacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nom_direccion")
    private String nomdireccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Direccion_empresa")
    private String direccionempresa;
    @Size(max = 50)
    @Column(name = "Barrio")
    private String barrio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idempresa")
    private List<TPracticas> tPracticasList;
    @JoinColumn(name = "Id_departamento", referencedColumnName = "Id_departamento")
    @ManyToOne
    private TDepartamento iddepartamento;
    @JoinColumn(name = "Id_ciudad", referencedColumnName = "Id_ciudad")
    @ManyToOne
    private TCiudad idciudad;
    @JoinColumn(name = "Id_tamano", referencedColumnName = "Id_tamano")
    @ManyToOne(optional = false)
    private TTamanoEmpresa idtamano;
    @JoinColumn(name = "Id_sectoreconomico", referencedColumnName = "Id_sectoreconomico")
    @ManyToOne(optional = false)
    private TSectorEconomico idsectoreconomico;
    @JoinColumn(name = "Id_actividad_economica", referencedColumnName = "Id_actividad_economica")
    @ManyToOne(optional = false)
    private TActividadEconomica idactividadeconomica;
    @JoinColumn(name = "Identificacion", referencedColumnName = "Identificacion")
    @JoinColumn(name = "Id_perfil", referencedColumnName = "Id_perfil")
    @ManyToOne(optional = false)
    private TUsuarios identificacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idempresa")
    private List<TVacante> tVacanteList;

    public TEmpresas() {
    }

    public TEmpresas(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public TEmpresas(Integer idempresa, String nit, String nombreempresa, int numempleados, String cajacompensacion, String nomdireccion, String direccionempresa) {
        this.idempresa = idempresa;
        this.nit = nit;
        this.nombreempresa = nombreempresa;
        this.numempleados = numempleados;
        this.cajacompensacion = cajacompensacion;
        this.nomdireccion = nomdireccion;
        this.direccionempresa = direccionempresa;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    public int getNumempleados() {
        return numempleados;
    }

    public void setNumempleados(int numempleados) {
        this.numempleados = numempleados;
    }

    public String getCajacompensacion() {
        return cajacompensacion;
    }

    public void setCajacompensacion(String cajacompensacion) {
        this.cajacompensacion = cajacompensacion;
    }

    public String getNomdireccion() {
        return nomdireccion;
    }

    public void setNomdireccion(String nomdireccion) {
        this.nomdireccion = nomdireccion;
    }

    public String getDireccionempresa() {
        return direccionempresa;
    }

    public void setDireccionempresa(String direccionempresa) {
        this.direccionempresa = direccionempresa;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    @XmlTransient
    public List<TPracticas> getTPracticasList() {
        return tPracticasList;
    }

    public void setTPracticasList(List<TPracticas> tPracticasList) {
        this.tPracticasList = tPracticasList;
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

    public TTamanoEmpresa getIdtamano() {
        return idtamano;
    }

    public void setIdtamano(TTamanoEmpresa idtamano) {
        this.idtamano = idtamano;
    }

    public TSectorEconomico getIdsectoreconomico() {
        return idsectoreconomico;
    }

    public void setIdsectoreconomico(TSectorEconomico idsectoreconomico) {
        this.idsectoreconomico = idsectoreconomico;
    }

    public TActividadEconomica getIdactividadeconomica() {
        return idactividadeconomica;
    }

    public void setIdactividadeconomica(TActividadEconomica idactividadeconomica) {
        this.idactividadeconomica = idactividadeconomica;
    }

    public TUsuarios getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(TUsuarios identificacion) {
        this.identificacion = identificacion;
    }

    @XmlTransient
    public List<TVacante> getTVacanteList() {
        return tVacanteList;
    }

    public void setTVacanteList(List<TVacante> tVacanteList) {
        this.tVacanteList = tVacanteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempresa != null ? idempresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TEmpresas)) {
            return false;
        }
        TEmpresas other = (TEmpresas) object;
        if ((this.idempresa == null && other.idempresa != null) || (this.idempresa != null && !this.idempresa.equals(other.idempresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TEmpresas[ idempresa=" + idempresa + " ]";
    }
    
}
