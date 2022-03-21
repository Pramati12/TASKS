

SELECT p.name as process_name ,s.name as stage_name , t.name as task_name ,c.name as c_name
FROM processflow.process p INNER JOIN processflow.process_stage_mapping psm 
ON p.id=psm.process_id 
inner join processflow.stage s 
on psm.process_id 
inner join processflow.stage_task_mapping stm 
on s.id=stm.stage_id 
inner join processflow.task t 
on stm.task_id=t.id 
inner join processflow.task_checklist_mapping tcm 
on t.id=tcm.task_id 
inner join processflow.checklist c 
on tcm.checklist_id=c.id 
WHERE p.id=1 group by s.name,t.name;

   
  
   SELECT COUNT(c.user_id)as paid,COUNT(r.user_id) as refused
   from  eventpool.user u 
   left join eventpool.contribution c on c.user_id=u.id 
   left join eventpool.refused r on r.user_id=u.id 
   where u.id=15;
  
  SELECT g.id as id,COUNT(ug.user_id) as user_count,g.name as name,g.created_on as created_on,u.name as created_by  
  FROM eventpool.user_group ug
  JOIN eventpool.group g on g.id=ug.group_id 
  JOIN eventpool.user u on u.id=g.created_by 
  group by ug.group_id; 
 
 SELECT * from eventpool.event
 where id not in (SELECT event_id from eventpool.contribution c where user_id=11);

SELECT * from eventpool.event
 where id in (SELECT event_id from eventpool.contribution c where user_id=9);
    
     
     SELECT e.id,e.name,e.salary,e.city,pem.id,pem.project_id,pem.employee_id,p.id ,p.name,p.department_id
     FROM employee.employee e 
     right OUTER JOIN employee.project_employee_mapping pem 
     ON e.id=pem.employee_id 
     RIGHT  OUTER JOIN employee.projects p 
     on pem.project_id =p.id ;
     
    USE employee;
    SELECT p.id,p.name FROM projects p 
    UNION 
    SELECT d.id ,d.name FROM department d;
   
   SELECT e.id,e.name,e.salary,e.city,pem.id,pem.project_id,pem.employee_id,p.id ,p.name,p.department_id
FROM employee.employee e 
      INNER JOIN employee.project_employee_mapping pem
      INNER JOIN employee.projects p    
      on e.id= pem.employee_id AND pem.project_id=p.id;
     
      SELECT e.id,e.name,e.salary,e.city,pem.id,pem.project_id,pem.employee_id,p.id ,p.name,p.department_id
     FROM employee.employee e 
     LEFT OUTER JOIN employee.project_employee_mapping pem 
     ON e.id=pem.employee_id 
     LEFT OUTER JOIN employee.projects p 
     on pem.project_id =p.id ;
   
   SELECT SUM(amount) as total_contribution from eventpool.contribution c where user_id=12;  
  
  
     
     