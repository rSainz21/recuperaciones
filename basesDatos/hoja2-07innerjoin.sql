-- ej 1 
select titulo, duracion, grupos.nombre from canciones
inner join grupos on grupo=codgrupo order by grupos.nombre;
-- ej 2
select c.nombre, c.apellido, g.nombre as nombreGrupo from componentes c
inner join grupos g on c.grupo=g.codgrupo;
-- ej 3
select c.nombre, c.apellido, g.nombre as nombreGrupo from componentes c
inner join grupos g on c.grupo=g.codgrupo where esgrupo=1;
-- ej 4
select c.nombre,c.apellido,c.alias,g.nombre from componentes c
inner join grupos g on c.grupo=g.codgrupo where localidad="Madrid";
-- ej 5 
select c.nombre,c.apellido,c.alias,g.nombre from componentes c
inner join grupos g on c.grupo=g.codgrupo where c.alias is null;
-- ej 6
select titulo, duracion, nombre from canciones 
inner join grupos on grupo=codgrupo where nombre="Delorean";
-- ej 7
select titulo,duracion,nombre from canciones 
inner join grupos on grupo=codgrupo order by duracion limit 5;
-- ej 8
select nombre, apellido, grupo from componentes
where funcion="bateria";
-- ej 9
select fecha, titulo from votos
inner join canciones on cancion=numCancion;
-- ej 10
select fecha, titulo, nombre as nombreGrupo from canciones
inner join votos on numCancion=cancion
inner join grupos on grupo=codgrupo;
