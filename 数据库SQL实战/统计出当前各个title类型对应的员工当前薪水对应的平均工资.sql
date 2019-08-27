select t.title, avg(s.salary)
from titles t join salaries s on t.emp_no = s.emp_no
where s.to_date = '9999-01-01' and t.to_date = '9999-01-01'
group by t.title