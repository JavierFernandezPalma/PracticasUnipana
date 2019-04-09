/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TMateria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TMateriaFacadeLocal {

    void create(TMateria tMateria);

    void edit(TMateria tMateria);

    void remove(TMateria tMateria);

    TMateria find(Object id);

    List<TMateria> findAll();

    List<TMateria> findRange(int[] range);

    int count();
    
}
