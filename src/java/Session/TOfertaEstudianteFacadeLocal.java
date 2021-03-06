/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TOfertaEstudiante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TOfertaEstudianteFacadeLocal {

    void create(TOfertaEstudiante tOfertaEstudiante);

    void edit(TOfertaEstudiante tOfertaEstudiante);

    void remove(TOfertaEstudiante tOfertaEstudiante);

    TOfertaEstudiante find(Object id);

    List<TOfertaEstudiante> findAll();

    List<TOfertaEstudiante> findRange(int[] range);

    int count();
    
}
