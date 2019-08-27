select e.last_name, e.first_name, d.dept_name
from employees e left join dept_emp on e.emp_no = dept_emp.emp_no left join departments d on dept_emp.dept_no = d.dept_no