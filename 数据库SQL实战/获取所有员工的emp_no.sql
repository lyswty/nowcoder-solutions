select e.emp_no, de.dept_no, eb.btype, eb.recevied
from (employees e join dept_emp de on e.emp_no = de.emp_no) left join emp_bonus eb on e.emp_no = eb.emp_no