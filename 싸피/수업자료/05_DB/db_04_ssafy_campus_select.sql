-- 모든 사원 정보 검색
SELECT *
FROM EMP;

-- 사원이 근무하는 부서번호
SELECT DEPTNO
FROM EMP;

-- 사원이 근무하는 부서번호 (중복제거)
SELECT DISTINCT DEPTNO AS "부서번호"
FROM EMP; 

-- 사원의 이름, 사번, 급여*12(연봉), 업무 조회
SELECT ENAME 이름, EMPNO "사번", SAL*12 AS 연봉, JOB AS "업 무"
FROM EMP;

-- 사원의 이름, 사번, 커미션, 급여, 커미션 포함 급여 조회
SELECT ename 이름, empno AS "사번", comm 커미션, 
	   sal AS 급여, sal + comm AS "커미션 포함급여", 
       sal + IFNULL(comm, 0) AS "커미션 포함급여2"
FROM emp;

-- CASE FUNCTION 써보자
SELECT empno, ename, sal,
	CASE WHEN sal >= 5000 THEN "고액연봉"
		 WHEN sal >= 2000 THEN "평균연봉"
         ELSE "저액연봉"
	END AS "연봉등급"
FROM emp;


-- 부서 번호가 30인 사원중 급여가 1500 이상인 사원의 이름, 급여, 부서번호 조회
SELECT ename, sal, deptno
FROM emp
WHERE deptno = 30 AND sal >= 1500;

-- 부서번호가 20 또는 30인 부서에서 근무하는 사원의 사번, 이름, 부서번호 조회
SELECT empno, ename, deptno
  FROM emp
 WHERE deptno = 30
    OR deptno = 20;

-- 부서번호가 20,30이 아닌 부서에서 근무하는 사원의 사번, 이름, 부서번호 조회
SELECT empno, ename, deptno
FROM emp
WHERE deptno != 30 AND deptno <> 20;

SELECT empno, ename, deptno
FROM emp
WHERE NOT (deptno = 30 OR deptno = 20);

-- 업무가 MANAGER, ANALYST, PRESIDENT 인 사원의 이름, 사번, 업무조회
SELECT ename, empno, job
FROM emp
WHERE job IN ('MANAGER', 'ANALYST', 'PRESIDENT');

-- 부서번호가 10, 20이 아닌 사원의 사번, 이름, 부서번호 조회
SELECT empno, ename, deptno
FROM emp
WHERE deptno NOT IN (10, 20);

-- 급여가 2000이상 3000이하 인 사원의 사번, 이름, 급여조회
SELECT empno, ename, sal
FROM emp
WHERE sal BETWEEN 2000 AND 3000; 
-- WHERE sal >= 2000 AND sal <=3000;

-- 입사일이 1981년인 직원의 사번, 이름, 입사일 조회
SELECT empno, ename, hiredate
FROM emp
WHERE hiredate BETWEEN '1981-01-01' AND '1981-12-31';

-- 커미션인 NULL 인 사원의 사번, 이름, 커미션 조회
SELECT empno, ename, comm
FROM emp
-- WHERE comm = NULL;
WHERE comm IS NULL;

-- 커미션 NULL이 아닌 사원의 사번, 이름, 업무, 커미션 조회
SELECT empno, ename, comm
FROM emp
WHERE comm IS NOT NULL;

-- 이름이 M으로 시작하는 사원의 사번, 이름 조회
SELECT empno, ename
FROM emp
WHERE ename LIKE 'M%';

-- 이름에 E가 포함된 사원의 사번 이름 조회
SELECT empno, ename
FROM emp
WHERE ename LIKE '%E%';

-- 이름의 세번째 알파벳이 'A'인 사원의 사번, 이름 조회
SELECT empno, ename
FROM emp
WHERE ename LIKE '__A%';

-- 모든 직원의 모든 정보를 이름을 기준으로 내림차순 정룔
SELECT *
FROM emp
ORDER BY ename DESC;

-- 모든 사원의 사번 이름, 급여를 조회 (급여 내림차순)
SELECT empno, ename, sal
FROM emp
ORDER BY sal DESC;

-- 20, 30번 부서에 근무하는 사원의 사번, 이름, 부서번호, 급여 조회 (부서별 오름차순, 급여순 내림차순)
SELECT empno, ename, deptno, sal
FROM emp
WHERE deptno IN (20, 30)
ORDER BY deptno, sal DESC;