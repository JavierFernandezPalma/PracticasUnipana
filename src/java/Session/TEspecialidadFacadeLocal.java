/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TEspecialidad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TEspecialidadFacadeLocal {

    void create(TEspecialidad tEspecialidad);

    void edit(TEspecialidad tEspecialidad);

    void remove(TEspecialidad tEspecialidad);

    TEspecialidad find(Object id);

    List<TEspecialidad> findAll();

    List<TEspecialidad> findRange(int[] range);

    int count();
    
}
