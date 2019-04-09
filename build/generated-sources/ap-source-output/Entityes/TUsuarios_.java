package Entityes;

import Entityes.TAuditoria;
import Entityes.TClaves;
import Entityes.TEmpresas;
import Entityes.TEntregas;
import Entityes.TEstados;
import Entityes.TEstudiantes;
import Entityes.TGrupo;
import Entityes.TMails;
import Entityes.TPerfilUsuarios;
import Entityes.TTelefonos;
import Entityes.TUsuariosPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-07T14:34:48")
@StaticMetamodel(TUsuarios.class)
public class TUsuarios_ { 

    public static volatile SingularAttribute<TUsuarios, String> apellidos;
    public static volatile ListAttribute<TUsuarios, TEmpresas> tEmpresasList;
    public static volatile SingularAttribute<TUsuarios, Integer> iddocumento;
    public static volatile SingularAttribute<TUsuarios, Date> fexpdoc;
    public static volatile ListAttribute<TUsuarios, TClaves> tClavesList;
    public static volatile ListAttribute<TUsuarios, TMails> tMailsList;
    public static volatile SingularAttribute<TUsuarios, Date> fcreacion;
    public static volatile SingularAttribute<TUsuarios, TPerfilUsuarios> tPerfilUsuarios;
    public static volatile SingularAttribute<TUsuarios, String> nombres;
    public static volatile SingularAttribute<TUsuarios, TEstados> idestado;
    public static volatile ListAttribute<TUsuarios, TEntregas> tEntregasList;
    public static volatile SingularAttribute<TUsuarios, String> password;
    public static volatile ListAttribute<TUsuarios, TGrupo> tGrupoList;
    public static volatile SingularAttribute<TUsuarios, Date> fechanacimiento;
    public static volatile SingularAttribute<TUsuarios, String> foto;
    public static volatile SingularAttribute<TUsuarios, Date> ffinsession;
    public static volatile ListAttribute<TUsuarios, TTelefonos> tTelefonosList;
    public static volatile SingularAttribute<TUsuarios, String> usuario;
    public static volatile ListAttribute<TUsuarios, TAuditoria> tAuditoriaList;
    public static volatile SingularAttribute<TUsuarios, TEstudiantes> tEstudiantes;
    public static volatile SingularAttribute<TUsuarios, TUsuariosPK> tUsuariosPK;

}