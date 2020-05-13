
INSERT INTO "public"."gedom_user" (id, email, nm_password, nm_user) VALUES (1, 'pmaquitorres@gmail.com', 'password', 'zimahaba');

INSERT INTO "public"."employer" (id,ds_address,dt_birthday,nr_cpf,nm_name,user_id) VALUES (1,'Rua Maria Digna Gameiro, 419, Apt. 302',{d '1988-11-04'},'06544083437','Paulo Burlamaqui e Torres',1);

INSERT INTO "public"."employee" (id,ds_address,dt_birthday,tm_break_end,tm_break_start,nr_cpf,nr_ctps,tm_entrance,tm_exit,nm_name,nr_rg,ds_role,vl_salary,employer_id) VALUES (1,'Rua Maria Ramos, 1276',{d '1988-09-18'},{t '12:00:00'},{t '13:00:00'},'01234567890','3216549',{t '07:00:00'},{t '16:00:00'},'Danielle Clericuzi Cavalcanti','1234567','Empregada',1070.00,1);

INSERT INTO "public"."month" (id,nm_month, nr_month, nr_year, hr_extra, hr_holiday, fl_closed, employee_id) VALUES (1,'MAY',5,2020, {t'00:00:00'}, {t'00:00:00'}, false, 1);

INSERT INTO "public"."punch" (id,dt_date,tm_entrance,tm_break_start, tm_break_end, tm_exit, fl_holiday, month_id) VALUES (1,{d '2020-05-01'},{t'08:00:00'},{t'12:00:00'},{t'13:00:00'},{t'16:00:00'}, false, 1);
INSERT INTO "public"."punch" (id,dt_date,tm_entrance,tm_break_start, tm_break_end, tm_exit, fl_holiday, month_id) VALUES (2,{d '2020-05-02'},{t'08:30:00'},{t'12:30:00'},{t'13:30:00'},{t'16:30:00'}, false, 1);
INSERT INTO "public"."punch" (id,dt_date,tm_entrance,tm_break_start, tm_break_end, tm_exit, fl_holiday, month_id) VALUES (3,{d '2020-05-03'},{t'08:10:00'},{t'12:10:00'},{t'13:10:00'},{t'16:10:00'}, false, 1);
INSERT INTO "public"."punch" (id,dt_date,tm_entrance,tm_break_start, tm_break_end, tm_exit, fl_holiday, month_id) VALUES (4,{d '2020-05-04'},{t'08:40:00'},{t'12:40:00'},{t'13:40:00'},{t'16:40:00'}, false, 1);