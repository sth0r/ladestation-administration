/* To change password run command: call SYSCS_UTIL.SYSCS_SET_DATABASE_PROPERTY('derby.user.Group9', '1234')*/
DROP TABLE "CHARGINGSTATS";
DROP TABLE "CUSTOMERS";
DROP TABLE "PRICESES";

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
   "TAID" INT NOT NULL GENERATED ALWAYS AS IDENTITY,
   "STARTED" varchar (20),
   "STOPPED" varchar (20),
   "DURATION" varchar (20),
   "UID" varchar (20),
   PRIMARY KEY ("TAID"),
   FOREIGN KEY ("UID") REFERENCES "CUSTOMERS" ("UID")
);

CREATE TABLE "PRICESES" 
(
    "PLACE" varchar (30),
    "PRICE" double,
   PRIMARY KEY ("PLACE")
);

INSERT INTO "CUSTOMERS" ("UID","FIRSTNAME", "LASTNAME","BALANCE","CREDITLIMIT","EMAIL","TLF","PASSWORD")
VALUES 
   ('F561A25C','Harvey','Deitel',100,1000,'Harvey@car.com','18771556','1234'),
   ('7B503FD7','Paul','Deitel',200,100,'Paul@gmail.com','28771556','1234'), 
   ('F561A789','Andrew','Goldberg',300,10,'andrew@goldberg.com','38771556','1234'),
   ('F561A007','David','Choffnes',400,100,'mr.choffins@yahoo.com','48771556','1234');

INSERT INTO "CHARGINGSTATS" ("STARTED","STOPPED","DURATION","UID")
VALUES
   ('2014-03-25 14:55:33','2014-03-25 15:55:33','1','F561A25C'),
   ('2014-03-25 14:55:33','2014-03-26 15:55:33','24','F561A25C'),
   ('2014-03-25 14:55:33','2014-03-25 16:25:33','15','F561A25C');

INSERT INTO "PRICESES" ("PLACE","PRICE")
VALUES
   ('Copenhagen',0.47);
