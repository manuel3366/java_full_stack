select * from roles;

insert into roles(nombre) values('Usuario');
insert into roles(nombre) values('Administrador');
insert into roles(nombre) values('Super Adminsitrador');

insert into roles(nombre) values('Usuario'), ('Administrador'), ('Super Adminsitrador');

select * from permisos;

insert into permisos(nombre, descripcion) values ('Crear servidores', 'Permite crear servidores de distintos tipos');
insert into permisos(nombre, descripcion) values ('Crear canales', 'Permite crear canales de texto o audio');
insert into permisos(nombre, descripcion) values ('Enviar mensajes', 'Permite enviar mensajes sean de texto, imagnes o archivos');

update permisos set descripcion = 'Permite enviar mensajes sean de texto, imagenes o archivos' where id = 3;

select * from roles_has_permisos;

INSERT INTO roles_has_permisos(role_id, permiso_id) VALUES 
(1, 1),
(2, 1), (2, 2),
(3, 1), (3, 2), (3, 3);

select * from usuarios;

insert into usuarios(username, password, email, role_id) values
('msaucedo','password123','msaucedo@codingdojo.cl',3),
('dmorales','password123','dmorales@codingdojo.cl',2),
('csegovia','password123','csegovia@codingdojo.cl',1),
('evillanueva','password123','evillanueva@codingdojo.cl',1),
('jbasoalto','password123','jbasoalto@codingdojo.cl',1),
('nvelasquez','password123','nvelasquez@codingdojo.cl',1),
('scordova','password123','scordova@codingdojo.cl',1);

select * from servidores;
insert into servidores(nombre, descripcion, tipo, usuario_id) 
values('Servidor de mensajes de texto', 'Servidor de utilizado para el envio de mensajes de texto','Texto',1);

select * from canales;
insert into canales(nombre, tipo, servidor_id) values
('Canal del curso de Java', 'Texto', 1),
('Canal del curso de Fundamentals', 'Texto', 1);

select * from mensajes;
insert into mensajes(texto, created_at, canal_id, usuario_id) values('Hola alumnos', current_time(), 1, 1);

select role_id, count(*) from usuarios group by role_id;

select r.nombre as rol, count(*) from usuarios u
inner join roles r on r.id = u.role_id
group by r.nombre;

select * from roles;

select * from permisos;

select * from roles_has_permisos;

select * from roles r
inner join roles_has_permisos rhp on rhp.role_id = r.id
inner join permisos p on p.id = rhp.permiso_id;

select s.nombre as nombre_servidor, c.nombre as nombre_canal, u.username from servidores s
join canales c on c.servidor_id = s.id
join usuarios u on u.id = s.usuario_id;

