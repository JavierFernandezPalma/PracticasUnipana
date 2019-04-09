/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TDocentes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TDocentesFacadeLocal {

    void create(TDocentes tDocentes);

    void edit(TDocentes tDocentes);

    void remove(TDocentes tDocentes);

    TDocentes find(Object id);

    List<TDocentes> findAll();

    List<TDocentes> findRange(int[] range);

    int count();
    
}
