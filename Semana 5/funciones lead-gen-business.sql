select concat(first_name, " ", last_name) as client_name from clients; /*concat*/

select first_name, length(first_name) from clients;

select first_name, trim("   Matias    ") from clients;

select lower(first_name), upper(last_name) from clients;

select replace(email, "@", "-") from clients;

select email, substring(email, 2, 5) from clients;

select abs(amount) from billing;

select amount, mod(amount, 1000) from billing;

select round(20 * rand(), 0) from billing;

select round(3.14159, 0) from billing;

select charged_datetime, date(charged_datetime), year(charged_datetime), month(charged_datetime) from billing;