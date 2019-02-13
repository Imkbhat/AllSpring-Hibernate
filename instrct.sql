create table instructor_detail (
	id SERIAL primary key,
	youtube_channel character varying(15),
	hobby character varying(20)
);

create table instructor (
            id SERIAL primary key,
            instructor_detail_id integer,
	    first_name character varying(200),
	    last_name character varying(200),
            email character varying(200),
            CONSTRAINT fk_instructor FOREIGN KEY (instructor_detail_id)
            REFERENCES instructor_detail(id)
);


create table course (
	id SERIAL primary key,
	title character varying(128) UNIQUE DEFAULT NULL,
	instructor_id integer,
	CONSTRAINT fk_instructor FOREIGN KEY (instructor_id)
        REFERENCES instructor(id)
);

create table review (
	id SERIAL primary key,
	comments character varying(256) DEFAULT NULL,
	course_id integer DEFAULT NULL,
	CONSTRAINT fk_course FOREIGN KEY (course_id)
            REFERENCES course(id)
);

create table course_student(
	student_id integer NOT NULL,
	course_id integer NOT NULL,
	CONSTRAINT pk_course_student PRIMARY KEY (student_id,course_id),
	CONSTRAINT fk_course FOREIGN KEY (course_id) REFERENCES course(id),
	CONSTRAINT fk_student FOREIGN KEY (student_id) REFERENCES student(id)
);


ALTER TABLE student ADD CONSTRAINT pk_student PRIMARY KEY(id);

id         | integer               |           | not null | nextval('student_id_seq'::regclass)
 first_name | character varying(50) |           |          | 
 last_name  | character varying(50) |           |          | 
 email      | character varying(20) |           |          | 
Indexes:
    "student_id_key" UNIQUE CONSTRAINT, btree (id)


