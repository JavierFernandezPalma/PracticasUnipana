/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TCiudad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TCiudadFacadeLocal {

    void create(TCiudad tCiudad);

    void edit(TCiudad tCiudad);

    void remove(TCiudad tCiudad);

    TCiudad find(Object id);

    List<TCiudad> findAll();

    List<TCiudad> findRange(int[] range);

    int count();
    
}
