/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TProgramaAcademico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TProgramaAcademicoFacadeLocal {

    void create(TProgramaAcademico tProgramaAcademico);

    void edit(TProgramaAcademico tProgramaAcademico);

    void remove(TProgramaAcademico tProgramaAcademico);

    TProgramaAcademico find(Object id);

    List<TProgramaAcademico> findAll();

    List<TProgramaAcademico> findRange(int[] range);

    int count();

    public List<TProgramaAcademico> findAll_Programa();
    
}
