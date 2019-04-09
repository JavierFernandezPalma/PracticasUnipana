package Entityes;

import Entityes.TUsuarios;
import Entityes.TVacante;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-07T14:34:48")
@StaticMetamodel(TEstados.class)
public class TEstados_ { 

    public static volatile ListAttribute<TEstados, TVacante> tVacanteList;
    public static volatile SingularAttribute<TEstados, String> descestado;
    public static volatile ListAttribute<TEstados, TUsuarios> tUsuariosList;
    public static volatile SingularAttribute<TEstados, Integer> idestado;

}