/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TPerfilUsuarios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TPerfilUsuariosFacadeLocal {

    void create(TPerfilUsuarios tPerfilUsuarios);

    void edit(TPerfilUsuarios tPerfilUsuarios);

    void remove(TPerfilUsuarios tPerfilUsuarios);

    TPerfilUsuarios find(Object id);

    List<TPerfilUsuarios> findAll();

    List<TPerfilUsuarios> findRange(int[] range);

    int count();
    
}
