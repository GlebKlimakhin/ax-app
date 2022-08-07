create table users(
    id uuid not null unique,
    username varchar(50) not null unique,
    password varchar(50) not null,
    firstname varchar(50) not null,
    surname varchar(50) not null,
    created_at timestamp
);

create table exercises(
                          id uuid primary key not null unique,
                          exercise_type varchar(50) not null,
                          data text not null,
                          score int
);


create table user_profiles (
    id uuid not null unique,
    about_me text,
    primary key (id)
);

create table profile_pictures (
    id uuid unique,
    size bigint,
    link varchar(255),
    content_type varchar(255),
    user_id uuid,
    primary key (id),
    foreign key (user_id) references users(id)
);

create table roles(
    id uuid primary key not null unique,
    name varchar(50) not null unique
);

create table groups (
    id uuid primary key not null unique,
    name varchar(50) not null unique
);

create table homeworks(
    id uuid primary key not null unique,
    start_date date,
    deadline_date date
);

create table users_roles(
    user_id uuid primary key not null references users(id),
    role_id uuid references roles(id)
);

create table users_groups(
    user_id uuid primary key not null references users(id),
    group_id uuid not null references groups(id)
);

create table users_exercises(
    user_id uuid,
    exercise_id uuid,
    primary key(user_id, exercise_id),
    foreign key(user_id) references users(id),
    foreign key(exercise_id) references exercises(id)
);

create table groups_homeworks(
    group_id uuid primary key not null  references groups(id),
    homework_id uuid not null references homeworks(id)
);

create table homeworks_exercises(
    homework_id uuid,
    exercise_id uuid,
    primary key(homework_id, exercise_id),
    foreign key (homework_id) references homeworks(id),
    foreign key (exercise_id) references exercises(id)
);

insert into exercises(id, exercise_type, data, score) values
('782ad674-e18d-11ec-b177-25ed5045f800','READING_SPEED', 'test data', 5);


