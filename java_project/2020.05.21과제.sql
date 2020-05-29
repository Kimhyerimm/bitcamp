32. EQUI 조인을 사용하여 SCOTT 사원의 부서번호와 부서 이름을 출력하시오.
select * from dept;
select * from emp;

select emp.ename,dept.deptno,dept.dname
from emp,dept
where emp.deptno=dept.deptno and emp.ename='SCOTT'
;


33. INNER JOIN과 ON 연산자를 사용하여 사원 이름과 함께 그 사원이 소속된 부서이름과 지역 명을 출력하시오.
select * from dept;
select * from emp;

select emp.ename, dept.dname, dept.loc
from emp inner join dept
on emp.deptno = dept.deptno
;


36. 조인과 WildCARD를 사용하여 이름에 ‘A’가 포함된 모든 사원의 이름과 부서명을 출력하시오.
select * from dept;
select * from emp;

select  emp.ename , dept.dname 
from emp join dept
on emp.deptno=dept.deptno and emp.ename like '%A%';

select emp.ename,dept.dname
from emp,dept
where emp.deptno=dept.deptno and emp.ename like '%A%';



37. JOIN을 이용하여 NEW YORK에 근무하는 모든 사원의 이름, 업무, 부서번호 및 부서명을 출력하시오.
select * from dept;
select * from emp;

select emp.ename , emp.job , dept.deptno , dept.dname
from emp join dept 
on emp.deptno=dept.deptno and dept.loc = 'NEW YORK';

select e.ename,e.job, d.deptno, d.dname
from emp e, dept d
where e.deptno=d.deptno and d.loc = 'NEW YORK';

38. SELF JOIN을 사용하여 사원의 이름 및 사원번호, 관리자 이름을 출력하시오.
select * from dept;
select * from emp;

select b.ename, b.empno , a.ename
from emp a , emp b 
--where a.empno=b.mgr;
where a.mgr=b.empno;

39. OUTER JOIN, SELF JOIN을 사용하여 관리자가 없는 사원을 포함하여 사원번호를 기준으로 내림차순 정렬하여 출력하시오.
select * from dept;
select * from emp;


select b.ename, b.empno, a.ename 
from emp a right outer join emp b
on a.empno=b.mgr
order by b.empno asc
;


40. SELF JOIN을 사용하여 지정한 사원의 이름, 부서번호, 지정한 사원과 동일한 부서에서 근무하는 사원을 출력하시오. ( SCOTT )
select * from dept;
select * from emp;

select  b.ename
from emp a, emp b
where a.ename='SCOTT' and a.deptno=b.deptno and b.ename !='SCOTT'
;


41. SELF JOIN을 사용하여 WARD 사원보다 늦게 입사한 사원의 이름과 입사일을 출력하시오.
select * from dept;
select * from emp;

select a.ename, a.hiredate
from emp a, emp b
where b.ename='WARD' and b.hiredate>a.hiredate
;


42. SELF JOIN 을 사용하여 관리자보다 먼저 입사한 모든 사원의 이름 및 입사일을 관리자의 이름 및 입사일과 함께 출력하시오.
select * from dept;
select * from emp;

select a.ename , a.hiredate , b.ename, b.hiredate
from emp a , emp b
where a.empno = b.mgr and a.hiredate > b.hiredate
;