package Entityes;

import Entityes.TEspecialidad;
import Entityes.TJornada;
import Entityes.TMateria;
import Entityes.TModalidadEstudio;
import Entityes.TPracticas;
import Entityes.TProgramaAcademico;
import Entityes.TSemestre;
import Entityes.TUsuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-14T20:04:53")
@StaticMetamodel(TEstudiantes.class)
public class TEstudiantes_ { 

    public static volatile SingularAttribute<TEstudiantes, TSemestre> idsemestre;
    public static volatile ListAttribute<TEstudiantes, TPracticas> tPracticasList;
    public static volatile SingularAttribute<TEstudiantes, TProgramaAcademico> idprograma;
    public static volatile SingularAttribute<TEstudiantes, TEspecialidad> idespecialidad;
    public static volatile SingularAttribute<TEstudiantes, String> identificacion;
    public static volatile SingularAttribute<TEstudiantes, TModalidadEstudio> idmodalidad;
    public static volatile SingularAttribute<TEstudiantes, TJornada> idjornada;
    public static volatile SingularAttribute<TEstudiantes, TMateria> codigomateria;
    public static volatile SingularAttribute<TEstudiantes, TUsuarios> tUsuarios;

}