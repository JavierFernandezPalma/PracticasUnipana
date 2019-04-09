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
@Table(name = "t_departamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TDepartamento.findAll", query = "SELECT t FROM TDepartamento t")
    , @NamedQuery(name = "TDepartamento.findByIddepartamento", query = "SELECT t FROM TDepartamento t WHERE t.iddepartamento = :iddepartamento")
    , @NamedQuery(name = "TDepartamento.findByDescdepartamento", query = "SELECT t FROM TDepartamento t WHERE t.descdepartamento = :descdepartamento")})
public class TDepartamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_departamento")
    private Integer iddepartamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_departamento")
    private String descdepartamento;
    @OneToMany(mappedBy = "iddepartamento")
    private List<TPracticas> tPracticasList;
    @OneToMany(mappedBy = "iddepartamento")
    private List<TEmpresas> tEmpresasList;

    public TDepartamento() {
    }

    public TDepartamento(Integer iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public TDepartamento(Integer iddepartamento, String descdepartamento) {
        this.iddepartamento = iddepartamento;
        this.descdepartamento = descdepartamento;
    }

    public Integer getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(Integer iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public String getDescdepartamento() {
        return descdepartamento;
    }

    public void setDescdepartamento(String descdepartamento) {
        this.descdepartamento = descdepartamento;
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
        hash += (iddepartamento != null ? iddepartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TDepartamento)) {
            return false;
        }
        TDepartamento other = (TDepartamento) object;
        if ((this.iddepartamento == null && other.iddepartamento != null) || (this.iddepartamento != null && !this.iddepartamento.equals(other.iddepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TDepartamento[ iddepartamento=" + iddepartamento + " ]";
    }
    
}
