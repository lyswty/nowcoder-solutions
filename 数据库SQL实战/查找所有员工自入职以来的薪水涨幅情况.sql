select e.emp_no, s1.salary - s2.salary as growth
from employees e
join salaries s1 on e.emp_no = s1.emp_no and s1.to_date = '9999-01-01'
join salaries s2 on e.emp_no = s2.emp_no and s2.from_date = e.hire_date
order by growth