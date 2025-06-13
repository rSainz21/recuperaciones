-- ej 1
select j.nombre, j.apellidos, j.alias, e.nombre from jugadores j, equipos e
where e.nombre="S.D. Textil Escudo";
-- ej 2
select * from equipos e1, equipos e2;
-- ej 3
select e1.nombre as equipo_local, e2.nombre as equipo_visitante 
from equipos e1, equipos e2 where e1.nombre <> e2.nombre;
-- ej 4
select j.*,equipos.nombre as nombre_del_equipo from jugadores j 
inner join equipos on equipo=codeq where puesto="portero";
-- ej 5
select nombre, puntos from equipos 
inner join clasificacion on equipos.codeq=clasificacion.codeq order by puntos desc;
-- ej 6
select nombre, puntos from equipos 
inner join clasificacion on equipos.codeq=clasificacion.codeq order by puntos desc limit 4;
-- ej 7
select nombre, puntos from equipos 
inner join clasificacion on equipos.codeq=clasificacion.codeq 
where localidad in("Torrelavega","Santander","Laredo");
-- ej 8
select * from partidos inner join equipos on eqloc=codeq
where nombre="Club Deportivo Cayón";
-- ej 9








