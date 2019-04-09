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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "t_estudiantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TEstudiantes.findAll", query = "SELECT t.identificacion, u.nombres, u.apellidos, t.idespecialidad.descespecialidad, t.idprograma.descprograma, t.idjornada.descjornada, t.idmodalidad.descmodalidad, t.idsemestre.descsemestre  FROM TEstudiantes t, TUsuarios u WHERE u.tUsuariosPK.identificacion = t.identificacion")
    , @NamedQuery(name = "TEstudiantes.findByIdentificacion", query = "SELECT t FROM TEstudiantes t WHERE t.identificacion = :identificacion")})
public class TEstudiantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "Identificacion")
    private String identificacion;
    @JoinColumn(name = "Id_especialidad", referencedColumnName = "Id_especialidad")
    @ManyToOne(optional = false)
    private TEspecialidad idespecialidad;
    @JoinColumn(name = "Id_programa", referencedColumnName = "Id_programa")
    @ManyToOne(optional = false)
    private TProgramaAcademico idprograma;
    @JoinColumn(name = "Codigo_materia", referencedColumnName = "Codigo_materia")
    @ManyToOne(optional = false)
    private TMateria codigomateria;
    @JoinColumn(name = "Id_jornada", referencedColumnName = "Id_jornada")
    @ManyToOne(optional = false)
    private TJornada idjornada;
    @JoinColumn(name = "Id_semestre", referencedColumnName = "Id_semestre")
    @ManyToOne(optional = false)
    private TSemestre idsemestre;
    @JoinColumn(name = "Id_modalidad", referencedColumnName = "Id_modalidad")
    @ManyToOne(optional = false)
    private TModalidadEstudio idmodalidad;
    @JoinColumn(name = "Identificacion", referencedColumnName = "Identificacion", insertable = false, updatable = false)
    @JoinColumn(name = "Id_perfil", referencedColumnName = "Id_perfil")
    @OneToOne(optional = false)
    private TUsuarios tUsuarios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tEstudiantes")
    private List<TPracticas> tPracticasList;

    public TEstudiantes() {
    }

    public TEstudiantes(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public TEspecialidad getIdespecialidad() {
        return idespecialidad;
    }

    public void setIdespecialidad(TEspecialidad idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    public TProgramaAcademico getIdprograma() {
        return idprograma;
    }

    public void setIdprograma(TProgramaAcademico idprograma) {
        this.idprograma = idprograma;
    }

    public TMateria getCodigomateria() {
        return codigomateria;
    }

    public void setCodigomateria(TMateria codigomateria) {
        this.codigomateria = codigomateria;
    }

    public TJornada getIdjornada() {
        return idjornada;
    }

    public void setIdjornada(TJornada idjornada) {
        this.idjornada = idjornada;
    }

    public TSemestre getIdsemestre() {
        return idsemestre;
    }

    public void setIdsemestre(TSemestre idsemestre) {
        this.idsemestre = idsemestre;
    }

    public TModalidadEstudio getIdmodalidad() {
        return idmodalidad;
    }

    public void setIdmodalidad(TModalidadEstudio idmodalidad) {
        this.idmodalidad = idmodalidad;
    }

    public TUsuarios getTUsuarios() {
        return tUsuarios;
    }

    public void setTUsuarios(TUsuarios tUsuarios) {
        this.tUsuarios = tUsuarios;
    }

    @XmlTransient
    public List<TPracticas> getTPracticasList() {
        return tPracticasList;
    }

    public void setTPracticasList(List<TPracticas> tPracticasList) {
        this.tPracticasList = tPracticasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificacion != null ? identificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TEstudiantes)) {
            return false;
        }
        TEstudiantes other = (TEstudiantes) object;
        if ((this.identificacion == null && other.identificacion != null) || (this.identificacion != null && !this.identificacion.equals(other.identificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TEstudiantes[ identificacion=" + identificacion + " ]";
    }

    public Object getIdentificacion(Long valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
