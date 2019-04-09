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
@Table(name = "t_tamano_empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTamanoEmpresa.findAll", query = "SELECT t FROM TTamanoEmpresa t")
    , @NamedQuery(name = "TTamanoEmpresa.findByIdtamano", query = "SELECT t FROM TTamanoEmpresa t WHERE t.idtamano = :idtamano")
    , @NamedQuery(name = "TTamanoEmpresa.findByDesctamano", query = "SELECT t FROM TTamanoEmpresa t WHERE t.desctamano = :desctamano")})
public class TTamanoEmpresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_tamano")
    private Integer idtamano;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_tamano")
    private String desctamano;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtamano")
    private List<TEmpresas> tEmpresasList;

    public TTamanoEmpresa() {
    }

    public TTamanoEmpresa(Integer idtamano) {
        this.idtamano = idtamano;
    }

    public TTamanoEmpresa(Integer idtamano, String desctamano) {
        this.idtamano = idtamano;
        this.desctamano = desctamano;
    }

    public Integer getIdtamano() {
        return idtamano;
    }

    public void setIdtamano(Integer idtamano) {
        this.idtamano = idtamano;
    }

    public String getDesctamano() {
        return desctamano;
    }

    public void setDesctamano(String desctamano) {
        this.desctamano = desctamano;
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
        hash += (idtamano != null ? idtamano.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTamanoEmpresa)) {
            return false;
        }
        TTamanoEmpresa other = (TTamanoEmpresa) object;
        if ((this.idtamano == null && other.idtamano != null) || (this.idtamano != null && !this.idtamano.equals(other.idtamano))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TTamanoEmpresa[ idtamano=" + idtamano + " ]";
    }
    
}
