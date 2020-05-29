-- 2020.05.21


----------------------
--JOIN
----------------------

select * from emp;
select * from dept;
select * from dept,emp;


-- corss join
select *
from emp, dept;

select*
from emp cross join dept; -- 위에 , 가 더편함

select ename, dname
from emp, dept
where emp.deptno = dept.deptno
;



select ename,dname
from emp inner join dept
on emp.deptno = dept.deptno -- 위에랑 똑같음 mysql에선 이거써야함
;

select *
from emp join dept -- 그냥 join하면 아래 using,on 써야함 
USING(deptno);

select ename, 
from emp natural join dept;






-- book, customer, orders
-- corss JOIN

select *
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
;



-- (3)박지성

select *
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
and name='박지성'
;


select * from emp;
select * from salgrade;

select ename, sal, grade
from emp e,salgrade s
--where e.sal >= s.losal and e.sal <= s.hisal
where sal BETWEEN losal and hisal
;

-- 매니저이름알아보기
select * from emp;

SELECT employee.ename || '의 매니저는 '
|| manager.ename || '입니다.'
FROM emp employee, emp manager
WHERE employee.mgr = manager.empno;


SELECT e.ename , e.empno, e.sal , e.comm , nvl(m.ename,'관리자없음')
FROM emp e, emp m
WHERE e.mgr = m.empno(+);


select * 
from emp e left outer join emp m
on e.mgr = m.empno
;

