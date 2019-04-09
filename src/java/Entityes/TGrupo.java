/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entityes;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Javier_Toto
 */
@Entity
@Table(name = "t_grupo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TGrupo.findAll", query = "SELECT t FROM TGrupo t")
    , @NamedQuery(name = "TGrupo.findByCodigogrupo", query = "SELECT t FROM TGrupo t WHERE t.codigogrupo = :codigogrupo")
    , @NamedQuery(name = "TGrupo.findByFcreaciongrupo", query = "SELECT t FROM TGrupo t WHERE t.fcreaciongrupo = :fcreaciongrupo")
    , @NamedQuery(name = "TGrupo.findByFcierregrupo", query = "SELECT t FROM TGrupo t WHERE t.fcierregrupo = :fcierregrupo")})
public class TGrupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Codigo_grupo")
    private Integer codigogrupo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "F_creacion_grupo")
    @Temporal(TemporalType.DATE)
    private Date fcreaciongrupo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "F_cierre_grupo")
    @Temporal(TemporalType.DATE)
    private Date fcierregrupo;
    @JoinColumn(name = "Identificacion", referencedColumnName = "Identificacion")
    @JoinColumn(name = "Id_perfil", referencedColumnName = "Id_perfil")
    @ManyToOne(optional = false)
    private TUsuarios identificacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tGrupo")
    private List<TEntregar> tEntregarList;

    public TGrupo() {
    }

    public TGrupo(Integer codigogrupo) {
        this.codigogrupo = codigogrupo;
    }

    public TGrupo(Integer codigogrupo, Date fcreaciongrupo, Date fcierregrupo) {
        this.codigogrupo = codigogrupo;
        this.fcreaciongrupo = fcreaciongrupo;
        this.fcierregrupo = fcierregrupo;
    }

    public Integer getCodigogrupo() {
        return codigogrupo;
    }

    public void setCodigogrupo(Integer codigogrupo) {
        this.codigogrupo = codigogrupo;
    }

    public Date getFcreaciongrupo() {
        return fcreaciongrupo;
    }

    public void setFcreaciongrupo(Date fcreaciongrupo) {
        this.fcreaciongrupo = fcreaciongrupo;
    }

    public Date getFcierregrupo() {
        return fcierregrupo;
    }

    public void setFcierregrupo(Date fcierregrupo) {
        this.fcierregrupo = fcierregrupo;
    }

    public TUsuarios getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(TUsuarios identificacion) {
        this.identificacion = identificacion;
    }

    @XmlTransient
    public List<TEntregar> getTEntregarList() {
        return tEntregarList;
    }

    public void setTEntregarList(List<TEntregar> tEntregarList) {
        this.tEntregarList = tEntregarList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigogrupo != null ? codigogrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TGrupo)) {
            return false;
        }
        TGrupo other = (TGrupo) object;
        if ((this.codigogrupo == null && other.codigogrupo != null) || (this.codigogrupo != null && !this.codigogrupo.equals(other.codigogrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TGrupo[ codigogrupo=" + codigogrupo + " ]";
    }
    
}
