package com.pablodeleon;

import com.pablodeleon.Facturas;
import com.pablodeleon.Mesas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-18T10:30:16")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> apellidos;
    public static volatile SingularAttribute<Clientes, Mesas> idmesa;
    public static volatile SingularAttribute<Clientes, String> nit;
    public static volatile SingularAttribute<Clientes, String> telefono;
    public static volatile SingularAttribute<Clientes, Integer> idcliente;
    public static volatile SingularAttribute<Clientes, String> nombre;
    public static volatile SingularAttribute<Clientes, String> correoElectronico;
    public static volatile ListAttribute<Clientes, Facturas> facturasList;

}