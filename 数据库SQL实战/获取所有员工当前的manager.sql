select e.emp_no, m.emp_no manager_no
from dept_emp e, dept_manager m
where e.dept_no = m.dept_no and e.emp_no != manager_no and e.to_date = '9999-01-01' and e.to_date = m.to_date