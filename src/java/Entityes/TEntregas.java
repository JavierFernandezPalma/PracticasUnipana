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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "t_entregas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TEntregas.findAll", query = "SELECT t FROM TEntregas t")
    , @NamedQuery(name = "TEntregas.findByCodigoentregas", query = "SELECT t FROM TEntregas t WHERE t.codigoentregas = :codigoentregas")
    , @NamedQuery(name = "TEntregas.findByArchivoentregas", query = "SELECT t FROM TEntregas t WHERE t.archivoentregas = :archivoentregas")
    , @NamedQuery(name = "TEntregas.findByDescentregas", query = "SELECT t FROM TEntregas t WHERE t.descentregas = :descentregas")
    , @NamedQuery(name = "TEntregas.findByCorteentregas", query = "SELECT t FROM TEntregas t WHERE t.corteentregas = :corteentregas")})
public class TEntregas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Codigo_entregas")
    private Integer codigoentregas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Archivo_entregas")
    private String archivoentregas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_entregas")
    private String descentregas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Corte_entregas")
    private int corteentregas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tEntregas")
    private List<TEntregar> tEntregarList;
    @JoinColumn(name = "Identificacion", referencedColumnName = "Identificacion")
    @JoinColumn(name = "Id_perfil", referencedColumnName = "Id_perfil")
    @ManyToOne(optional = false)
    private TUsuarios identificacion;

    public TEntregas() {
    }

    public TEntregas(Integer codigoentregas) {
        this.codigoentregas = codigoentregas;
    }

    public TEntregas(Integer codigoentregas, String archivoentregas, String descentregas, int corteentregas) {
        this.codigoentregas = codigoentregas;
        this.archivoentregas = archivoentregas;
        this.descentregas = descentregas;
        this.corteentregas = corteentregas;
    }

    public Integer getCodigoentregas() {
        return codigoentregas;
    }

    public void setCodigoentregas(Integer codigoentregas) {
        this.codigoentregas = codigoentregas;
    }

    public String getArchivoentregas() {
        return archivoentregas;
    }

    public void setArchivoentregas(String archivoentregas) {
        this.archivoentregas = archivoentregas;
    }

    public String getDescentregas() {
        return descentregas;
    }

    public void setDescentregas(String descentregas) {
        this.descentregas = descentregas;
    }

    public int getCorteentregas() {
        return corteentregas;
    }

    public void setCorteentregas(int corteentregas) {
        this.corteentregas = corteentregas;
    }

    @XmlTransient
    public List<TEntregar> getTEntregarList() {
        return tEntregarList;
    }

    public void setTEntregarList(List<TEntregar> tEntregarList) {
        this.tEntregarList = tEntregarList;
    }

    public TUsuarios getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(TUsuarios identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoentregas != null ? codigoentregas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TEntregas)) {
            return false;
        }
        TEntregas other = (TEntregas) object;
        if ((this.codigoentregas == null && other.codigoentregas != null) || (this.codigoentregas != null && !this.codigoentregas.equals(other.codigoentregas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TEntregas[ codigoentregas=" + codigoentregas + " ]";
    }
    
}
