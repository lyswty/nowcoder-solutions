select d.dept_no, d.emp_no, s.salary
from dept_emp d join salaries s on d.emp_no = s.emp_no
where d.to_date = s.to_date and d.to_date = '9999-01-01'
group by d.dept_no having s.salary = max(s.salary)