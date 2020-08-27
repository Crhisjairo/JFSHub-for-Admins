show databases;

use JFS;

CREATE TABLE usuarios (
    id_usuario   NUMERIC NOT NULL,
    nombre       VARCHAR(30) NOT NULL,
    apellido     VARCHAR(30),
    edad         NUMERIC NOT NULL,
    pais         VARCHAR(15)
);

ALTER TABLE usuarios ADD CONSTRAINT usuarios_pk PRIMARY KEY ( id_usuario );

select * from usuarios;

ALTER TABLE usuarios
ADD pass VARCHAR(30) NOT NULL;

ALTER TABLE usuarios AUTO_INCREMENT = 0;

INSERT INTO usuarios (nombre, apellido, edad, pais)
VALUES ('Mango', 'JFS', 17, 'PE');

INSERT INTO usuarios (pass)
VALUES ('hola123');

UPDATE usuarios
set correo = 'email@email.com'
where nombre = 'Dward';

ALTER TABLE usuarios ADD COLUMN correo varchar(50) NOT NULL;

ALTER TABLE usuarios MODIFY COLUMN
    id_usuario INT AUTO_INCREMENT;
    
DELETE FROM usuarios WHERE id_usuario = 7;


COMMIT;