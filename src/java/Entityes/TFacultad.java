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
@Table(name = "t_facultad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TFacultad.findAll", query = "SELECT t FROM TFacultad t")
    , @NamedQuery(name = "TFacultad.findByIdfacultad", query = "SELECT t FROM TFacultad t WHERE t.idfacultad = :idfacultad")
    , @NamedQuery(name = "TFacultad.findByDescfacultad", query = "SELECT t FROM TFacultad t WHERE t.descfacultad = :descfacultad")})
public class TFacultad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_facultad")
    private Integer idfacultad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_facultad")
    private String descfacultad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idfacultad")
    private List<TProgramaAcademico> tProgramaAcademicoList;

    public TFacultad() {
    }

    public TFacultad(Integer idfacultad) {
        this.idfacultad = idfacultad;
    }

    public TFacultad(Integer idfacultad, String descfacultad) {
        this.idfacultad = idfacultad;
        this.descfacultad = descfacultad;
    }

    public Integer getIdfacultad() {
        return idfacultad;
    }

    public void setIdfacultad(Integer idfacultad) {
        this.idfacultad = idfacultad;
    }

    public String getDescfacultad() {
        return descfacultad;
    }

    public void setDescfacultad(String descfacultad) {
        this.descfacultad = descfacultad;
    }

    @XmlTransient
    public List<TProgramaAcademico> getTProgramaAcademicoList() {
        return tProgramaAcademicoList;
    }

    public void setTProgramaAcademicoList(List<TProgramaAcademico> tProgramaAcademicoList) {
        this.tProgramaAcademicoList = tProgramaAcademicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfacultad != null ? idfacultad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TFacultad)) {
            return false;
        }
        TFacultad other = (TFacultad) object;
        if ((this.idfacultad == null && other.idfacultad != null) || (this.idfacultad != null && !this.idfacultad.equals(other.idfacultad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TFacultad[ idfacultad=" + idfacultad + " ]";
    }
    
}
