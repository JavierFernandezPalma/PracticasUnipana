/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TTipoTelefonos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TTipoTelefonosFacadeLocal {

    void create(TTipoTelefonos tTipoTelefonos);

    void edit(TTipoTelefonos tTipoTelefonos);

    void remove(TTipoTelefonos tTipoTelefonos);

    TTipoTelefonos find(Object id);

    List<TTipoTelefonos> findAll();

    List<TTipoTelefonos> findRange(int[] range);

    int count();
    
}
