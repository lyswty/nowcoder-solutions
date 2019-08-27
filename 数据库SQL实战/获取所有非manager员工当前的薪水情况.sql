select de.dept_no, de.emp_no, s.salary
from dept_emp de, salaries s
where s.emp_no = de.emp_no and de.to_date = '9999-01-01' and s.to_date = '9999-01-01' and de.emp_no not in(
select emp_no from dept_manager where to_date = '9999-01-01'
)