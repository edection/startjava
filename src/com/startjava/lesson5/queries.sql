SELECT * FROM Jaegers;

SELECT modelName, mark, height, weight, status, origin, kaijuKill, launch FROM Jaegers WHERE status = 'Active';

SELECT modelName, mark, height, weight, status, origin, kaijuKill, launch FROM Jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6';
-- или вариант:
SELECT modelName, mark, height, weight, status, origin, kaijuKill, launch FROM Jaegers WHERE mark SIMILAR TO '(Mark-1|Mark-6)';

SELECT modelName, mark, height, weight, status, origin, kaijuKill, launch FROM Jaegers ORDER BY mark DESC;

SELECT modelName, mark, height, weight, status, origin, kaijuKill, launch FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);

SELECT modelName, mark, height, weight, status, origin, kaijuKill, launch FROM Jaegers
	WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers) 
	OR kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);

SELECT AVG(weight) FROM Jaegers;

UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Active';

DELETE FROM Jaegers WHERE status ='Active';
