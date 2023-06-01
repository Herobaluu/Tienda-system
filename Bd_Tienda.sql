/*drop database tienda;*/
create database tienda;
use tienda;

create table users(
	id int auto_increment primary key,
    username varchar(50) not null,
    password varchar(100) not null,
    enabled tinyint(1) not null default 1
);

create table roles(
	id int auto_increment primary key,
    name varchar(50) not null
);

create table user_roles(
	user_id int not null,
    roles_id int not null,
    primary key (user_id, roles_id),
    foreign key (user_id) references users(id),
    foreign key (roles_id) references roles(id)
);

create table empleado(
	id int auto_increment ,
    nombres varchar(100) not null,
    apellidos varchar(100) not null,
    dni varchar(8) not null,
    telefono varchar(9) not null,
    edad int not null,
    fechaNacimiento date not null,
    tipoSangre varchar(3) not null,
    fechaInicio date not null,
    fechaFin date not null,
    id_rol int not null,
    id_usuario int not null,
    primary key (id, dni),
    foreign key (id_rol) references roles(id),
    foreign key (id_usuario) references users(id)
);

create table categoria(
	id int auto_increment primary key,
    nombre varchar(50) not null,
    descripcion varchar(200)
);

create table marca(
	id int auto_increment primary key,
    nombre varchar(50) not null,
    descripcion varchar(200) not null
);

create table producto(
	id int auto_increment primary key,
    nombre varchar(30) not null,
    descripcion varchar(200) ,
    precio double not null,
    stock int not null,
    id_categoria int not null,
    id_marca int not null,
    fechaCreacion date not null,
    fechaVencimiento date not null,
    foreign key (id_categoria) references categoria(id),
    foreign key (id_marca) references marca(id)
);

create table cliente(
	id int auto_increment primary key,
    nombre varchar(50) not null,
    apellidos varchar(50) not null,
    dni varchar(8) 
);

create table boleta(
	id varchar(8) primary key,
    id_cliente int not null,
    fecha date not null,
    foreign key (id_cliente) references cliente(id)
);

create table boleta_detalle(
	id int auto_increment primary key,
    id_boleta varchar(8) not null,
    id_producto int not null,
    cantidad int not null,
    precio double not null,
    foreign key (id_boleta) references boleta(id),
    foreign key (id_producto) references producto(id)
);
