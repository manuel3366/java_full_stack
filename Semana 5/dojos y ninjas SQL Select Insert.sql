select * from dojo;

insert into dojo(name, location) values('Coding Dojo', 'Av La libertad 2345');
insert into dojo(name, location) values('Java Dojo', 'Av Proceres 1178');

select * from ninja where name like '%e%';

update ninja set dojo_id = 2 where id = 3;

select * from ninja order by dojo_id desc;

select * from ninja where dojo_id = 2;

insert into ninja(name, dojo_id) values('Black Ninja', 1);
insert into ninja(name, dojo_id) values('White Ninja', 2);
insert into ninja(name, dojo_id) values('Orange Ninja', 1);
insert into ninja(name, dojo_id) values('Pink Ninja', 2);

select * from skill;

insert into skill(name) values('Desaparecer');
insert into skill(name) values('Lanzar shurikens');
insert into skill(name) values('Lanzar fuego');
insert into skill(name) values('Caminar sobre el agua');
insert into skill(name) values('Cortar una manzana por la mitad');
insert into skill(name) values('Lanzar flechas');
insert into skill (name) values ('crear una barrera de barro');
insert into skill(name) values ('Lanzar chorros de agua');
insert into skill(name) values ('Crear una espada de agua');

update skill set name = 'Crear una barrera de barro' where id = 7;

select * from ninja_has_skill;

insert into ninja_has_skill(ninja_id, skill_id) values(1, 1);
insert into ninja_has_skill(ninja_id, skill_id) values(1, 2);
insert into ninja_has_skill(ninja_id, skill_id) values(1, 3);
