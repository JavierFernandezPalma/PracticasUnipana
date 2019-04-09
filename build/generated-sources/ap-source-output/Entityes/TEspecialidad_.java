package Entityes;

import Entityes.TEstudiantes;
import Entityes.TVacante;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-07T14:34:48")
@StaticMetamodel(TEspecialidad.class)
public class TEspecialidad_ { 

    public static volatile ListAttribute<TEspecialidad, TVacante> tVacanteList;
    public static volatile SingularAttribute<TEspecialidad, Integer> idprograma;
    public static volatile SingularAttribute<TEspecialidad, Integer> idespecialidad;
    public static volatile SingularAttribute<TEspecialidad, String> descespecialidad;
    public static volatile ListAttribute<TEspecialidad, TEstudiantes> tEstudiantesList;

}