-- ej 1
select numCancion, grupo, duracion, titulo from canciones
where duracion>"00:03:00" order by duracion desc;
-- ej 2
select * from votos where fecha<"2023-10-01";
-- ej 3
select * from votos where fecha="2023-10-03";
-- ej 4
select * from votos where fecha=curdate();
-- ej 5
--
-- ej 6
select * from votos order by fecha asc limit 1;
-- ej 7
select nombre from grupos where annoGrab<"2006-01-01";
-- ej 8
select nombre from grupos where annoGrab<"2006-01-01";
-- ej 9
select nombre from grupos where localidad="Madrid";
-- ej 10
select nombre from grupos where esgrupo=0;
-- ej 11
select nombre from grupos where nombre like "V%";
-- ej 12
select nombre, apellido from componentes where grupo=21;
-- ej 13
select nombre from grupos where estilo like "%pop%";
-- ej 14
select* from canciones where grupo=21;
-- ej 15
select*from canciones order by duracion asc limit 5;








