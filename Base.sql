/*ADS PROYECTO FINAL*/
CREATE DATABASE ADS;
USE ADS;

/*TABLAS capa seguridad*/
CREATE TABLE seguridad (
	id_seguridad int primary key auto_increment, 
	usuario varchar(100) ,
	permisos varchar(100),
	acceso_fecha varchar(100),
	sesion varchar(100),
	endpoint varchar(100),
	id_user int
    
);

CREATE TABLE rol(
	id_rol int primary key auto_increment,
    tipo_rol int,
    descripcion varchar(255)
    
);

CREATE TABLE usuario(
	id_user int primary key auto_increment,
    nombre_user varchar(200),
    pass_user varchar(200),
    fecha_registro varchar(200),
    id_cod_empleado int
    
);


/*TABLAS capa empleados*/
CREATE TABLE empleado(
	id_cod_empleado int primary key,
    dui_empleado varchar(10),
	nombre_empleado varchar(100),
    apellido_empleado varchar(100),
    telefono_empleado varchar(100),
    correo_empleado varchar(255),
    direccion_cliente varchar(500),
    fecha_nacimiento varchar(200),
    salario float
    
);

/*TABLAS capa horarios*/
CREATE TABLE horario(
	id_cod_horario int primary key,
    hora_entrada varchar(200),
	hora_salida varchar(200),
    dia_compensatorio int,
    id_cod_empleado int
    
);

/*TABLAS capa Mercaderia*/
CREATE TABLE producto(
	id_produto int primary key auto_increment,
    sku_producto varchar(100),
    nombre_producto varchar(700),
    descripcion_producto varchar(500),
    precio_producto float,
    stock int,
    fecha_ingreso_producto varchar(200),
    imagen_producto varchar(100),
    categoria_producto varchar(200),
    proveedor_producto varchar(100) default 'CharlyStore'
    
);

/*TABLAS capa SERVICIO*/
CREATE TABLE servicios(
	id_servicio int primary key auto_increment,
    nombre_servicio varchar(200),
    descripcion_servicio varchar(700),
    precio_servicio float,
    fecha_ingreso_servicio varchar(200),
    id_cliente int
    
);

/*TABLAS capa COMPRAS*/
CREATE TABLE compras(
	id_compra varchar(100) primary key ,
    descripcion_compra varchar(200),
    metodo_pago varchar(100),
    costo_total float,
    id_cliente int,
    id_detalle_compra int
);

CREATE TABLE detalle_compra(	
	id_detalle_compra int primary key auto_increment,
    cantidad_compra int,
    precio_compra float,
    impuesto_compra float,
	descuento_compra float,
	id_producto int,
    id_servicio int

);


/*TABLAS capa CLIENTES*/
CREATE TABLE cliente(
	id_cliente int primary key auto_increment,
    dui_cliente varchar(10),
    nombre_cliente varchar(100),
    apellido_cliente varchar(100),
    telefono_cliente varchar(100),
    correo_cliente varchar(255),
    edad_cliente int,
    direccion_cliente varchar(500)
    
);


