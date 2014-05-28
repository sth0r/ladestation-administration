/*carcharger
 * 
 * Billing system for charging electric cars.
 * 
 * 2014 DTU
 */
/* To change database password run command: call SYSCS_UTIL.SYSCS_SET_DATABASE_PROPERTY('derby.user.Group9', '1234')*/
DROP TABLE "CHARGINGSTATS";
DROP TABLE "CUSTOMERS";
DROP TABLE "PRICESES";
/**
 *
 * @author Thim
 */
CREATE TABLE "CUSTOMERS" 
(
    "UID" varchar (20),
    "FIRSTNAME" varchar (20),
    "LASTNAME" varchar (30),
    "BALANCE" double,
    "CREDITLIMIT" double,
    "EMAIL" varchar (30),
    "TLF" varchar (20),
    "PASSWORD" varchar (20),
   PRIMARY KEY ("UID")
);
   
CREATE TABLE "CHARGINGSTATS" 
(
   "TAID" varchar (20),
   "STARTED" varchar (20),
   "SECONDSCHARGED" varchar (20),
   "PRICE" double,
   "UID" varchar (20),
   PRIMARY KEY ("TAID")
);

CREATE TABLE "PRICESES" 
(
    "PRICE" double,
   PRIMARY KEY ("PRICE")
);

INSERT INTO "CUSTOMERS" ("UID","FIRSTNAME", "LASTNAME","BALANCE","CREDITLIMIT","EMAIL","TLF","PASSWORD")
VALUES 
   ('F561A25C','Harvey','Deitel',100,1000,'Harvey@car.com','18771556','1234'),
   ('7B503FD7','Paul','Deitel',200,100,'Paul@gmail.com','28771556','1234'), 
   ('F561A789','Andrew','Goldberg',300,10,'andrew@goldberg.com','38771556','1234'),
   ('F561A007','David','Choffnes',400,100,'mr.choffins@yahoo.com','48771556','1234');

INSERT INTO "CHARGINGSTATS" ("TAID","STARTED","SECONDSCHARGED","PRICE","UID")
VALUES
   ('90000000','16-47-01','1',23,'F561A25C'),
   ('91000000','12-47-51','24',665,'F561A25C'),
   ('91100000','23-59-59','15',98,'F561A25C');

INSERT INTO "PRICESES" ("PRICE")
VALUES
   (0.47);
