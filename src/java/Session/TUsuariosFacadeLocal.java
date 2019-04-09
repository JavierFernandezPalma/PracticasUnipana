/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TUsuarios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TUsuariosFacadeLocal {

    void create(TUsuarios tUsuarios);

    void edit(TUsuarios tUsuarios);

    void remove(TUsuarios tUsuarios);

    TUsuarios find(Object id);

    List<TUsuarios> findAll();

    List<TUsuarios> findRange(int[] range);

    int count();

    public TUsuarios validar(String usuario, String password);

    public TUsuarios iniciarSesion(TUsuarios login);
    
}
