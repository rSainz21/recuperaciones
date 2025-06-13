-- ejercicio 1
select * from municipios where cod_mun="LIE";
-- 2
select nombre_loc, habitantes from localidades where municipio="13";
-- 3
select nombre, apellidos from personas where a_nac between 1965 and 1972;
-- 4
select nombre, apellidos from personas where localidad="Torrelavega" and a_nac between 1965 and 1972; 
-- 5
select nombre, apellidos, a_nac, a_fall, a_fall - a_nac as edad from personas where a_fall is not null;
-- 6
select nombre, apellidos, 2025 - a_nac as edad from personas where a_fall is null;
select nombre, apellidos, year(curdate()) - a_nac as edad from personas where a_fall is null and a_nac is not null;
-- 7
select id_rige, datediff(curdate(),fini) as dias_alcalde from personas
inner join rige on alcalde=idpers where ffin is null;
-- 8 
select nombre, apellidos, partido from personas
inner join rige on personas.idpers=rige.id_rige where rige.ffin is null;
-- 9
select p.nombre, p.apellidos, r.partido, m.nombre  from rige r
inner join personas p on r.id_rige=p.idpers
inner join municipios m on r.municipio=m.id where r.ffin is null;
-- 10
select nombre from municipios m
inner join comarcas c on m.comarca=c.cod_com where c.nombre_com="Liebana";
-- 11
select l.nombre_loc, l.habitantes from localidades l
inner join municipios m on l.municipio=m.id where m.nombre="Camaleño" order by l.habitantes desc;
-- 12
select l.nombre_loc, l.habitantes, m.nombre from localidades l
inner join municipios m on l.municipio=m.id
inner join comarcas c on m.comarca=c.cod_com
where c.nombre_com="Liebana" order by m.nombre asc, habitantes desc;
-- 13
select municipios.nombre , sum(habitantes) as poblacion_total from municipios
inner join localidades on id=municipio group by nombre;

select municipios.nombre ,if(sum(habitantes) is null,0,sum(habitantes)) as poblacion_total from municipios
left join localidades on id=municipio group by id;
-- 14
select municipios.nombre, count(*) as num_localidades  from localidades
inner join municipios on municipio=id group by municipio;

select nombre,count(*) from municipios inner join localidades on id=municipio group by id;
select nombre,count(habitantes) from municipios left join localidades on id=municipio group by nombre;
-- 15
select nombre_loc, habitantes from localidades
inner join municipios on municipio=id where nombre="Camaleño" order by habitantes desc limit 3;
-- 16
select l1.* from localidades l1
where habitantes= (select max(l2.habitantes) from localidades l2 where l2.municipio=l1.municipio);

select l1.nombre_loc as localidad, l1.habitantes, m.nombre as municipio from localidades l1 inner join municipios m on l1.municipio=m.id;
-- 17
SELECT m2.nombre
FROM limites l
inner JOIN municipios m1 ON l.municmayor = m1.id
JOIN municipios m2 ON l.municmenor = m2.id
WHERE m1.nombre = 'Guriezo'
UNION
SELECT m2.nombre
FROM limites l
JOIN municipios m1 ON l.municmenor = m1.id
JOIN municipios m2 ON l.municmayor= m2.id
WHERE m1.nombre = 'Guriezo';
-- otra forma mas facil de ver:
select nombre from municipios where id in(select municmenor from limites inner join municipios on municmayor=id where nombre="Guriezo" union
select municmayor from limites inner join municipios on municmayor=id where nombre="Guriezo");

-- 18
select nombre_loc, habitantes from localidades
where habitantes>(select habitantes from localidades where nombre_loc="Potes") 
and habitantes<(select habitantes from localidades where nombre_loc="Cabezón de la Sal");
-- 19

select nombre from municipios 
inner join localidades on id=municipio
group by id, nombre having count(*)>(
select count(*) from localidades 
inner join municipios on municipio=id where nombre="Cabezón de la Sal");

select nombre, count(*) from localidades
inner join municipios on id=municipio
group by nombre having count(*)>(
select count(*) from localidades 
inner join municipios on municipio=id where nombre="Cabezón de la Sal");

-- 20

select nombre, count(*) as total_concejales, sum(if(partido="PRC",1,0)) as prc_concejales
from concejales inner join municipios on id=municipio group by nombre;

-- 21
insert into personas (nombre, apellidos, a_nac, localidad)
values ("Diego","Revuelta Ceballos","1958","Santander");
-- 22
INSERT INTO concejales (concejales.idpers,partido, municipio)
VALUES ((select idpers from personas where nombre="Diego" and apellidos="Revuelta Ceballos" limit 1),"PSOE",
(select id from municipios where nombre="Castañeda"));
-- 24
insert into localidades (municipio,numero, nombre_loc, habitantes)
values 
(20,5, "La Cueva", 740),
(20,6, "Pomaluengo", 972),
(20,7, "Socobio", 249),
(20,8, "Villabañez", 681);
-- 25
update localidades
set habitantes=round(habitantes*0.12)
where municipio=(select id from municipios where nombre="Castañeda");
-- 26
start transaction;
delete from localidades where nombre_loc="Socobio";
rollback;
-- 27
delete from localidades 
where municipio=(select id from municipios where nombre="Castañeda");
-- 28 
insert into localidades (municipio,numero, nombre_loc, habitantes)
values 
((select id from municipios where nombre="Castañeda"),5, "La Cueva", 740),
((select id from municipios where nombre="Castañeda"),6, "Pomaluengo", 972),
((select id from municipios where nombre="Castañeda"),7, "Socobio", 249),
((select id from municipios where nombre="Castañeda"),8, "Villabañez", 681);
-- 29
start transaction;
-- 30
delete from concejales where partido="PSOE" and municipio=(select id from municipios where nombre="Alfoz de Lloredo");
-- 31 
-- 32 
delete from localidades where habitantes=0 and municipio in(
select id from municipios 
inner join comarcas on comarca=cod_com
where nombre_com="Liebana");
-- 33
start transaction;

update municipios 
set extension=round(extension*0.1)
where comarca=(
select comarca from municipios 
where nombre="Potes");
-- 34
rollback;
-- 35
create table personas_aux like personas;
-- 36
insert into personas_aux
select * from personas where a_nac between 1901 and 2000;
delete from personas_aux;
drop table personas_aux;
-- 37
alter table comarcas add column num_municipios int;
update comarcas
set num_municipios=(
select count(*) from municipios where comarca="LIE");
-- 38
update comarcas
set num_municipios=(
select count(*) from municipios where comarca=cod_com);
-- 39
alter table municipios add column poblacion_total int;
alter table municipios add column numero_total_localidades int;
update municipios
set poblacion_total=(
select sum(habitantes) from localidades
where municipio=id), numero_total_localidades=(
select count(*) from localidades
where municipio=id) where comarca=(select comarca from municipios where nombre="Potes");
-- 40
UPDATE municipios 
SET poblacion_total = (
    SELECT SUM(habitantes)
    FROM localidades
    WHERE municipio = id
),
numero_total_localidades = (
    SELECT COUNT(*)
    FROM localidades
    WHERE municipio = id
);













