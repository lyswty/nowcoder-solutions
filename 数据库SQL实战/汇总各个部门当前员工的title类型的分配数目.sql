select d.dept_no, d.dept_name, t.title, count(*) count
from departments d, dept_emp de, titles t
where d.dept_no = de.dept_no and de.to_date = '9999-01-01' and t.to_date = '9999-01-01' and t.emp_no = de.emp_no
group by d.dept_no, t.title