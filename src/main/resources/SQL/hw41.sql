CREATE TABLE public.leptops
(
    id serial NOT NULL,
    name text,
    second_name text,
    "is_available" boolean,
    count integer DEFAULT 0,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.leptops
    OWNER to postgres;


INSERT INTO public.leptops(
    name, second_name, is_avaliable, count)
VALUES ('First', 'Lep', true, 0);

SELECT id FROM leptops

SELECT * FROM leptops WHERE is_available = true OR count > 0

SELECT id FROM leptops WHERE is_available = true OR count > 0

UPDATE leptops
SET count = 22
WHERE id = 4;

ALTER TABLE IF EXISTS public.leptops
    ADD COLUMN type text;

DELETE FROM public.leptops
WHERE count = 0;
