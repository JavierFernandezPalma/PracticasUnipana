/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TAplicarVacante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TAplicarVacanteFacadeLocal {

    void create(TAplicarVacante tAplicarVacante);

    void edit(TAplicarVacante tAplicarVacante);

    void remove(TAplicarVacante tAplicarVacante);

    TAplicarVacante find(Object id);

    List<TAplicarVacante> findAll();

    List<TAplicarVacante> findRange(int[] range);

    int count();
    
}
