package Entityes;

import Entityes.TEstudiantes;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-14T20:04:53")
@StaticMetamodel(TMateria.class)
public class TMateria_ { 

    public static volatile SingularAttribute<TMateria, String> descmateria;
    public static volatile ListAttribute<TMateria, TEstudiantes> tEstudiantesList;
    public static volatile SingularAttribute<TMateria, Integer> codigomateria;

}