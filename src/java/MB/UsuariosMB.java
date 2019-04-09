/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import Entityes.TEspecialidad;
import Entityes.TEstudiantes;
import Session.TEstudiantesFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author Javier_Toto
 */
@ManagedBean
@ViewScoped
public class UsuariosMB  implements Serializable {
    
    private int selectedEspecialidades;
    private String [] prueba;
    
    @EJB
    TEstudiantesFacadeLocal estudiantesFacadeLocal;
    private TEstudiantes estudiantes;

    @PostConstruct
    public void init() {
        estudiantes = new TEstudiantes();
    }

    public TEstudiantes getTEstudiantes() {
        return estudiantes;
    }

    public void setTEstudiantes(TEstudiantes estudiantes) {
        this.estudiantes = estudiantes;
    }

    public UsuariosMB() {

        estudiantes = new TEstudiantes();
    }

    public int  getSelectedEspecialidades() {
        return selectedEspecialidades;
    }

    public void setSelectedEspecialidades(int  selectedEspecialidades) {
        this.selectedEspecialidades = selectedEspecialidades;
    }

    public String [] getPrueba() {
        return prueba;
    }

    public void setPrueba(String [] prueba) {
        this.prueba = prueba;
    }
    
    
    
    public void cambio(){
        
        if(this.estudiantes.getIdespecialidad() != null && !this.estudiantes.getIdespecialidad().equals("")){
            selectedEspecialidades = estudiantes.getIdespecialidad().getIdespecialidad();
        }
    }
    
    public void prueba(){
        
        int  a = selectedEspecialidades;
        
        TEstudiantes es = estudiantes;
    }
    

}
