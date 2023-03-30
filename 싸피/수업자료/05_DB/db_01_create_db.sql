-- 기본값 확인
SHOW VARIABLES LIKE 'c%';
-- 사용하는 CHARSET 확인
SHOW CHARACTER SET;	

-- 데이터 베이스 생성
CREATE DATABASE ssafy;	

-- 데이터 베이스 목록 조회
SHOW DATABASES;																																																						

-- 데이터 베이스 수정
ALTER DATABASE ssafy
DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

-- 데이터 베이스 삭제
DROP DATABASE ssafy;
DROP DATABASE IF EXISTS ssafy;

-- 데이터 베이스 사용
USE ssafy;