CREATE OR REPLACE USER fran@localhost IDENTIFIED BY 'Fr4n';
GRANT ALL PRIVILEGES ON  *.* to 'fran'@'localhost';
CREATE OR REPLACE DATABASE tienda;
USE tienda;
CREATE TABLE producto (
    id VARCHAR(10) NOT NULL,
    nombre VARCHAR(30) NULL DEFAULT NULL,
    descripcion VARCHAR(200) NULL DEFAULT NULL,
    precio INT(11) NULL DEFAULT NULL,
    pais VARCHAR(30) NULL DEFAULT NULL,
    PRIMARY KEY (id)
);