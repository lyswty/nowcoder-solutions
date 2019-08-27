select c.name, count(*) count
from film f, category c, film_category fc
where fc.film_id = f.film_id and c.category_id = fc.category_id and f.description like '%robot%'
group by c.category_id having count(*) >= 2