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
@Table(name = "t_semestre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TSemestre.findAll", query = "SELECT t FROM TSemestre t")
    , @NamedQuery(name = "TSemestre.findByIdsemestre", query = "SELECT t FROM TSemestre t WHERE t.idsemestre = :idsemestre")
    , @NamedQuery(name = "TSemestre.findByDescsemestre", query = "SELECT t FROM TSemestre t WHERE t.descsemestre = :descsemestre")})
public class TSemestre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_semestre")
    private Integer idsemestre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_semestre")
    private String descsemestre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsemestre")
    private List<TEstudiantes> tEstudiantesList;

    public TSemestre() {
    }

    public TSemestre(Integer idsemestre) {
        this.idsemestre = idsemestre;
    }

    public TSemestre(Integer idsemestre, String descsemestre) {
        this.idsemestre = idsemestre;
        this.descsemestre = descsemestre;
    }

    public Integer getIdsemestre() {
        return idsemestre;
    }

    public void setIdsemestre(Integer idsemestre) {
        this.idsemestre = idsemestre;
    }

    public String getDescsemestre() {
        return descsemestre;
    }

    public void setDescsemestre(String descsemestre) {
        this.descsemestre = descsemestre;
    }

    @XmlTransient
    public List<TEstudiantes> getTEstudiantesList() {
        return tEstudiantesList;
    }

    public void setTEstudiantesList(List<TEstudiantes> tEstudiantesList) {
        this.tEstudiantesList = tEstudiantesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsemestre != null ? idsemestre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TSemestre)) {
            return false;
        }
        TSemestre other = (TSemestre) object;
        if ((this.idsemestre == null && other.idsemestre != null) || (this.idsemestre != null && !this.idsemestre.equals(other.idsemestre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TSemestre[ idsemestre=" + idsemestre + " ]";
    }
    
}
