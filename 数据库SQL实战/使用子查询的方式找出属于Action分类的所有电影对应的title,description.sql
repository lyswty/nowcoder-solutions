select f.title, f.description
from film f 
where f.film_id in(select fc.film_id from film_category fc, category c where fc.category_id = c.category_id and c.name = 'Action')