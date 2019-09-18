package com.pablodeleon;

import com.pablodeleon.Mesas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-18T10:30:16")
@StaticMetamodel(Areas.class)
public class Areas_ { 

    public static volatile SingularAttribute<Areas, String> nombreArea;
    public static volatile SingularAttribute<Areas, Integer> idarea;
    public static volatile SingularAttribute<Areas, Integer> numEmpleados;
    public static volatile ListAttribute<Areas, Mesas> mesasList;

}