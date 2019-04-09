/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import View.VEstudiantes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface VEstudiantesFacadeLocal {

    void create(VEstudiantes vEstudiantes);

    void edit(VEstudiantes vEstudiantes);

    void remove(VEstudiantes vEstudiantes);

    VEstudiantes find(Object id);

    List<VEstudiantes> findAll();

    List<VEstudiantes> findRange(int[] range);

    int count();
    
}
