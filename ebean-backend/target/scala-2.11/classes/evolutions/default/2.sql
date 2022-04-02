# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

INSERT INTO user (id,username,password)
VALUES
(1,'yash','yash'),
(2,'michael','michael'),
(3,'frederick','frederick'),
(4,'ayala','ayala'),
(5,'fontenot','fontenot'),
(6,'christian','christian'),
(7,'mark','mark'),
(8,'jia','jia'),
(9,'zhang','zhang');

INSERT INTO follower (`followerID`, `userID`)
VALUES
    (2,1),
    (3,1),
    (4,1),
    (5,1),
    (6,1),
    (7,1),
    (8,1),
    (9,2);


# --- !Downs
