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
@Table(name = "t_materia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMateria.findAll", query = "SELECT t FROM TMateria t")
    , @NamedQuery(name = "TMateria.findByCodigomateria", query = "SELECT t FROM TMateria t WHERE t.codigomateria = :codigomateria")
    , @NamedQuery(name = "TMateria.findByDescmateria", query = "SELECT t FROM TMateria t WHERE t.descmateria = :descmateria")})
public class TMateria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Codigo_materia")
    private Integer codigomateria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_materia")
    private String descmateria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigomateria")
    private List<TEstudiantes> tEstudiantesList;

    public TMateria() {
    }

    public TMateria(Integer codigomateria) {
        this.codigomateria = codigomateria;
    }

    public TMateria(Integer codigomateria, String descmateria) {
        this.codigomateria = codigomateria;
        this.descmateria = descmateria;
    }

    public Integer getCodigomateria() {
        return codigomateria;
    }

    public void setCodigomateria(Integer codigomateria) {
        this.codigomateria = codigomateria;
    }

    public String getDescmateria() {
        return descmateria;
    }

    public void setDescmateria(String descmateria) {
        this.descmateria = descmateria;
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
        hash += (codigomateria != null ? codigomateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMateria)) {
            return false;
        }
        TMateria other = (TMateria) object;
        if ((this.codigomateria == null && other.codigomateria != null) || (this.codigomateria != null && !this.codigomateria.equals(other.codigomateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TMateria[ codigomateria=" + codigomateria + " ]";
    }
    
}
