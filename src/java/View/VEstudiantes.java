/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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
@Table(name = "v_estudiantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VEstudiantes.findAll", query = "SELECT v FROM VEstudiantes v")
    , @NamedQuery(name = "VEstudiantes.findByIdentificacion", query = "SELECT v FROM VEstudiantes v WHERE v.identificacion = :identificacion")
    , @NamedQuery(name = "VEstudiantes.findByNombres", query = "SELECT v FROM VEstudiantes v WHERE v.nombres = :nombres")
    , @NamedQuery(name = "VEstudiantes.findByApellidos", query = "SELECT v FROM VEstudiantes v WHERE v.apellidos = :apellidos")
    , @NamedQuery(name = "VEstudiantes.findByDescespecialidad", query = "SELECT v FROM VEstudiantes v WHERE v.descespecialidad = :descespecialidad")
    , @NamedQuery(name = "VEstudiantes.findByDescprograma", query = "SELECT v FROM VEstudiantes v WHERE v.descprograma = :descprograma")
    , @NamedQuery(name = "VEstudiantes.findByDescjornada", query = "SELECT v FROM VEstudiantes v WHERE v.descjornada = :descjornada")
    , @NamedQuery(name = "VEstudiantes.findByDescmodalidad", query = "SELECT v FROM VEstudiantes v WHERE v.descmodalidad = :descmodalidad")
    , @NamedQuery(name = "VEstudiantes.findByDescsemestre", query = "SELECT v FROM VEstudiantes v WHERE v.descsemestre = :descsemestre")})
public class VEstudiantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "Identificacion")
    @Id
    private String identificacion;
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
    @Size(min = 1, max = 50)
    @Column(name = "Desc_especialidad")
    private String descespecialidad;
    @Size(max = 50)
    @Column(name = "Desc_programa")
    private String descprograma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_jornada")
    private String descjornada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_modalidad")
    private String descmodalidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Desc_semestre")
    private String descsemestre;

    public VEstudiantes() {
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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

    public String getDescespecialidad() {
        return descespecialidad;
    }

    public void setDescespecialidad(String descespecialidad) {
        this.descespecialidad = descespecialidad;
    }

    public String getDescprograma() {
        return descprograma;
    }

    public void setDescprograma(String descprograma) {
        this.descprograma = descprograma;
    }

    public String getDescjornada() {
        return descjornada;
    }

    public void setDescjornada(String descjornada) {
        this.descjornada = descjornada;
    }

    public String getDescmodalidad() {
        return descmodalidad;
    }

    public void setDescmodalidad(String descmodalidad) {
        this.descmodalidad = descmodalidad;
    }

    public String getDescsemestre() {
        return descsemestre;
    }

    public void setDescsemestre(String descsemestre) {
        this.descsemestre = descsemestre;
    }
    
}
