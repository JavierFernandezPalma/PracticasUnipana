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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Javier_Toto
 */
@Entity
@Table(name = "t_programa_academico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TProgramaAcademico.findAll", query = "SELECT t.idprograma, t.descprograma, f.descfacultad FROM TProgramaAcademico t, TFacultad f WHERE t.idfacultad = f.idfacultad")
    , @NamedQuery(name = "TProgramaAcademico.findByIdprograma", query = "SELECT t FROM TProgramaAcademico t WHERE t.idprograma = :idprograma")
    , @NamedQuery(name = "TProgramaAcademico.findByDescprograma", query = "SELECT t FROM TProgramaAcademico t WHERE t.descprograma = :descprograma")})
public class TProgramaAcademico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_programa")
    private Integer idprograma;
    @Size(max = 50)
    @Column(name = "Desc_programa")
    private String descprograma;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idprograma")
    private List<TEstudiantes> tEstudiantesList;
    @JoinColumn(name = "Id_facultad", referencedColumnName = "Id_facultad")
    @ManyToOne(optional = false)
    private TFacultad idfacultad;

    public TProgramaAcademico() {
    }
    
    public TProgramaAcademico(Integer idprograma, TFacultad idfacultad, String descprograma) {
        this.idprograma = idprograma;
        this.idfacultad = idfacultad;
        this.descprograma = descprograma;
    }

    public TProgramaAcademico(Integer idprograma) {
        this.idprograma = idprograma;
    }

    public Integer getIdprograma() {
        return idprograma;
    }

    public void setIdprograma(Integer idprograma) {
        this.idprograma = idprograma;
    }

    public String getDescprograma() {
        return descprograma;
    }

    public void setDescprograma(String descprograma) {
        this.descprograma = descprograma;
    }

    @XmlTransient
    public List<TEstudiantes> getTEstudiantesList() {
        return tEstudiantesList;
    }

    public void setTEstudiantesList(List<TEstudiantes> tEstudiantesList) {
        this.tEstudiantesList = tEstudiantesList;
    }

    public TFacultad getIdfacultad() {
        return idfacultad;
    }

    public void setIdfacultad(TFacultad idfacultad) {
        this.idfacultad = idfacultad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprograma != null ? idprograma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TProgramaAcademico)) {
            return false;
        }
        TProgramaAcademico other = (TProgramaAcademico) object;
        if ((this.idprograma == null && other.idprograma != null) || (this.idprograma != null && !this.idprograma.equals(other.idprograma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TProgramaAcademico[ idprograma=" + idprograma + " ]";
    }
    
}
