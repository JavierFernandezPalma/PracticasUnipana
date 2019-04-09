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
@Table(name = "t_estados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TEstados.findAll", query = "SELECT t FROM TEstados t")
    , @NamedQuery(name = "TEstados.findByIdestado", query = "SELECT t FROM TEstados t WHERE t.idestado = :idestado")
    , @NamedQuery(name = "TEstados.findByDescestado", query = "SELECT t FROM TEstados t WHERE t.descestado = :descestado")})
public class TEstados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_estado")
    private Integer idestado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_estado")
    private String descestado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idestado")
    private List<TUsuarios> tUsuariosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idestado")
    private List<TVacante> tVacanteList;

    public TEstados() {
    }

    public TEstados(Integer idestado) {
        this.idestado = idestado;
    }

    public TEstados(Integer idestado, String descestado) {
        this.idestado = idestado;
        this.descestado = descestado;
    }

    public Integer getIdestado() {
        return idestado;
    }

    public void setIdestado(Integer idestado) {
        this.idestado = idestado;
    }

    public String getDescestado() {
        return descestado;
    }

    public void setDescestado(String descestado) {
        this.descestado = descestado;
    }

    @XmlTransient
    public List<TUsuarios> getTUsuariosList() {
        return tUsuariosList;
    }

    public void setTUsuariosList(List<TUsuarios> tUsuariosList) {
        this.tUsuariosList = tUsuariosList;
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
        hash += (idestado != null ? idestado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TEstados)) {
            return false;
        }
        TEstados other = (TEstados) object;
        if ((this.idestado == null && other.idestado != null) || (this.idestado != null && !this.idestado.equals(other.idestado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TEstados[ idestado=" + idestado + " ]";
    }
    
}
