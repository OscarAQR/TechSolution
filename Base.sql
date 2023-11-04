/*ADS PROYECTO FINAL*/
CREATE DATABASE ADS;
USE ADS;

/*TABLAS*/
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