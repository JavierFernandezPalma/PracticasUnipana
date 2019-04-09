/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TFacultad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TFacultadFacadeLocal {

    void create(TFacultad tFacultad);

    void edit(TFacultad tFacultad);

    void remove(TFacultad tFacultad);

    TFacultad find(Object id);

    List<TFacultad> findAll();

    List<TFacultad> findRange(int[] range);

    int count();
    
}
