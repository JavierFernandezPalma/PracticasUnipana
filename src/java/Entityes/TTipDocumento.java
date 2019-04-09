/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entityes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Javier_Toto
 */
@Entity
@Table(name = "t_tip_documento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTipDocumento.findAll", query = "SELECT t FROM TTipDocumento t")
    , @NamedQuery(name = "TTipDocumento.findByIdTipDocuemnto", query = "SELECT t FROM TTipDocumento t WHERE t.idTipDocuemnto = :idTipDocuemnto")
    , @NamedQuery(name = "TTipDocumento.findByDescTipDocumento", query = "SELECT t FROM TTipDocumento t WHERE t.descTipDocumento = :descTipDocumento")})
public class TTipDocumento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_TipDocuemnto")
    private Integer idTipDocuemnto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Desc_TipDocumento")
    private String descTipDocumento;

    public TTipDocumento() {
    }

    public TTipDocumento(Integer idTipDocuemnto) {
        this.idTipDocuemnto = idTipDocuemnto;
    }

    public TTipDocumento(Integer idTipDocuemnto, String descTipDocumento) {
        this.idTipDocuemnto = idTipDocuemnto;
        this.descTipDocumento = descTipDocumento;
    }

    public Integer getIdTipDocuemnto() {
        return idTipDocuemnto;
    }

    public void setIdTipDocuemnto(Integer idTipDocuemnto) {
        this.idTipDocuemnto = idTipDocuemnto;
    }

    public String getDescTipDocumento() {
        return descTipDocumento;
    }

    public void setDescTipDocumento(String descTipDocumento) {
        this.descTipDocumento = descTipDocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipDocuemnto != null ? idTipDocuemnto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTipDocumento)) {
            return false;
        }
        TTipDocumento other = (TTipDocumento) object;
        if ((this.idTipDocuemnto == null && other.idTipDocuemnto != null) || (this.idTipDocuemnto != null && !this.idTipDocuemnto.equals(other.idTipDocuemnto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TTipDocumento[ idTipDocuemnto=" + idTipDocuemnto + " ]";
    }
    
}
