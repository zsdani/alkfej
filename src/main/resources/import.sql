insert into Users(username, name, role, sum_credit, e_mail) values('student1', 'Kis János', 'STUDENT', 6, 'kis@gmail.com');
insert into Users(username, name, role, sum_credit, e_mail) values('student2', 'Kis Márk', 'STUDENT', 5, 'mark@hotmail.com');
insert into Users(username, name, role, sum_credit, e_mail) values('student3', 'Kis Edit', 'STUDENT', 6, 'edi@gmail.hu');
insert into Users(username, name, role, e_mail) values('teacher1', 'Nagy Péter', 'TEACHER', 'tech@citromail.hu');

insert into Building (b_name, floors) values ('Deli tomb', 7);
insert into Building (b_name, floors) values ('Eszaki tomb', 8);
insert into Building (b_name, floors) values ('PPK Epulet', 9);


insert into Subject (name, code, description, credit, building_id) values ('Alkalmazások fejlesztése', 'IK01', 'Spring boot és Angular fejlesztés',1, 3);
insert into Subject (name, code, description, credit, building_id) values ('Valószínűségszámítás', 'IK02', 'Beleépítve statisztika',2, 2);
insert into Subject (name, code, description, credit, building_id) values ('Analízis 3.', 'IK03', 'Integrálás', 3, 1);
insert into Subject (name, code, description, credit, building_id) values ('Analízis 1.', 'AN01', 'Deriválás alapjai', 3, 3);


insert into users_subjects (users_id, subjects_id) values (1, 1);
insert into users_subjects (users_id, subjects_id) values (1, 2);
insert into users_subjects (users_id, subjects_id) values (2, 1);
insert into users_subjects (users_id, subjects_id) values (2, 2);
insert into users_subjects (users_id, subjects_id) values (3, 1);
insert into users_subjects (users_id, subjects_id) values (3, 3);
insert into users_subjects (users_id, subjects_id) values (3, 4);



