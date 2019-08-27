select s1.emp_no, dm.emp_no manager_no, s1.salary emp_salary, s2.salary manager_salary
from salaries s1, dept_manager dm, dept_emp de, salaries s2
where s1.emp_no = de.emp_no and de.to_date = '9999-01-01' and s1.to_date = '9999-01-01'
and de.dept_no = dm.dept_no and dm.to_date = '9999-01-01' and s2.to_date = '9999-01-01'
and dm.emp_no = s2.emp_no and s1.salary > s2.salary