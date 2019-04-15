package Entityes;

import Entityes.TEstudiantes;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-14T20:04:53")
@StaticMetamodel(TSemestre.class)
public class TSemestre_ { 

    public static volatile SingularAttribute<TSemestre, Integer> idsemestre;
    public static volatile SingularAttribute<TSemestre, String> descsemestre;
    public static volatile ListAttribute<TSemestre, TEstudiantes> tEstudiantesList;

}