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
@Table(name = "t_especialidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TEspecialidad.findAll", query = "SELECT t FROM TEspecialidad t")
    , @NamedQuery(name = "TEspecialidad.findByIdespecialidad", query = "SELECT t FROM TEspecialidad t WHERE t.idespecialidad = :idespecialidad")
    , @NamedQuery(name = "TEspecialidad.findByIdprograma", query = "SELECT t FROM TEspecialidad t WHERE t.idprograma = :idprograma")
    , @NamedQuery(name = "TEspecialidad.findByDescespecialidad", query = "SELECT t FROM TEspecialidad t WHERE t.descespecialidad = :descespecialidad")})
public class TEspecialidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_especialidad")
    private Integer idespecialidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_programa")
    private int idprograma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_especialidad")
    private String descespecialidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idespecialidad")
    private List<TEstudiantes> tEstudiantesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idespecialidad")
    private List<TVacante> tVacanteList;

    public TEspecialidad() {
    }

    public TEspecialidad(Integer idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    public TEspecialidad(Integer idespecialidad, int idprograma, String descespecialidad) {
        this.idespecialidad = idespecialidad;
        this.idprograma = idprograma;
        this.descespecialidad = descespecialidad;
    }

    public Integer getIdespecialidad() {
        return idespecialidad;
    }

    public void setIdespecialidad(Integer idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    public int getIdprograma() {
        return idprograma;
    }

    public void setIdprograma(int idprograma) {
        this.idprograma = idprograma;
    }

    public String getDescespecialidad() {
        return descespecialidad;
    }

    public void setDescespecialidad(String descespecialidad) {
        this.descespecialidad = descespecialidad;
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
        hash += (idespecialidad != null ? idespecialidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TEspecialidad)) {
            return false;
        }
        TEspecialidad other = (TEspecialidad) object;
        if ((this.idespecialidad == null && other.idespecialidad != null) || (this.idespecialidad != null && !this.idespecialidad.equals(other.idespecialidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TEspecialidad[ idespecialidad=" + idespecialidad + " ]";
    }
    
}
