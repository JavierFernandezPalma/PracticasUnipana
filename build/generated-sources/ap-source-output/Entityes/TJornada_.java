package Entityes;

import Entityes.TEstudiantes;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-07T14:34:48")
@StaticMetamodel(TJornada.class)
public class TJornada_ { 

    public static volatile SingularAttribute<TJornada, String> descjornada;
    public static volatile SingularAttribute<TJornada, Integer> idjornada;
    public static volatile ListAttribute<TJornada, TEstudiantes> tEstudiantesList;

}