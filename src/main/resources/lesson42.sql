SELECT * FROM leptops

SELECT * FROM leptops ORDER BY name DESC OFFSET 6 LIMIT 3

Select max(id) as c, count(s) as b from leptops

Select min(time) as c, count(s) as b from leptops

SELECT NOW();

INSERT INTO public.leptops(
    name, second_name, is_avaliable, count, type, time)
VALUES ('Name', 'Name', true, 11, 'is', '2023-04-9 07:56:51.390663+00');

SELECT gender, COUNT(gender) as count
FROM MOCK_DATA
WHERE gender = 'Female'
GROUP BY gender
HAVING COUNT(*) > 2;

Select * from (SELECT foo.id FROM (SELECT id, name, type FROM leptops) AS foo) as ff

SELECT *
FROM MOCK_DATA
WHERE id IN (SELECT id FROM leptops);

SELECT *
FROM MOCK_DATA
WHERE id > ALL (SELECT id FROM leptops);

SELECT *
FROM MOCK_DATA
WHERE id > ANY (SELECT id FROM leptops);

SELECT *
FROM MOCK_DATA AS m
WHERE EXISTS (
    SELECT 1
    FROM leptops AS l
    WHERE l.id = m.id
);

INSERT INTO MOCK_DATA (first_name)
VALUES (
           (SELECT id FROM leptops LIMIT 1)
    );

UPDATE MOCK_DATA
SET first_name = (
    SELECT id FROM leptops LIMIT 1
    );

DELETE FROM MOCK_DATA
WHERE id = (
    SELECT id FROM leptops LIMIT 1
    );