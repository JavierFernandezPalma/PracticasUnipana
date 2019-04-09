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
@Table(name = "t_modalidad_practica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TModalidadPractica.findAll", query = "SELECT t FROM TModalidadPractica t")
    , @NamedQuery(name = "TModalidadPractica.findByIdmodalidadpractica", query = "SELECT t FROM TModalidadPractica t WHERE t.idmodalidadpractica = :idmodalidadpractica")
    , @NamedQuery(name = "TModalidadPractica.findByDescmodalidadpractica", query = "SELECT t FROM TModalidadPractica t WHERE t.descmodalidadpractica = :descmodalidadpractica")})
public class TModalidadPractica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_modalidadpractica")
    private Integer idmodalidadpractica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_modalidad_practica")
    private String descmodalidadpractica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmodalidadpractica")
    private List<TPracticas> tPracticasList;

    public TModalidadPractica() {
    }

    public TModalidadPractica(Integer idmodalidadpractica) {
        this.idmodalidadpractica = idmodalidadpractica;
    }

    public TModalidadPractica(Integer idmodalidadpractica, String descmodalidadpractica) {
        this.idmodalidadpractica = idmodalidadpractica;
        this.descmodalidadpractica = descmodalidadpractica;
    }

    public Integer getIdmodalidadpractica() {
        return idmodalidadpractica;
    }

    public void setIdmodalidadpractica(Integer idmodalidadpractica) {
        this.idmodalidadpractica = idmodalidadpractica;
    }

    public String getDescmodalidadpractica() {
        return descmodalidadpractica;
    }

    public void setDescmodalidadpractica(String descmodalidadpractica) {
        this.descmodalidadpractica = descmodalidadpractica;
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
        hash += (idmodalidadpractica != null ? idmodalidadpractica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TModalidadPractica)) {
            return false;
        }
        TModalidadPractica other = (TModalidadPractica) object;
        if ((this.idmodalidadpractica == null && other.idmodalidadpractica != null) || (this.idmodalidadpractica != null && !this.idmodalidadpractica.equals(other.idmodalidadpractica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TModalidadPractica[ idmodalidadpractica=" + idmodalidadpractica + " ]";
    }
    
}
