package com.pablodeleon;

import com.pablodeleon.Areas;
import com.pablodeleon.Clientes;
import com.pablodeleon.Facturas;
import com.pablodeleon.Meseros;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-18T10:30:16")
@StaticMetamodel(Mesas.class)
public class Mesas_ { 

    public static volatile SingularAttribute<Mesas, Integer> idmesa;
    public static volatile SingularAttribute<Mesas, Areas> idarea;
    public static volatile ListAttribute<Mesas, Clientes> clientesList;
    public static volatile SingularAttribute<Mesas, Meseros> idmesero;
    public static volatile ListAttribute<Mesas, Facturas> facturasList;

}