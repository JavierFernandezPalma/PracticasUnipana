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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Javier_Toto
 */
@Entity
@Table(name = "t_usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TUsuarios.login", query = "SELECT t.tUsuariosPK.identificacion FROM TUsuarios t WHERE t.usuario = :usuario AND t.password = :password")
    , @NamedQuery(name = "TUsuarios.findAll", query = "SELECT t FROM TUsuarios t")
    , @NamedQuery(name = "TUsuarios.findByIdentificacion", query = "SELECT t FROM TUsuarios t WHERE t.tUsuariosPK.identificacion = :identificacion")
    , @NamedQuery(name = "TUsuarios.findByIddocumento", query = "SELECT t FROM TUsuarios t WHERE t.iddocumento = :iddocumento")
    , @NamedQuery(name = "TUsuarios.findByIdperfil", query = "SELECT t FROM TUsuarios t WHERE t.tUsuariosPK.idperfil = :idperfil")
    , @NamedQuery(name = "TUsuarios.findByFexpdoc", query = "SELECT t FROM TUsuarios t WHERE t.fexpdoc = :fexpdoc")
    , @NamedQuery(name = "TUsuarios.findByNombres", query = "SELECT t FROM TUsuarios t WHERE t.nombres = :nombres")
    , @NamedQuery(name = "TUsuarios.findByApellidos", query = "SELECT t FROM TUsuarios t WHERE t.apellidos = :apellidos")
    , @NamedQuery(name = "TUsuarios.findByFechanacimiento", query = "SELECT t FROM TUsuarios t WHERE t.fechanacimiento = :fechanacimiento")
    , @NamedQuery(name = "TUsuarios.findByUsuario", query = "SELECT t FROM TUsuarios t WHERE t.usuario = :usuario")
    , @NamedQuery(name = "TUsuarios.findByPassword", query = "SELECT t FROM TUsuarios t WHERE t.password = :password")
    , @NamedQuery(name = "TUsuarios.findByFoto", query = "SELECT t FROM TUsuarios t WHERE t.foto = :foto")
    , @NamedQuery(name = "TUsuarios.findByFcreacion", query = "SELECT t FROM TUsuarios t WHERE t.fcreacion = :fcreacion")
    , @NamedQuery(name = "TUsuarios.findByFfinsession", query = "SELECT t FROM TUsuarios t WHERE t.ffinsession = :ffinsession")})
public class TUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TUsuariosPK tUsuariosPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_documento")
    private int iddocumento;
    @Column(name = "F_exp_doc")
    @Temporal(TemporalType.DATE)
    private Date fexpdoc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Apellidos")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Usuario")
    private String usuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Password")
    private String password;
    @Size(max = 50)
    @Column(name = "Foto")
    private String foto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "F_creacion")
    @Temporal(TemporalType.DATE)
    private Date fcreacion;
    @Column(name = "F_fin_session")
    @Temporal(TemporalType.DATE)
    private Date ffinsession;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tUsuarios")
    private TEstudiantes tEstudiantes;
    @JoinColumn(name = "Id_estado", referencedColumnName = "Id_estado")
    @ManyToOne(optional = false)
    private TEstados idestado;
    @JoinColumn(name = "Id_perfil", referencedColumnName = "Id_perfil", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TPerfilUsuarios tPerfilUsuarios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identificacion")
    private List<TMails> tMailsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identificacion")
    private List<TGrupo> tGrupoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identificacion")
    private List<TAuditoria> tAuditoriaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identificacion")
    private List<TEmpresas> tEmpresasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identificacion")
    private List<TClaves> tClavesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identificacion")
    private List<TTelefonos> tTelefonosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identificacion")
    private List<TEntregas> tEntregasList;

    public TUsuarios() {
    }

    public TUsuarios(TUsuariosPK tUsuariosPK) {
        this.tUsuariosPK = tUsuariosPK;
    }

    public TUsuarios(TUsuariosPK tUsuariosPK, int iddocumento, String nombres, String apellidos, Date fechanacimiento, String usuario, String password, Date fcreacion) {
        this.tUsuariosPK = tUsuariosPK;
        this.iddocumento = iddocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.usuario = usuario;
        this.password = password;
        this.fcreacion = fcreacion;
    }

    public TUsuarios(String identificacion, int idperfil) {
        this.tUsuariosPK = new TUsuariosPK(identificacion, idperfil);
    }

    public TUsuariosPK getTUsuariosPK() {
        return tUsuariosPK;
    }

    public void setTUsuariosPK(TUsuariosPK tUsuariosPK) {
        this.tUsuariosPK = tUsuariosPK;
    }

    public int getIddocumento() {
        return iddocumento;
    }

    public void setIddocumento(int iddocumento) {
        this.iddocumento = iddocumento;
    }

    public Date getFexpdoc() {
        return fexpdoc;
    }

    public void setFexpdoc(Date fexpdoc) {
        this.fexpdoc = fexpdoc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Date getFcreacion() {
        return fcreacion;
    }

    public void setFcreacion(Date fcreacion) {
        this.fcreacion = fcreacion;
    }

    public Date getFfinsession() {
        return ffinsession;
    }

    public void setFfinsession(Date ffinsession) {
        this.ffinsession = ffinsession;
    }

    public TEstudiantes getTEstudiantes() {
        return tEstudiantes;
    }

    public void setTEstudiantes(TEstudiantes tEstudiantes) {
        this.tEstudiantes = tEstudiantes;
    }

    public TEstados getIdestado() {
        return idestado;
    }

    public void setIdestado(TEstados idestado) {
        this.idestado = idestado;
    }

    public TPerfilUsuarios getTPerfilUsuarios() {
        return tPerfilUsuarios;
    }

    public void setTPerfilUsuarios(TPerfilUsuarios tPerfilUsuarios) {
        this.tPerfilUsuarios = tPerfilUsuarios;
    }

    @XmlTransient
    public List<TMails> getTMailsList() {
        return tMailsList;
    }

    public void setTMailsList(List<TMails> tMailsList) {
        this.tMailsList = tMailsList;
    }

    @XmlTransient
    public List<TGrupo> getTGrupoList() {
        return tGrupoList;
    }

    public void setTGrupoList(List<TGrupo> tGrupoList) {
        this.tGrupoList = tGrupoList;
    }

    @XmlTransient
    public List<TAuditoria> getTAuditoriaList() {
        return tAuditoriaList;
    }

    public void setTAuditoriaList(List<TAuditoria> tAuditoriaList) {
        this.tAuditoriaList = tAuditoriaList;
    }

    @XmlTransient
    public List<TEmpresas> getTEmpresasList() {
        return tEmpresasList;
    }

    public void setTEmpresasList(List<TEmpresas> tEmpresasList) {
        this.tEmpresasList = tEmpresasList;
    }

    @XmlTransient
    public List<TClaves> getTClavesList() {
        return tClavesList;
    }

    public void setTClavesList(List<TClaves> tClavesList) {
        this.tClavesList = tClavesList;
    }

    @XmlTransient
    public List<TTelefonos> getTTelefonosList() {
        return tTelefonosList;
    }

    public void setTTelefonosList(List<TTelefonos> tTelefonosList) {
        this.tTelefonosList = tTelefonosList;
    }

    @XmlTransient
    public List<TEntregas> getTEntregasList() {
        return tEntregasList;
    }

    public void setTEntregasList(List<TEntregas> tEntregasList) {
        this.tEntregasList = tEntregasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tUsuariosPK != null ? tUsuariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TUsuarios)) {
            return false;
        }
        TUsuarios other = (TUsuarios) object;
        if ((this.tUsuariosPK == null && other.tUsuariosPK != null) || (this.tUsuariosPK != null && !this.tUsuariosPK.equals(other.tUsuariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entityes.TUsuarios[ tUsuariosPK=" + tUsuariosPK + " ]";
    }

    public void getTUsuariosPK(TUsuariosPK tUsuariosPK) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
