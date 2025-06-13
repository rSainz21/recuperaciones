-- ej 1
select distinct localidad from equipos;
-- ej 2
select count(*) as partidos_jugados from partidos
where golesloc is not null and golesvis is not null;
-- ej 3
select count(*) as goles_totales from ;
-- ej 4
select distinct j.alias,e.nombre from jugadores j
inner join equipos e on equipo=codeq where goles>=1;
-- ej 5
select count(*) as numCentrocampistas from jugadores
inner join equipos on equipo=codeq where puesto="centrocampista" and equipos.nombre="S.D. Textil Escudo";
-- ej 6

