/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TEstudiantes;
import View.VEstudiantes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TEstudiantesFacadeLocal {

    void create(TEstudiantes tEstudiantes);

    void edit(TEstudiantes tEstudiantes);

    void remove(TEstudiantes tEstudiantes);

    TEstudiantes find(Object id);

    List<TEstudiantes> findAll();

    List<TEstudiantes> findRange(int[] range);

    int count();

    public List<VEstudiantes> findAll_Estudiantes();
    
}
