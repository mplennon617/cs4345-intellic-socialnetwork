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
    followerID bigint,
    userID bigint,
    foreign key (followerID) references user(uuid),
    foreign key (userID) references user(uuid)
);

INSERT INTO follower (follower_id, user_id)
VALUES (48020951, 00000001);

INSERT INTO follower (follower_id, user_id)
VALUES (00000001, 48020951);

# --- !Downs

drop table if exists follower;

drop table if exists user;

