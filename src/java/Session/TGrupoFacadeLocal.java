/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TGrupo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TGrupoFacadeLocal {

    void create(TGrupo tGrupo);

    void edit(TGrupo tGrupo);

    void remove(TGrupo tGrupo);

    TGrupo find(Object id);

    List<TGrupo> findAll();

    List<TGrupo> findRange(int[] range);

    int count();
    
}
