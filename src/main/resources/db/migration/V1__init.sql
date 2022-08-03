create table users(
    id bigserial primary key not null unique,
    username varchar(50) not null unique,
    password varchar(50) not null,
    firstname varchar(50) not null,
    surname varchar(50) not null,
    created_at date,
    updated_at date
);

create table roles(
    id serial primary key not null unique,
    name varchar(50) not null unique
);

create table groups(
    id serial primary key not null unique,
    name varchar(50) not null unique
);

create table homeworks(
    id bigserial primary key not null unique,
    start_date date,
    deadline_date date
);

create table users_roles(
    user_id bigint primary key not null references users(id),
    role_id bigint references roles(id)
);

create table users_groups(
    user_id bigint primary key not null references users(id),
    group_id int not null references groups(id)
);

create table groups_homeworks(
    group_id int primary key not null  references groups(id),
    homework_id bigint not null references homeworks(id)
);

create table exercises(
    id bigserial primary key not null unique,
    exercise_type varchar(13) not null,
    data text not null,
    duration bigint,
    score int,
    is_correct bool
);

create table users_exercises(
    user_id bigint not null primary key references users(id),
    exercise_id bigint not null references exercises(id)
);

insert into exercises (exercise_type, data)
values ('Reading','Дорогие друзья');


