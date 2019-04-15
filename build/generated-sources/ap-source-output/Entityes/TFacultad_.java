package Entityes;

import Entityes.TProgramaAcademico;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-14T20:04:53")
@StaticMetamodel(TFacultad.class)
public class TFacultad_ { 

    public static volatile SingularAttribute<TFacultad, Integer> idfacultad;
    public static volatile SingularAttribute<TFacultad, String> descfacultad;
    public static volatile ListAttribute<TFacultad, TProgramaAcademico> tProgramaAcademicoList;

}