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
@Table(name = "t_docentes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TDocentes.findAll", query = "SELECT t FROM TDocentes t")
    , @NamedQuery(name = "TDocentes.findByIddocente", query = "SELECT t FROM TDocentes t WHERE t.iddocente = :iddocente")
    , @NamedQuery(name = "TDocentes.findByIdprograma", query = "SELECT t FROM TDocentes t WHERE t.idprograma = :idprograma")})
public class TDocentes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "Id_docente")
    private String iddocente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_programa")
    private int idprograma;

    public TDocentes() {
    }

    public TDocentes(String iddocente) {
        this.iddocente = iddocente;
    }

    public TDocentes(String iddocente, int idprograma) {
        this.iddocente = iddocente;
        this.idprograma = idprograma;
    }

    public String getIddocente() {
        return iddocente;
    }

    public void setIddocente(String iddocente) {
        this.iddocente = iddocente;
    }

    public int getIdprograma() {
        return idprograma;
    }

    public void setIdprograma(int idprograma) {
        this.idprograma = idprograma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddocente != null ? iddocente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TDocentes)) {
            return false;
        }
        TDocentes other = (TDocentes) object;
        if ((this.iddocente == null && other.iddocente != null) || (this.iddocente != null && !this.iddocente.equals(other.iddocente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TDocentes[ iddocente=" + iddocente + " ]";
    }
    
}
