-- ej 1
select nombre from municipios where comarca="LIE";
-- ej 2 
select nombre_loc, habitantes from localidades where municipio=13;
-- ej 3
select nombre, apellidos from personas where a_nac between 1965 and 1972;
-- ej 4
select nombre, apellidos from personas where localidad="Torrelavega";
-- ej 5
select nombre, apellidos, a_nac,a_fall, a_fall-a_nac as edad from personas
where a_fall is not null;
-- ej 6
select nombre, apellidos,year(curdate())-a_nac as edad from personas
where a_fall is null;
-- ej 7
select id_rige, datediff(curdate(),ffin) as dias_alcalde from rige
inner join personas on idpers=alcalde where ffin is null;
-- ej 8
select nombre, apellidos, partido from personas
inner join rige on idpers=alcalde where ffin is null;
-- ej 9
select p.nombre, p.apellidos, r.partido, m.nombre  from rige r
inner join personas p on r.id_rige=p.idpers
inner join municipios m on r.municipio=m.id where r.ffin is null;
-- ej 10
select nombre from municipios 
inner join comarcas on comarca=cod_com where nombre_com="Liebana";
-- ej 11
select nombre_loc, habitantes from localidades
where municipio=(
select id from municipios where nombre="Camaleño") order by habitantes desc;
-- ej 12
select l.nombre_loc, l.habitantes, m.nombre from localidades l
inner join municipios m on l.municipio=m.id
inner join comarcas c on m.comarca=c.cod_com
where c.nombre_com="Liebana" order by m.nombre asc, habitantes desc;
-- ej 13
select municipios.nombre, if(sum(habitantes is null),0,sum(habitantes)) as habitantes_total from municipios
inner join localidades on id=municipio group by nombre;
-- ej 14
select municipios.nombre, count(*) as num_localidades  from localidades
inner join municipios on municipio=id group by municipio;
-- ej 15
select nombre_loc, habitantes from localidades
inner join municipios on municipio=id where nombre="Camaleño" order by habitantes desc limit 3;
-- ej 16
select l1.* from localidades l1
where habitantes= (select max(l2.habitantes) from localidades l2 where l2.municipio=l1.municipio) order by habitantes desc;
select l1.* from localidades l1
where habitantes= (select max(l2.habitantes) from localidades l2 where l2.municipio=l1.municipio);
-- ej 17
select nombre from municipios 
inner join limites on id=municmayor;
-- ej 18
select nombre_loc, habitantes from localidades
where habitantes>(
select poblacion from municipios where nombre="Potes") and
habitantes<(select poblacion from municipios where nombre="Cabezón de la Sal");
-- ej 19
select nombre,poblacion from municipios where numero_total_localidades>(
select numero_total_localidades from municipios where nombre="Cabezon de la Sal");
-- ej 20
select nombre, count(*) as total_concejales, sum(if(partido="PRC",1,0)) as concejales_PRC from concejales
inner join municipios on municipio=id group by nombre;





















