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
@Table(name = "t_actividad_economica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TActividadEconomica.findAll", query = "SELECT t FROM TActividadEconomica t")
    , @NamedQuery(name = "TActividadEconomica.findByIdactividadeconomica", query = "SELECT t FROM TActividadEconomica t WHERE t.idactividadeconomica = :idactividadeconomica")
    , @NamedQuery(name = "TActividadEconomica.findByDescactividadeconomica", query = "SELECT t FROM TActividadEconomica t WHERE t.descactividadeconomica = :descactividadeconomica")})
public class TActividadEconomica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_actividad_economica")
    private Integer idactividadeconomica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_actividad_economica")
    private String descactividadeconomica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idactividadeconomica")
    private List<TEmpresas> tEmpresasList;

    public TActividadEconomica() {
    }

    public TActividadEconomica(Integer idactividadeconomica) {
        this.idactividadeconomica = idactividadeconomica;
    }

    public TActividadEconomica(Integer idactividadeconomica, String descactividadeconomica) {
        this.idactividadeconomica = idactividadeconomica;
        this.descactividadeconomica = descactividadeconomica;
    }

    public Integer getIdactividadeconomica() {
        return idactividadeconomica;
    }

    public void setIdactividadeconomica(Integer idactividadeconomica) {
        this.idactividadeconomica = idactividadeconomica;
    }

    public String getDescactividadeconomica() {
        return descactividadeconomica;
    }

    public void setDescactividadeconomica(String descactividadeconomica) {
        this.descactividadeconomica = descactividadeconomica;
    }

    @XmlTransient
    public List<TEmpresas> getTEmpresasList() {
        return tEmpresasList;
    }

    public void setTEmpresasList(List<TEmpresas> tEmpresasList) {
        this.tEmpresasList = tEmpresasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idactividadeconomica != null ? idactividadeconomica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TActividadEconomica)) {
            return false;
        }
        TActividadEconomica other = (TActividadEconomica) object;
        if ((this.idactividadeconomica == null && other.idactividadeconomica != null) || (this.idactividadeconomica != null && !this.idactividadeconomica.equals(other.idactividadeconomica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TActividadEconomica[ idactividadeconomica=" + idactividadeconomica + " ]";
    }
    
}
