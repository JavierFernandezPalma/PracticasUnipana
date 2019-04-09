/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TTelefonos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TTelefonosFacadeLocal {

    void create(TTelefonos tTelefonos);

    void edit(TTelefonos tTelefonos);

    void remove(TTelefonos tTelefonos);

    TTelefonos find(Object id);

    List<TTelefonos> findAll();

    List<TTelefonos> findRange(int[] range);

    int count();
    
}
