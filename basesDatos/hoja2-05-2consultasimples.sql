-- ej 1
select usuario, cancion from votos where fecha="2023-10-02";
-- ej 2
select distinct usuario from votos where fecha between "2023-10-01" and "2023-10-05" order by usuario asc;
-- ej 3
select*from votos where fecha between "2023-09-01" and "2023-9-30" order by cancion;
-- ej 4
select nombre from grupos where year(fechaEstreno)<2010;
-- ej 5
select * from canciones where duracion between "00:03:00" and "00:04:00";
-- ej 6 
select nombre, apellido, alias from componentes where alias is not null;
-- ej 7
select * from votos where cancion between 30 and 32 and fecha between "2023-09-01" and "2023-09-07";
-- ej 8 
select user, nombre, apellidos, fechanac from usuarios where fechanac like "%%%%-01-%%";
-- ej 9
select user, nombre, apellidos, fechanac from usuarios where month(fechanac)=1 and dayofmonth(fechanac) between 16 and 31;
-- ej 10
select * from votos where usuario in ("02Ana", "26Fer", "20luis", "26Juan");
-- ej 11
select * from votos where usuario in ("02Ana", "26Fer", "20luis", "26Juan") and month(fecha)=10 and dayofmonth(fecha) between 3 and 7;
-- ej 12
select distinct usuario, cancion from votos where usuario like "02%";
-- ej 13 
select nombre, apellido, alias, funcion, grupo from componentes where funcion like "%voz%" or funcion like "%vocalista%";




