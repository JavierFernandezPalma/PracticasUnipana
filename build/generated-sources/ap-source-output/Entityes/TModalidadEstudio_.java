package Entityes;

import Entityes.TEstudiantes;
import Entityes.TVacante;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-07T14:34:48")
@StaticMetamodel(TModalidadEstudio.class)
public class TModalidadEstudio_ { 

    public static volatile ListAttribute<TModalidadEstudio, TVacante> tVacanteList;
    public static volatile SingularAttribute<TModalidadEstudio, Integer> idmodalidad;
    public static volatile ListAttribute<TModalidadEstudio, TEstudiantes> tEstudiantesList;
    public static volatile SingularAttribute<TModalidadEstudio, String> descmodalidad;

}