-- ej 1
select adddate(curdate(),interval 1 day) as mañana,
adddate(curdate(), interval 1 month) as "dentro de un mes",
subdate(curdate(),interval 1 day) as ayer,
subdate(curdate(), interval 1 month) as "hace un mes";
-- ej2
select *, datediff(curdate(), fecha) from votos;
-- ej 3
select curdate();
select addtime(curtime(),"10:12:20") as horaresultado;
-- ej 4
select subtime("16:25:00",curtime());
-- ej 5
select time_to_sec(subtime("16:25:00",curtime()));
-- ej 6
select * from votos where day(fecha) between 25 and 29;
-- ej 7
select nombre, apellidos, floor(datediff(curdate(),fechanac)/365) as edad from usuarios;
-- ej 8
select titulo, nombre, if(duracion>"00:03:00",1,0) from canciones 
inner join grupos on grupo=codgrupo;
-- ej 9
select count(*), sum(if(duracion>"00:03:00",1,0)), count(*)-sum(if(duracion>"00:03:00",1,0)) from canciones;
-- ej 10
select nombre, apellidos, contraseña, md5(contraseña) from usuarios;
-- ej 11





