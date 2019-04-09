package Entityes;

import Entityes.TEmpresas;
import Entityes.TEspecialidad;
import Entityes.TEstados;
import Entityes.TModalidadEstudio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-07T14:34:48")
@StaticMetamodel(TVacante.class)
public class TVacante_ { 

    public static volatile SingularAttribute<TVacante, Integer> remuneracionvacante;
    public static volatile SingularAttribute<TVacante, Date> fpublica;
    public static volatile SingularAttribute<TVacante, String> descvacante;
    public static volatile SingularAttribute<TVacante, TEmpresas> idempresa;
    public static volatile SingularAttribute<TVacante, String> observacante;
    public static volatile SingularAttribute<TVacante, Integer> idvacante;
    public static volatile SingularAttribute<TVacante, TEspecialidad> idespecialidad;
    public static volatile SingularAttribute<TVacante, TModalidadEstudio> idmodalidad;
    public static volatile SingularAttribute<TVacante, Date> fbajavacante;
    public static volatile SingularAttribute<TVacante, Integer> vacantes;
    public static volatile SingularAttribute<TVacante, String> anexovacante;
    public static volatile SingularAttribute<TVacante, TEstados> idestado;

}