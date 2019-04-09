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
@Table(name = "t_sector_economico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TSectorEconomico.findAll", query = "SELECT t FROM TSectorEconomico t")
    , @NamedQuery(name = "TSectorEconomico.findByIdsectoreconomico", query = "SELECT t FROM TSectorEconomico t WHERE t.idsectoreconomico = :idsectoreconomico")
    , @NamedQuery(name = "TSectorEconomico.findByDescsectoreconomico", query = "SELECT t FROM TSectorEconomico t WHERE t.descsectoreconomico = :descsectoreconomico")})
public class TSectorEconomico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_sectoreconomico")
    private Integer idsectoreconomico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_sectoreconomico")
    private String descsectoreconomico;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsectoreconomico")
    private List<TEmpresas> tEmpresasList;

    public TSectorEconomico() {
    }

    public TSectorEconomico(Integer idsectoreconomico) {
        this.idsectoreconomico = idsectoreconomico;
    }

    public TSectorEconomico(Integer idsectoreconomico, String descsectoreconomico) {
        this.idsectoreconomico = idsectoreconomico;
        this.descsectoreconomico = descsectoreconomico;
    }

    public Integer getIdsectoreconomico() {
        return idsectoreconomico;
    }

    public void setIdsectoreconomico(Integer idsectoreconomico) {
        this.idsectoreconomico = idsectoreconomico;
    }

    public String getDescsectoreconomico() {
        return descsectoreconomico;
    }

    public void setDescsectoreconomico(String descsectoreconomico) {
        this.descsectoreconomico = descsectoreconomico;
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
        hash += (idsectoreconomico != null ? idsectoreconomico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TSectorEconomico)) {
            return false;
        }
        TSectorEconomico other = (TSectorEconomico) object;
        if ((this.idsectoreconomico == null && other.idsectoreconomico != null) || (this.idsectoreconomico != null && !this.idsectoreconomico.equals(other.idsectoreconomico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TSectorEconomico[ idsectoreconomico=" + idsectoreconomico + " ]";
    }
    
}
