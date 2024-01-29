CREATE OR REPLACE FUNCTION get_geom_difference()
    RETURNS text AS
$BODY$
SELECT type
FROM   device
WHERE  device_id = 1
    LIMIT  1;
$BODY$    LANGUAGE sql;

CREATE OR REPLACE FUNCTION get_difference(id int)
    RETURNS text AS
$BODY$
SELECT type
FROM   device
WHERE  device_id = id
    LIMIT  1;
$BODY$    LANGUAGE sql;

INSERT INTO public.products(
    "product_сode", product_name)
VALUES ('S18_4600', '1940s Ford truck'),
       ('S32_2206', '1982 Ducati 996 R'),
       ('S700_3962', 'The Queen Mary')

    INSERT INTO public.orderdetails(
    product_code, quantity_ordered)
VALUES ('S18_4600', '41'),
    ('S32_2206', '33'),

SELECT
    product_name,
    quantity_ordered
FROM
    products
        INNER JOIN orderdetails
                   ON products.product_сode = orderdetails.product_code
ORDER BY product_name;

SELECT
    product_name,
    quantity_ordered
FROM
    products
        LEFT JOIN orderdetails
                  ON orderdetails.product_code = product_сode
ORDER BY product_name;

SELECT
    product_name,
    quantity_ordered
FROM
    products
        RIGHT JOIN orderdetails
                   ON orderdetails.product_code = product_сode
ORDER BY product_name;

SELECT
    product_name,
    quantity_ordered
FROM
    products
        FULL OUTER JOIN orderdetails
                        ON orderdetails.product_code = product_сode
ORDER BY product_name;

SELECT product_name as name
FROM products
UNION
SELECT quantity_ordered as q
FROM orderdetails

Select s.id, s.name, t.id as tr_id
FROM teachers as t
         INNER JOIN students as s
                    on s.teacher_id = t.id
ORDER by name

CREATE TABLE public.music
(
    id serial NOT NULL,
    song_name text,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.music
    OWNER to postgres;

CREATE TABLE public.author
(
    id serial NOT NULL,
    name text,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.author
    OWNER to postgres;

CREATE TABLE public.connections
(
    author_id serial,
    song_id serial,
    CONSTRAINT uthor_fk FOREIGN KEY (author_id)
        REFERENCES public.author (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT song_fk FOREIGN KEY (song_id)
        REFERENCES public.music (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);

ALTER TABLE IF EXISTS public.connections
    OWNER to postgres;

INSERT INTO public.author(
    id, name)
VALUES (1, 'cat'),
       (2, 'dog'),
       (3, 'frog');

    INSERT INTO public.music(
    id, song_name)
VALUES (1, 'gav'),
    (2, 'kva'),
    (3, 'bla');

INSERT INTO public.connections(
    author_id, song_id)
VALUES (1, 1),
    (1, 2),
    (2, 1),
    (2, 3),
    (3, 1)

SELECT
    a.name, a.id
FROM
    author as a
        INNER JOIN connections as c
                   ON c.author_id = a.id
ORDER BY a.name;

SELECT
    song_name, id
FROM
    music as m
WHERE m.id in (select song_id from connections
               where author_id in (SELECT id FROM author as m where name = 'cat'))

    INSERT INTO public.author(
    id, name)
VALUES (4, 'cat');

INSERT INTO public.connections(
    author_id, song_id)
VALUES (4, 3)

SELECT p1.product_name AS product, p2.product_name AS related_product
FROM products p1
         JOIN products p2 ON p1.id <> p2.id;

SELECT p.product_name, o.quantity_ordered
FROM products p
         CROSS JOIN orderdetails o;