CREATE USER 'customeruser'@'%' IDENTIFIED BY 'secretPassword';
grant select, insert, update, delete on customerdb.* to 'customeruser'@'%';

CREATE USER 'itemuser'@'%' IDENTIFIED BY 'secretPassword';
grant select, insert, update, delete on itemdb.* to 'itemuser'@'%';

CREATE USER 'orderuser'@'%' IDENTIFIED BY 'secretPassword';
grant select, insert, update, delete on orderdb.* to 'orderuser'@'%';
grant select, insert, update, delete on customerdb.* to 'orderuser'@'%';
grant select, insert, update, delete on itemdb.* to 'orderuser'@'%';