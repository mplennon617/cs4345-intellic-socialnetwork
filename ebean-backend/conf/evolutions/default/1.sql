# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table follower (
<<<<<<< HEAD
  follower_id                   varchar(255),
  user_id                       varchar(255)
=======
  follower_id                   bigint,
  user_id                       bigint
>>>>>>> yash
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists follower;

drop table if exists user;

