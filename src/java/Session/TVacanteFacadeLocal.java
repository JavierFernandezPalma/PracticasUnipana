/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TVacante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TVacanteFacadeLocal {

    void create(TVacante tVacante);

    void edit(TVacante tVacante);

    void remove(TVacante tVacante);

    TVacante find(Object id);

    List<TVacante> findAll();

    List<TVacante> findRange(int[] range);

    int count();
    
}
