create database DBRestaurante ;

use DBRestaurante;



create table areas(
idarea int not null primary key auto_increment,
nombreArea varchar(50)not null,
numEmpleados int(8)not null
);

create table meseros(
idmesero int not null primary key auto_increment,
nombreMesero varchar(25)not null
);

create table cocineros(
idcocinero int not null primary key auto_increment,
nombreCocinero varchar(25)not null
);

create table mesas(
idmesa int not null primary key auto_increment,
idmesero int not null,
idarea int not null,
foreign key (idmesero) references meseros(idmesero)on delete cascade,
foreign key (idarea) references areas(idarea)on delete cascade
);

create table clientes(
idcliente int not null primary key auto_increment,
nombre varchar(50)not null,
apellidos varchar(50),
telefono varchar(50)not null,
nit varchar(50)not null,
correoElectronico varchar(50)not null,
idmesa int not null,
foreign key (idmesa) references mesas(idmesa)
);

create table platos(
idplato int not null primary key auto_increment,
descripcion varchar(50)not null,
costo double(10,2)not null
);

create table facturas(
idfactura int not null primary key auto_increment,
idcliente int not null,
idmesero int not null,
idmesa int not null,
foreign key (idcliente) references clientes(idcliente)on delete cascade,
foreign key (idmesa) references mesas(idmesa)on delete cascade,
foreign key (idmesero) references meseros(idmesero)on delete cascade
);

create table detallefactura(
idplato int not null,
idfactura int not null,
idcocinero int not null,
primary key(idplato,idfactura),
cantidad int(8) not null,
precioventa double(10,2) not null,
costoTotal double as(cantidad*precioventa),
foreign key (idplato) references platos(idplato)on delete cascade,
foreign key (idfactura) references facturas(idfactura)on delete cascade,
foreign key (idcocinero) references cocineros(idcocinero)on delete cascade
);

