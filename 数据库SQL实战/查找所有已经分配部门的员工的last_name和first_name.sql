select e.last_name, e.first_name, d.dept_no
from employees e, dept_emp d
where e.emp_no = d.emp_no