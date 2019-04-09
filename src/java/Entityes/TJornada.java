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
@Table(name = "t_jornada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TJornada.findAll", query = "SELECT t FROM TJornada t")
    , @NamedQuery(name = "TJornada.findByIdjornada", query = "SELECT t FROM TJornada t WHERE t.idjornada = :idjornada")
    , @NamedQuery(name = "TJornada.findByDescjornada", query = "SELECT t FROM TJornada t WHERE t.descjornada = :descjornada")})
public class TJornada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_jornada")
    private Integer idjornada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_jornada")
    private String descjornada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idjornada")
    private List<TEstudiantes> tEstudiantesList;

    public TJornada() {
    }

    public TJornada(Integer idjornada) {
        this.idjornada = idjornada;
    }

    public TJornada(Integer idjornada, String descjornada) {
        this.idjornada = idjornada;
        this.descjornada = descjornada;
    }

    public Integer getIdjornada() {
        return idjornada;
    }

    public void setIdjornada(Integer idjornada) {
        this.idjornada = idjornada;
    }

    public String getDescjornada() {
        return descjornada;
    }

    public void setDescjornada(String descjornada) {
        this.descjornada = descjornada;
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
        hash += (idjornada != null ? idjornada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TJornada)) {
            return false;
        }
        TJornada other = (TJornada) object;
        if ((this.idjornada == null && other.idjornada != null) || (this.idjornada != null && !this.idjornada.equals(other.idjornada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TJornada[ idjornada=" + idjornada + " ]";
    }
    
}
