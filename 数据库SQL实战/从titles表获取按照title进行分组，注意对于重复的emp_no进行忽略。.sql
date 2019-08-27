select title, count(distinct emp_no) t
from titles
group by title having t >= 2