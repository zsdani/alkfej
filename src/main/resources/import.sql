insert into User(username, name, role, sum_credit, e_mail) values('student1', 'Kis János', 'STUDENT', 6, 'kis@gmail.com');
insert into User(username, name, role, sum_credit, e_mail) values('student2', 'Kis Márk', 'STUDENT', 5, 'mark@hotmail.com');
insert into User(username, name, role, sum_credit, e_mail) values('student3', 'Kis Edit', 'STUDENT', 6, 'edi@gmail.hu');
insert into User(username, name, role, e_mail) values('teacher1', 'Nagy Péter', 'TEACHER', 'tech@citromail.hu');


insert into Subject (name, code, description, credit, mark) values ('Alkalmazások fejlesztése', 'IK01', 'Spring boot és Angular fejlesztés',1, 4);
insert into Subject (name, code, description, credit, mark) values ('Valószínűségszámítás', 'IK02', 'Beleépítve statisztika',2, 3);
insert into Subject (name, code, description, credit, mark) values ('Analízis 3.', 'IK03', 'Integrálás', 3, 2);
insert into Subject (name, code, description, credit, mark) values ('Analízis 1.', 'AN01', 'Deriválás alapjai', 3, 3);


insert into user_subjects(users_id, subjects_id) values (1, 1);
insert into user_subjects(users_id, subjects_id) values (1, 2);
insert into user_subjects(users_id, subjects_id) values (1, 3);
insert into user_subjects (users_id, subjects_id) values (2, 2);
insert into user_subjects (users_id, subjects_id) values (2, 4);
insert into user_subjects (users_id, subjects_id) values (3, 3);
insert into user_subjects (users_id, subjects_id) values (3, 4);




insert into Exams (name, location, subject_id) values ('Analizis1 1.vizsga', 'Bolyai előadó', 4);
insert into Exams (name, location, subject_id) values ('Analizis1 2.vizsga', 'Kitaibel előadó', 4);
insert into Exams (name, location, subject_id) values ('Valószínűségszámítás 1.vizsga', 'Lovarda', 2);
insert into Exams (name, location, subject_id) values ('Analizis3 1.vizsga', 'D1-222', 3);
insert into Exams (name, location, subject_id) values ('Alkalmazások fejlesztése 1.vizsga', 'Adatbázis labor', 1);