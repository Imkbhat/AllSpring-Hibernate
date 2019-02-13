CREATE TABLE customer (
  id serial UNIQUE NOT NULL,
  first_name character varying(45) DEFAULT NULL,
  last_name character varying(45) DEFAULT NULL,
  email character varying(45) DEFAULT NULL,
  PRIMARY KEY (id)
);

INSERT INTO customer VALUES (1,'David','Adams','david@luv2code.com');
INSERT INTO customer VALUES (2,'John','Doe','john@luv2code.com');
INSERT INTO customer VALUES (3,'Ajay','Rao','ajay@luv2code.com');
INSERT INTO customer VALUES (4,'Mary','Public','mary@luv2code.com');
INSERT INTO customer VALUES (5,'Maxwell','Dixon','max@luv2code.com');
