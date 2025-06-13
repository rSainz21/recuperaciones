-- ej 1
select titulo, nombre, count(*) as numVotos from canciones
inner join grupos on grupo=codgrupo
inner join votos on numCancion=cancion group by titulo, nombre;
-- ej 2
select titulo, nombre, count(*) as numVotos from canciones
inner join grupos on grupo=codgrupo
inner join votos on numCancion=cancion group by titulo, nombre order by numVotos desc limit 8;
-- ej 3
select titulo, nombre, count(*) as numVotos from canciones
inner join grupos on grupo=codgrupo
inner join votos on numCancion=cancion group by titulo, nombre
having count(cancion)>
(select count(*) from votos 
inner join canciones on cancion=numCancion where titulo="No gires");
-- ej 4 left join
select titulo from canciones 
left join votos on numCancion=cancion where cancion is null;
-- ej 4 subconsulta
select titulo from canciones where numCancion not in (
select cancion from votos);
-- ej 5
select titulo, nombre as grupo, 0 as numVotos from canciones
inner join grupos on grupo=codgrupo 
left join votos on numCancion=cancion where cancion is null;
-- ej 6
select titulo, nombre, count(*) as votos from canciones 
inner join grupos on grupo=codgrupo 
left join votos on numCancion=cancion group by titulo, nombre
having count(cancion);
-- ej 7
select nombre from grupos
left join canciones on codgrupo=grupo
left join votos on numCancion=cancion group by nombre
having count(cancion)=0;
SELECT nombre
FROM grupos
WHERE codgrupo NOT IN (
    SELECT DISTINCT c.grupo
    FROM canciones c
    JOIN votos v ON c.numCancion = v.cancion
);
-- ej 8
select nombre, apellidos from usuarios where user in (
select usuario from votos
inner join canciones on cancion=numCancion
where titulo="Cancion de cuna");
-- ej 9
select distinct u.nombre,u.apellidos from usuarios u
inner join votos on user=usuario
inner join canciones on cancion=numCancion
where grupo in (select grupo from votos 
inner join usuarios u on usuario=user
inner join canciones on cancion=numCancion
where u.nombre="Elsa" and u.apellidos="Frutos Núñez");
-- ej 10 
select fecha, count(*) as total_votos from votos where month(fecha)=10 and year(fecha)=2023
group by fecha having count(*)<(
select count(*) from votos where fecha="2023-10-02");



