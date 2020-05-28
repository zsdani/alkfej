
insert into Users(username, name, password, role, sum_credit, e_mail) values('student1', 'Kis János', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', 'STUDENT', 6, 'kis@gmail.com');
insert into Users(username, name, password, role, sum_credit, e_mail) values('student2', 'Kis Márk', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', 'STUDENT', 5, 'mark@hotmail.com');
--insert into Users(username, name, password, role, sum_credit, e_mail) values('student3', 'Kis Edit', 'STUDENT', 6, 'edi@gmail.hu');
insert into Users(username, name, password, role, e_mail) values('admin', 'Nagy Péter', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', 'ADMIN', 'tech@citromail.hu');



insert into Building (b_name, floors) values ('Deli tomb', 7);
insert into Building (b_name, floors) values ('Eszaki tomb', 8);
insert into Building (b_name, floors) values ('PPK Epulet', 9);


insert into Subject (name, code, description, credit, building_id,status) values ('Alkalmazások fejlesztése', 'IK01', 'Spring boot és Angular fejlesztés',1, 10,'Első félév');
insert into Subject (name, code, description, credit, building_id,status) values ('Valószínűségszámítás', 'IK02', 'Beleépítve statisztika',2, 2,'Első félév');
insert into Subject (name, code, description, credit, building_id,status) values ('Analízis 3.', 'IK03', 'Integrálás', 3, 1,'Első félév');
insert into Subject (name, code, description, credit, building_id,status) values ('Analízis 1.', 'AN01', 'Deriválás alapjai', 3, 3,'Első félév');
insert into Subject (name, code, description, credit, building_id,status) values ('Prog alap', 'pr10', 'For ciklus', 3, 3,'Első félév');
insert into Subject (name, code, description, credit, building_id,status) values ('Gt prog', 'pr11', 'Gt lib', 3, 3,'Második félév');
insert into Subject (name, code, description, credit, building_id,status) values ('Java', 'pr12', 'Java bla-bla', 3, 3,'Harmadik félév');
insert into Subject (name, code, description, credit, building_id,status) values ('C++', 'pr13', 'C++ mély megsimerése', 3, 3,'Negyedik félév');
insert into Subject (name, code, description, credit, building_id,status) values ('Valószínűség számítás', 'IK33', 'Kombinatorika egyetemi szinten', 3, 3,'Ötödik félév');
insert into Subject (name, code, description, credit, building_id,status) values ('MI', 'pr15', 'Mesterséges ...', 3, 3,'Hatodik félév');


insert into users_subjects (users_id, subjects_id) values (1, 1);
insert into users_subjects (users_id, subjects_id) values (1, 2);
insert into users_subjects (users_id, subjects_id) values (2, 1);
insert into users_subjects (users_id, subjects_id) values (2, 2);

--insert into users_subjects (users_id, subjects_id) values (3, 1);
--insert into users_subjects (users_id, subjects_id) values (3, 3);
--insert into users_subjects (users_id, subjects_id) values (3, 4);





