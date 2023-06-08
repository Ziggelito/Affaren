USE customerdb;
INSERT INTO customer VALUES (1,'Nils','270813');
INSERT INTO customer VALUES (2,'Jakob','270418');
INSERT INTO customer VALUES (3,'Eva','270509');
INSERT INTO customer VALUES (4,'Lola','271213');
INSERT INTO customer VALUES (5,'Hannes','270327');
INSERT INTO customer VALUES (6,'Mahmoud','270428');
INSERT INTO customer VALUES (7,'Robert','270621');
INSERT INTO customer VALUES (8,'Sigrun','270802');
UPDATE customer_seq SET next_val = 51;

USE itemdb;
INSERT INTO items VALUES (1,'jacka','270');
INSERT INTO items VALUES (2,'jeans','340');
INSERT INTO items VALUES (3,'jackett','246');
INSERT INTO items VALUES (4,'joggingbyxor','3452');
INSERT INTO items VALUES (5,'johannesört','2235');
INSERT INTO items VALUES (6,'javabok','23');
INSERT INTO items VALUES (7,'jalusier','2354');
UPDATE items_seq SET next_val = 51;

USE orderdb;
INSERT INTO  orders VALUES (1,'200230123', '1', '2');
INSERT INTO  orders VALUES (2,'200230428', '7', '1');
INSERT INTO  orders VALUES (3,'200231601', '5', '3');