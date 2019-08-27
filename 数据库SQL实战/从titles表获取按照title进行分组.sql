select title, count(title) t
from titles
group by title having t >= 2