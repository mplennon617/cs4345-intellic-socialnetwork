# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table follower (
  follower_id                   bigint,
  user_id                       bigint
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  uuid                          bigint,
  constraint pk_user primary key (id)
);

INSERT INTO follower (follower_id, user_id)
VALUES (48020951, 00000001);

INSERT INTO follower (follower_id, user_id)
VALUES (00000001, 48020951);

# --- !Downs

drop table if exists follower;

drop table if exists user;

