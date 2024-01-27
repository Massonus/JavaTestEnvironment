CREATE OR REPLACE FUNCTION get_geom_difference()
    RETURNS text AS
$BODY$
SELECT name
FROM   laptop
WHERE  id = 1
LIMIT  1;
$BODY$    LANGUAGE sql;

CREATE OR REPLACE FUNCTION get_difference(idS int)
    RETURNS text AS
$BODY$
SELECT name
FROM   laptop
WHERE  id = idS
LIMIT  1;
$BODY$    LANGUAGE sql;