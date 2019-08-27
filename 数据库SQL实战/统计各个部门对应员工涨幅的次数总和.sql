select d.dept_no, d.dept_name, count(s.salary)
from departments d, dept_emp, salaries s
where d.dept_no = dept_emp.dept_no and dept_emp.emp_no = s.emp_no
group by d.dept_no