CREATE TABLE teachers(
    id bigint(10) NOT NULL AUTO_INCREMENT,
    name varchar (50) NOT NULL ,
    email varchar (30) NOT NULL ,
    phone bigint(20) NOT NULL ,
    PRIMARY KEY (id),
    UNIQUE KEY UK_name (email)
)ENGINE = InnoDB DEFAULT CHARSET=utf8;