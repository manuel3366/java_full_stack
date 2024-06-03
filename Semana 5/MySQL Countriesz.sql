/*
1. ¿Qué consulta harías para obtener todos los países que hablan esloveno? Tu consulta debe devolver 
el nombre del país, el idioma y el porcentaje de idioma. 
Tu consulta debe organizar el resultado por porcentaje de idioma en orden descendente. (1)
*/

select name, language, percentage from countries
inner join languages on languages.country_id = countries.id 
where language = 'Slovene'
order by percentage desc;

/*
2. ¿Qué consulta ejecutarías para mostrar el número total de ciudades para cada país? 
Su consulta debe devolver el nombre del país y el número total de ciudades. 
Tu consulta debe organizar el resultado por el número de ciudades en orden descendente. (3)
*/
select c.name as country, count(*)  from countries c
inner join cities cc on cc.country_id = c.id
group by c.name
order by count(*) desc;

select c.name as country, count(*)  from countries c
inner join cities cc on cc.country_id = c.id
group by 1
order by 2 desc;

/*
3. ¿Qué consulta harías para obtener todas las ciudades de México con una población de más de 500,000? 
Tu consulta debe organizar el resultado por población en orden descendente. (1)
*/

select 
countries.name,
cities.name ,
cities.population,
cities.country_id
from cities 
join countries on countries.id = cities.country_id
where countries.name = 'Chile' and cities.population > 500000
order by cities.population desc;

select name, population
from cities
where country_code = 'CHL' and population > 500000
order by population desc;

SELECT * FROM cities 
WHERE country_id = 136 AND population > 500000
ORDER BY population desc
;

/*
4. ¿Qué consulta ejecutarías para obtener todos los idiomas en cada país con un porcentaje superior al 89%? 
Tu consulta debe organizar el resultado por porcentaje en orden descendente. (1)
*/

SELECT country_code, language, percentage FROM languages
WHERE percentage > 89
ORDER BY percentage desc
;

select 
countries.name,
languages.language,
languages.percentage
from languages
join countries on countries.id = languages.country_id
where languages.percentage >89
order by languages.percentage desc;

SELECT name, language, percentage FROM countries c
JOIN languages l ON l.country_id = c.id
ORDER BY percentage DESC;

/*
5. ¿Qué consulta haría para obtener todos los países con un área de superficie inferior a 501 y 
una población superior a 100,000? (2)
*/

select * from countries where surface_area < 501 and population > 100000;

/*
6. ¿Qué consulta harías para obtener países con solo Monarquía Constitucional con un capital superior a 200 y 
una esperanza de vida superior a 75 años? (1)
*/

select * from countries 
where government_form = 'Constitutional Monarchy' and capital > 200 and life_expectancy > 75;

/*
7. ¿Qué consulta harías para obtener todas las ciudades de Argentina dentro del distrito de 
Buenos Aires y tener una población superior a 500,000? La consulta debe devolver el nombre del país, 
el nombre de la ciudad, el distrito y la población. (2)
*/

select 
countries.name as country_name,
cities.name as city_name,
cities.district,
cities.population
from countries
join cities on countries.id = cities.country_id
where countries.name = 'Argentina'
and cities.district = 'Buenos Aires'
and cities.population > 500000;

/*
8. ¿Qué consulta harías para resumir el número de países en cada región? 
La consulta debe mostrar el nombre de la región y el número de países. 
Además, la consulta debe organizar el resultado por el número de países en orden descendente. (2)
*/

SELECT region, COUNT(*) AS countries
FROM countries
GROUP BY region
ORDER BY countries DESC;

select * from countries;
select * from cities;
select * from languages;