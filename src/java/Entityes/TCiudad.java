/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entityes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "t_ciudad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TCiudad.findAll", query = "SELECT t FROM TCiudad t")
    , @NamedQuery(name = "TCiudad.findByIdciudad", query = "SELECT t FROM TCiudad t WHERE t.idciudad = :idciudad")
    , @NamedQuery(name = "TCiudad.findByIddepartamento", query = "SELECT t FROM TCiudad t WHERE t.iddepartamento = :iddepartamento")
    , @NamedQuery(name = "TCiudad.findByDescciudad", query = "SELECT t FROM TCiudad t WHERE t.descciudad = :descciudad")})
public class TCiudad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_ciudad")
    private Integer idciudad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_departamento")
    private int iddepartamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_ciudad")
    private String descciudad;
    @OneToMany(mappedBy = "idciudad")
    private List<TPracticas> tPracticasList;
    @OneToMany(mappedBy = "idciudad")
    private List<TEmpresas> tEmpresasList;

    public TCiudad() {
    }

    public TCiudad(Integer idciudad) {
        this.idciudad = idciudad;
    }

    public TCiudad(Integer idciudad, int iddepartamento, String descciudad) {
        this.idciudad = idciudad;
        this.iddepartamento = iddepartamento;
        this.descciudad = descciudad;
    }

    public Integer getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(Integer idciudad) {
        this.idciudad = idciudad;
    }

    public int getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public String getDescciudad() {
        return descciudad;
    }

    public void setDescciudad(String descciudad) {
        this.descciudad = descciudad;
    }

    @XmlTransient
    public List<TPracticas> getTPracticasList() {
        return tPracticasList;
    }

    public void setTPracticasList(List<TPracticas> tPracticasList) {
        this.tPracticasList = tPracticasList;
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
        hash += (idciudad != null ? idciudad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TCiudad)) {
            return false;
        }
        TCiudad other = (TCiudad) object;
        if ((this.idciudad == null && other.idciudad != null) || (this.idciudad != null && !this.idciudad.equals(other.idciudad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TCiudad[ idciudad=" + idciudad + " ]";
    }
    
}
