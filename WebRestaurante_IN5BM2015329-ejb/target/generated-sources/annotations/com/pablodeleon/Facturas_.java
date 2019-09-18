package com.pablodeleon;

import com.pablodeleon.Clientes;
import com.pablodeleon.Detallefactura;
import com.pablodeleon.Mesas;
import com.pablodeleon.Meseros;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-18T10:30:16")
@StaticMetamodel(Facturas.class)
public class Facturas_ { 

    public static volatile SingularAttribute<Facturas, Mesas> idmesa;
    public static volatile ListAttribute<Facturas, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Facturas, Clientes> idcliente;
    public static volatile SingularAttribute<Facturas, Meseros> idmesero;
    public static volatile SingularAttribute<Facturas, Integer> idfactura;

}