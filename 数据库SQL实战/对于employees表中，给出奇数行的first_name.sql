select e1.first_name from employees e1 where(
select count(*) from employees e2 where e1.first_name <=e2.first_name)%2 = 1