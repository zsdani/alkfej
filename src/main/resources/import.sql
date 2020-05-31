
insert into Users(username, name, password, role, sum_credit, e_mail) values('student1', 'Kis János', '$2y$12$k0a5wZe/ZQmJzSyDBMeqn.J53sScyKo4rc0HQgul4xhltwF4bYJf.', 'STUDENT', 6, 'kis@gmail.com');
insert into Users(username, name, password, role, sum_credit, e_mail) values('student2', 'Kis Márk', '$2y$12$D21S1qz1dw2ig9OCYjfJoO5ltSKxVDxK3d3AXNk1/1Ec.Y0J/NObW', 'STUDENT', 5, 'mark@hotmail.com');
insert into Users(username, name, password, role, sum_credit, e_mail) values('student3', 'Kis Edit','$2y$12$fO0UDeKdeYAOaaC112.FjuNBJ/IPHr8YEtGI/21EFygyh902JjarO', 'STUDENT', 6, 'edi@gmail.hu');
insert into Users(username, name, password, role, e_mail) values('admin1', 'Nagy Miki', '$2y$12$RZvQfbMMbz7qAuFeAQnGv.VJhq3GoHibSo36D7WBCmBHnhP7C3MtK', 'ADMIN', 'tech@citromail.hu');
insert into Users(username, name, password, role, e_mail) values('admin2', 'Nagy Ákos', '$2y$12$Ub9hlIudJdE9pBHAInpS0uY9vB8V8EryfbjZ5Zt8bR9m1lSEYEv6q', 'ADMIN', 'nagyakos@citromail.hu');


insert into Building (id,b_name, floors,room) values (1,'Északi épület', 1,102);
insert into Building (id,b_name, floors,room) values (2, 'Északi épület', 2,101);
insert into Building (id,b_name, floors,room) values (3, 'Déli épület', 3,432);
insert into Building (id,b_name, floors,room) values (4,'Északi épület', 7,22);
insert into Building (id,b_name, floors,room) values (5, 'Déli épület', 4,24);
insert into Building (id,b_name, floors,room) values (6, 'Északi épület', 9,99);


insert into Subject (name, code, description, credit, building_id,buildingid,status) values ('Alkalmazások fejlesztése', 'IK01', 'Spring boot és Angular fejlesztés',1,1, 1,'Első félév');
insert into Subject (name, code, description, credit, building_id,buildingid,status) values ('Valószínűségszámítás', 'IK02', 'Beleépítve statisztika',2, 2,2,'Első félév');
insert into Subject (name, code, description, credit, building_id,buildingid,status) values ('Analízis 3.', 'IK03', 'Integrálás', 3, 4,4,'Első félév');
insert into Subject (name, code, description, credit, building_id,buildingid,status) values ('Analízis 1.', 'AN01', 'Deriválás alapjai', 3, 3,'Első félév');
insert into Subject (name, code, description, credit, building_id,buildingid,status) values ('Prog alap', 'pr10', 'For ciklus', 3, 2,2,'Első félév');
insert into Subject (name, code, description, credit, building_id,buildingid,status) values ('Gt prog', 'pr11', 'Gt lib', 3, 2,2,'Második félév');
insert into Subject (name, code, description, credit, building_id,buildingid,status) values ('Java', 'pr12', 'Java bla-bla', 3, 1,1,'Harmadik félév');
insert into Subject (name, code, description, credit, building_id,buildingid,status) values ('C++', 'pr13', 'C++ mély megsimerése', 3, 2,2,'Negyedik félév');
insert into Subject (name, code, description, credit, building_id,buildingid,status) values ('Valószínűség számítás', 'IK33', 'Kombinatorika egyetemi szinten', 3, 4,4,'Ötödik félév');
insert into Subject (name, code, description, credit, building_id,buildingid,status) values ('MI', 'pr15', 'Mesterséges ...', 3, 1,1,'Hatodik félév');

insert into users_subjects (users_id, subjects_id) values (1, 1);
insert into users_subjects (users_id, subjects_id) values (1, 2);
insert into users_subjects (users_id, subjects_id) values (2, 1);
insert into users_subjects (users_id, subjects_id) values (2, 2);
insert into users_subjects (users_id, subjects_id) values (3, 3);

--insert into users_subjects (users_id, subjects_id) values (3, 1);
--insert into users_subjects (users_id, subjects_id) values (3, 3);
--insert into users_subjects (users_id, subjects_id) values (3, 4);





