/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import Entityes.TEspecialidad;
import Entityes.TEstudiantes;
import View.VEstudiantes;
import Entityes.TFacultad;
import Entityes.TJornada;
import Entityes.TModalidadEstudio;
import Entityes.TProgramaAcademico;
import Entityes.TSemestre;
import Session.TEstudiantesFacadeLocal;
import Session.VEstudiantesFacadeLocal;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author Javier_Toto
 */
@ManagedBean
@ViewScoped
public class EstudiantesManagedBean  implements Serializable {

    private DataSource ds;
    
    private List<TEspecialidad> listaEspecialidadesList = null;
    private List<TProgramaAcademico> listaProgramaAcademicosList = null;
    private List<TJornada> listaJornadasList = null;
    private List<TModalidadEstudio> listaModalidadEstudiosList = null;
    private List<TSemestre> listaSemestreList = null;
    private List<VEstudiantes> listaEstudiantesList;
    private List<VEstudiantes> filtroEstudiantes = null;
    
    private int selectedEspecialidades;
    private int selectedProgramaAcademicos;
    private int selectedJornadas;
    private int selectedModalidadEstudios;
    private int selectedSemestre;
    private Date selectedDate1;
    private Date selectedDate2;


    private TEspecialidad especialidad = null;
    private TProgramaAcademico programaAcademico = null;
    private TFacultad facultad = null;
    private TJornada jornada = null;
    private TModalidadEstudio modalidadEstudio = null;
    private TSemestre semestre = null;
    
    private Date date1;
    private Date date2;
    
    private String documento = null;
    private VEstudiantes vEstudiantes;
    
    @EJB
    TEstudiantesFacadeLocal estudiantesFacadeLocal;
    private TEstudiantes estudiantes;
    
    
     @PostConstruct
    public void init(){
        estudiantes = new TEstudiantes();

    }
    
    
    public int getSelectedEspecialidades() {
        return selectedEspecialidades;
    }
    
    public void setSelectedEspecialidades(int selectedEspecialidades) {
        this.selectedEspecialidades = selectedEspecialidades;
    }

    public int getSelectedProgramaAcademicos() {
        return selectedProgramaAcademicos;
    }

    public void setSelectedProgramaAcademicos(int selectedProgramaAcademicos) {
        this.selectedProgramaAcademicos = selectedProgramaAcademicos;
    }

    public int getSelectedJornadas() {
        return selectedJornadas;
    }

    public void setSelectedJornadas(int selectedJornadas) {
        this.selectedJornadas = selectedJornadas;
    }

    public int getSelectedModalidadEstudios() {
        return selectedModalidadEstudios;
    }

    public void setSelectedModalidadEstudios(int selectedModalidadEstudios) {
        this.selectedModalidadEstudios = selectedModalidadEstudios;
    }

    public int getSelectedSemestre() {
        return selectedSemestre;
    }

    public void setSelectedSemestre(int selectedSemestre) {
        this.selectedSemestre = selectedSemestre;
    }

    public Date getSelecteddate1() {
        return selectedDate1;
    }

    public void setSelecteddate1(Date selecteddate1) {
        this.selectedDate1 = selecteddate1;
    }

    public Date getSelecteddate2() {
        return selectedDate2;
    }

    public void setSelecteddate2(Date selecteddate2) {
        this.selectedDate2 = selecteddate2;
    }

    public List<TEspecialidad> getListaEspecialidadesList() {
        return listaEspecialidadesList;
    }

    public void setListaEspecialidadesList(List<TEspecialidad> listaEspecialidadesList) {
        this.listaEspecialidadesList = listaEspecialidadesList;
    }


    public List<TJornada> getListaJornadasList() {
        return listaJornadasList;
    }

    public void setListaJornadasList(List<TJornada> listaJornadasList) {
        this.listaJornadasList = listaJornadasList;
    }

    public List<TProgramaAcademico> getListaProgramaAcademicosList() {
        return listaProgramaAcademicosList;
    }

    public void setListaProgramaAcademicosList(List<TProgramaAcademico> listaProgramaAcademicosList) {
        this.listaProgramaAcademicosList = listaProgramaAcademicosList;
    }

    public List<TModalidadEstudio> getListaModalidadEstudiosList() {
        return listaModalidadEstudiosList;
    }

    public void setListaModalidadEstudiosList(List<TModalidadEstudio> listaModalidadEstudiosList) {
        this.listaModalidadEstudiosList = listaModalidadEstudiosList;
    }

    public List<TSemestre> getListaSemestreList() {
        return listaSemestreList;
    }

    public void setListaSemestreList(List<TSemestre> listaSemestreList) {
        this.listaSemestreList = listaSemestreList;
    }

    public List<VEstudiantes> getListaEstudiantesList() {
        return listaEstudiantesList;
    }

    public void setListaEstudiantesList(List<VEstudiantes> listaEstudiantesList) {
        this.listaEstudiantesList = listaEstudiantesList;
    }

    public List<VEstudiantes> getFiltroEstudiantes() {
        return filtroEstudiantes;
    }

    public void setFiltroEstudiantes(List<VEstudiantes> filtroEstudiantes) {
        this.filtroEstudiantes = filtroEstudiantes;
    }
                   
    public TEspecialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(TEspecialidad especialidad) {
        this.especialidad = especialidad;
    }

    public TProgramaAcademico getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(TProgramaAcademico programaAcademico) {
        this.programaAcademico = programaAcademico;
    }
    

    public TJornada getJornada() {
        return jornada;
    }

    public void setJornada(TJornada jornada) {
        this.jornada = jornada;
    }

    public TModalidadEstudio getModalidadEstudio() {
        return modalidadEstudio;
    }

    public void setModalidadEstudio(TModalidadEstudio modalidadEstudio) {
        this.modalidadEstudio = modalidadEstudio;
    }

    public TSemestre getSemestre() {
        return semestre;
    }

    public void setSemestre(TSemestre semestre) {
        this.semestre = semestre;
    }

    public TFacultad getFacultad() {
        return facultad;
    }

    public void setFacultad(TFacultad facultad) {
        this.facultad = facultad;
    }    

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public VEstudiantes getVEstudiantes() {
        return vEstudiantes;
    }

    public void setVEstudiantes(VEstudiantes vEstudiantes) {
        this.vEstudiantes = vEstudiantes;
    }
    

    public TEstudiantes getTEstudiantes() {
        return estudiantes;
    }

    public void setTEstudiantes(TEstudiantes tEstudiantes) {
        this.estudiantes = tEstudiantes;
    }
    
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public EstudiantesManagedBean() throws SQLException, Exception {
        ListEspecialidades();
        ListProgramaAcademicos();
        ListJornada();
        ListModalidadEstudios();
        ListSemestres();
        estudiantes = new TEstudiantes();
    }
    
        private List<TEspecialidad>  ListEspecialidades()  throws SQLException {
        
        
        try {
            Context ctx = new InitialContext();
            ds = (DataSource) ctx.lookup("jdbc/practicasPool");

        } catch (NamingException e) {
        }

        String sql = "SELECT * FROM practicas.t_especialidad ORDER BY Desc_especialidad ASC";
        String sql2 = "ORDER BY Desc_especialidad ASC";

        Connection con = ds.getConnection();
        ResultSet r = con.prepareStatement(sql).executeQuery();
        ArrayList lista = new ArrayList();
        while (r.next()) {
            int Id_especialidad = r.getInt("Id_especialidad");
            int Id_programa = r.getInt("Id_programa");
            String Desc_especialidad = r.getNString("Desc_especialidad");

            especialidad = new TEspecialidad(Id_especialidad, Id_programa, Desc_especialidad);
            lista.add(especialidad);

        }
        con.close();
        listaEspecialidadesList = lista;
       
        return listaEspecialidadesList;
    }
    

    private List<TJornada> ListJornada()   throws SQLException {
        
        try {
            Context ctx = new InitialContext();
            ds = (DataSource) ctx.lookup("jdbc/practicasPool");

        } catch (NamingException e) {
        }

        String sql = "SELECT * FROM practicas.t_jornada ORDER BY Desc_jornada ASC";
        String sql2 = "ORDER BY Desc_especialidad ASC";

        Connection con = ds.getConnection();
        ResultSet r = con.prepareStatement(sql).executeQuery();
        ArrayList lista = new ArrayList();
        while (r.next()) {
            int Id_jornada = r.getInt("Id_jornada");
            String Desc_jornada = r.getNString("Desc_jornada");

            jornada = new TJornada(Id_jornada, Desc_jornada);
            lista.add(jornada);

        }
        con.close();
        listaJornadasList = lista;
        
        return listaJornadasList;
    
    }
    
    
    
    private List<TProgramaAcademico> ListProgramaAcademicos() throws Exception {

        try {
            Context ctx = new InitialContext();
            ds = (DataSource) ctx.lookup("jdbc/practicasPool");

        } catch (NamingException e) {
        }

        String sql = "SELECT * FROM practicas.t_programa_academico ORDER BY Desc_programa ASC";
        String sql2 = "ORDER BY Desc_especialidad ASC";

        Connection con = ds.getConnection();
        ResultSet r = con.prepareStatement(sql).executeQuery();
        ArrayList lista = new ArrayList();

        while (r.next()) {
            int Id_programa = r.getInt("Id_programa");
            int Id_facultad = r.getInt("Id_facultad");
            String Desc_programa = r.getNString("Desc_programa");
            
            facultad = new TFacultad(Id_facultad);
            programaAcademico = new TProgramaAcademico(Id_programa, facultad, Desc_programa);

            lista.add(programaAcademico);

        }
        con.close();
        listaProgramaAcademicosList = lista;

//        TProgramaAcademicoFacade tProgramaAcademicoFacade = new TProgramaAcademicoFacade();
//
//        try {
//            listaProgramaAcademicosList = tProgramaAcademicoFacade.findAll_Programa();
//        } catch (Exception e) {
//        }
        return listaProgramaAcademicosList;

    }
        
        
     private List<TModalidadEstudio> ListModalidadEstudios()  throws Exception {

        try {
            Context ctx = new InitialContext();
            ds = (DataSource) ctx.lookup("jdbc/practicasPool");

        } catch (NamingException e) {
        }

        String sql = "SELECT * FROM practicas.t_modalidad_estudio ORDER BY Desc_modalidad ASC";
        String sql2 = "ORDER BY Desc_especialidad ASC";

        Connection con = ds.getConnection();
        ResultSet r = con.prepareStatement(sql).executeQuery();
        ArrayList lista = new ArrayList();
        while (r.next()) {
            int Id_modalidad = r.getInt("Id_modalidad");
            String Desc_modalidad = r.getNString("Desc_modalidad");

             modalidadEstudio = new TModalidadEstudio(Id_modalidad, Desc_modalidad);
            lista.add( modalidadEstudio);

        }
        con.close();
        listaModalidadEstudiosList = lista;
        
        return listaModalidadEstudiosList;
    
    }
     
     
         private List<TSemestre> ListSemestres()  throws Exception {

        try {
            Context ctx = new InitialContext();
            ds = (DataSource) ctx.lookup("jdbc/practicasPool");

        } catch (NamingException e) {
        }

        String sql = "SELECT * FROM practicas.t_semestre ORDER BY Id_semestre ASC";
        String sql2 = "ORDER BY Desc_especialidad ASC";

        Connection con = ds.getConnection();
        ResultSet r = con.prepareStatement(sql).executeQuery();
        ArrayList lista = new ArrayList();
        while (r.next()) {
            int Id_semestre = r.getInt("Id_semestre");
            String Desc_semestre = r.getNString("Desc_semestre");

             semestre = new TSemestre(Id_semestre, Desc_semestre);
            lista.add(semestre);

        }
        con.close();
        listaSemestreList = lista;
        
        return listaSemestreList;
    
    }
         
    public List<VEstudiantes> listEstudiantes() throws Exception {
        
        try {
            listaEstudiantesList = estudiantesFacadeLocal.findAll_Estudiantes();

        } catch (Exception e) {
        }

        return listaEstudiantesList;
    }

    
    public List<VEstudiantes> limpiarLista() throws Exception {
        try {
            listaEstudiantesList = null;
        } catch (Exception e) {
        }

        return listaEstudiantesList;
    }

}
