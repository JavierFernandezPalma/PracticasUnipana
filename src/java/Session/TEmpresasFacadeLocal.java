/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TEmpresas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TEmpresasFacadeLocal {

    void create(TEmpresas tEmpresas);

    void edit(TEmpresas tEmpresas);

    void remove(TEmpresas tEmpresas);

    TEmpresas find(Object id);

    List<TEmpresas> findAll();

    List<TEmpresas> findRange(int[] range);

    int count();
    
}
