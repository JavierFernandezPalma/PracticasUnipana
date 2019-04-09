package Entityes;

import Entityes.TEstudiantes;
import Entityes.TFacultad;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-07T14:34:48")
@StaticMetamodel(TProgramaAcademico.class)
public class TProgramaAcademico_ { 

    public static volatile SingularAttribute<TProgramaAcademico, TFacultad> idfacultad;
    public static volatile SingularAttribute<TProgramaAcademico, String> descprograma;
    public static volatile SingularAttribute<TProgramaAcademico, Integer> idprograma;
    public static volatile ListAttribute<TProgramaAcademico, TEstudiantes> tEstudiantesList;

}