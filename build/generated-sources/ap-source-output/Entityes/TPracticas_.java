package Entityes;

import Entityes.TCiudad;
import Entityes.TDepartamento;
import Entityes.TEmpresas;
import Entityes.TEstudiantes;
import Entityes.TModalidadPractica;
import Entityes.TPracticasPK;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-07T14:34:48")
@StaticMetamodel(TPracticas.class)
public class TPracticas_ { 

    public static volatile SingularAttribute<TPracticas, BigDecimal> remuneracion;
    public static volatile SingularAttribute<TPracticas, Date> finiciopractica;
    public static volatile SingularAttribute<TPracticas, String> supervisorlaboral;
    public static volatile SingularAttribute<TPracticas, String> descpractica;
    public static volatile SingularAttribute<TPracticas, Integer> vinculacion;
    public static volatile SingularAttribute<TPracticas, TCiudad> idciudad;
    public static volatile SingularAttribute<TPracticas, String> areapractica;
    public static volatile SingularAttribute<TPracticas, TPracticasPK> tPracticasPK;
    public static volatile SingularAttribute<TPracticas, String> direccionpractica;
    public static volatile SingularAttribute<TPracticas, BigInteger> contactosupervisorlaboral;
    public static volatile SingularAttribute<TPracticas, TEmpresas> idempresa;
    public static volatile SingularAttribute<TPracticas, TModalidadPractica> idmodalidadpractica;
    public static volatile SingularAttribute<TPracticas, String> nomdireccion;
    public static volatile SingularAttribute<TPracticas, Date> ffinpractica;
    public static volatile SingularAttribute<TPracticas, String> cargo;
    public static volatile SingularAttribute<TPracticas, TDepartamento> iddepartamento;
    public static volatile SingularAttribute<TPracticas, Integer> idseguimiento;
    public static volatile SingularAttribute<TPracticas, TEstudiantes> tEstudiantes;
    public static volatile SingularAttribute<TPracticas, String> observacionofipracticas;

}