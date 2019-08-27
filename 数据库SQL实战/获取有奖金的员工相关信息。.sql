select e.emp_no, e.first_name, e.last_name, eb.btype, s.salary, (case eb.btype 
                                                                 when 1 then s.salary*0.1 
                                                                 when 2 then s.salary*0.2 
                                                                 else s.salary*0.3 end)
from employees e, salaries s, emp_bonus eb
where e.emp_no = s.emp_no and e.emp_no = eb.emp_no and s.to_date = '9999-01-01'