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
@Table(name = "t_modalidad_estudio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TModalidadEstudio.findAll", query = "SELECT t FROM TModalidadEstudio t")
    , @NamedQuery(name = "TModalidadEstudio.findByIdmodalidad", query = "SELECT t FROM TModalidadEstudio t WHERE t.idmodalidad = :idmodalidad")
    , @NamedQuery(name = "TModalidadEstudio.findByDescmodalidad", query = "SELECT t FROM TModalidadEstudio t WHERE t.descmodalidad = :descmodalidad")})
public class TModalidadEstudio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_modalidad")
    private Integer idmodalidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_modalidad")
    private String descmodalidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmodalidad")
    private List<TEstudiantes> tEstudiantesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmodalidad")
    private List<TVacante> tVacanteList;

    public TModalidadEstudio() {
    }

    public TModalidadEstudio(Integer idmodalidad) {
        this.idmodalidad = idmodalidad;
    }

    public TModalidadEstudio(Integer idmodalidad, String descmodalidad) {
        this.idmodalidad = idmodalidad;
        this.descmodalidad = descmodalidad;
    }

    public Integer getIdmodalidad() {
        return idmodalidad;
    }

    public void setIdmodalidad(Integer idmodalidad) {
        this.idmodalidad = idmodalidad;
    }

    public String getDescmodalidad() {
        return descmodalidad;
    }

    public void setDescmodalidad(String descmodalidad) {
        this.descmodalidad = descmodalidad;
    }

    @XmlTransient
    public List<TEstudiantes> getTEstudiantesList() {
        return tEstudiantesList;
    }

    public void setTEstudiantesList(List<TEstudiantes> tEstudiantesList) {
        this.tEstudiantesList = tEstudiantesList;
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
        hash += (idmodalidad != null ? idmodalidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TModalidadEstudio)) {
            return false;
        }
        TModalidadEstudio other = (TModalidadEstudio) object;
        if ((this.idmodalidad == null && other.idmodalidad != null) || (this.idmodalidad != null && !this.idmodalidad.equals(other.idmodalidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TModalidadEstudio[ idmodalidad=" + idmodalidad + " ]";
    }
    
}
