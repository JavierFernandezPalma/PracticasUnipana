/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TSemestre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TSemestreFacadeLocal {

    void create(TSemestre tSemestre);

    void edit(TSemestre tSemestre);

    void remove(TSemestre tSemestre);

    TSemestre find(Object id);

    List<TSemestre> findAll();

    List<TSemestre> findRange(int[] range);

    int count();
    
}
