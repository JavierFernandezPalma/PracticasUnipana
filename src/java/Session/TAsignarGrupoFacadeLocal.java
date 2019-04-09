/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TAsignarGrupo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TAsignarGrupoFacadeLocal {

    void create(TAsignarGrupo tAsignarGrupo);

    void edit(TAsignarGrupo tAsignarGrupo);

    void remove(TAsignarGrupo tAsignarGrupo);

    TAsignarGrupo find(Object id);

    List<TAsignarGrupo> findAll();

    List<TAsignarGrupo> findRange(int[] range);

    int count();
    
}
