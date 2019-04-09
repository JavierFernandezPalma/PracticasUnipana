/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entityes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Javier_Toto
 */
@Entity
@Table(name = "t_claves")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TClaves.findAll", query = "SELECT t FROM TClaves t")
    , @NamedQuery(name = "TClaves.findByIdclave", query = "SELECT t FROM TClaves t WHERE t.idclave = :idclave")
    , @NamedQuery(name = "TClaves.findByPassword", query = "SELECT t FROM TClaves t WHERE t.password = :password")
    , @NamedQuery(name = "TClaves.findByFinicio", query = "SELECT t FROM TClaves t WHERE t.finicio = :finicio")
    , @NamedQuery(name = "TClaves.findByHora", query = "SELECT t FROM TClaves t WHERE t.hora = :hora")})
public class TClaves implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_clave")
    private Integer idclave;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "F_inicio")
    @Temporal(TemporalType.DATE)
    private Date finicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @JoinColumn(name = "Identificacion", referencedColumnName = "Identificacion")
    @JoinColumn(name = "Id_perfil", referencedColumnName = "Id_perfil")
    @ManyToOne(optional = false)
    private TUsuarios identificacion;

    public TClaves() {
    }

    public TClaves(Integer idclave) {
        this.idclave = idclave;
    }

    public TClaves(Integer idclave, String password, Date finicio, Date hora) {
        this.idclave = idclave;
        this.password = password;
        this.finicio = finicio;
        this.hora = hora;
    }

    public Integer getIdclave() {
        return idclave;
    }

    public void setIdclave(Integer idclave) {
        this.idclave = idclave;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFinicio() {
        return finicio;
    }

    public void setFinicio(Date finicio) {
        this.finicio = finicio;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
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
        hash += (idclave != null ? idclave.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TClaves)) {
            return false;
        }
        TClaves other = (TClaves) object;
        if ((this.idclave == null && other.idclave != null) || (this.idclave != null && !this.idclave.equals(other.idclave))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TClaves[ idclave=" + idclave + " ]";
    }
    
}
