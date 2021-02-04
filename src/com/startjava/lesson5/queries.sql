--psql -U postgres --file=queries.sql

\c jaegers;

SELECT * FROM Jaegers;

SELECT * FROM Jaegers WHERE status = 'Active';

SELECT * FROM Jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6';
-- или вариант:
-- SELECT * FROM Jaegers WHERE mark SIMILAR TO '(Mark-1|Mark-6)';

SELECT * FROM Jaegers ORDER BY mark DESC;

SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);

SELECT * FROM Jaegers
	WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers) 
	OR kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);

SELECT AVG(weight) FROM Jaegers;

UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Active';

DELETE FROM Jaegers WHERE status ='Destroyed';
