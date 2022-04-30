# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
    id bigint auto_increment not null,
    username varchar(255),
    password varchar(255),
    uuid bigint,
    constraint pk_user primary key (id),
    constraint user_id unique (uuid)
);

create table follower (
    follower_id bigint,
    user_id bigint,
    foreign key (follower_id) references user(uuid),
    foreign key (user_id) references user(uuid)
);


# --- !Downs

drop table if exists follower;

drop table if exists user;

