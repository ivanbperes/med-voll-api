create table alumnus(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    course varchar(100) not null,
    classEntry varchar(100) not null,
    employedOnTheField boolean not null default 0,
    finishedOnTime boolean not null default 0,
    advisor varchar(100) not null,
    thesis varchar(100) not null,

    primary key(id)

);