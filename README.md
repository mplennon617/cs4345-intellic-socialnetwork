# SMU CS4345 IntelliC - Team 3 Project

Author: Kirk Watson, Yash Sinha, Frederick Wang, Michael Lennon

## Overview

This is a solution for one of the functionalities of the Scientist Social Network for CS 4345 - Software Engineering Principles at SMU. This project is build upon the **Play Framework**, along with Ebean, JDBC, Scala, and Java.

This project contains the following functionality:

- User Registration.
- User Login.
- The ability to follow and unfollow other registered users.
- The ability to view you followers, and users that you have followed.

Usage instructions are shared in [Usage](#usage)

### NOTE: AVOID PERSONAL PASSWORDS

### NOTE: AVOID PERSONAL PASSWORDS

### NOTE: AVOID PERSONAL PASSWORDS

Currently, there is no password security implemented for this project. So its important that the password you use to register is not personal.

## Running Environment and Prerequisites

**JDK Version: 1.8**

**IDE: IntelliJ IDEA 2021.3.3**

**Database Version: MySQL 8.0.28-0ubuntu0.20.04.3**

**frontend port number: 9000.**

**backend port number: 3306. Deployed on port 9005, and connected to backend via JDBC.**

This project is not compatible with JDK versions after 1.8. This version is necessary for SBT, Scala, and other Play Framework dependencies to function correctly. You may install any version of JDK 8 [here.](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)

### Running the project - Quickstart

1. Clone the repository using `git clone https://github.com/mplennon617/cs4345-intellic-socialnetwork`
2. Using IntelliJ, Navigate to **[...]/Frontend**, find **build.sbt** and open a new project folder.
3. Using IntelliJ, Navigate to **[...]/ebean-backend**, find **build.sbt** and open a new project folder.
4. ***Frontend:*** Navigate to Build options (next to the hammer) >> Edit Configurations >> Make sure the URL to open is `localhost:9000`.
5. ***Backend:*** Navigate to Build options (next to the hammer) >> Edit Configurations >> Make sure the URL to open is `localhost:9005`.
6. Adjust database connectivity settings based on instructions in the [Database](#database) section.
7. Build and run both the frontend and backend projects separately using the hammer and play buttons in IntelliJ
8. Open http://localhost.9000 in the browser
9. You are done!

The plan in the future is to deploy both the frontend and backend separately using Heroku. Until then, these steps are required to run the project.

## Dependencies

We did not use any **external dependencies** or **packages** for this project other than what was already included for usage in this class.

## <a id="database"></a> Database

The name of the database for this project is **ebeantest**.

If you wish to set your own **port number**, **username** and **password**, you can make adjustments on line 14, 15 and 16 in `\cs4345-intellic-socialnetwork\ebean-backend\conf\application.conf`

## <a id="usage"></a> Usage

A user is able to login to their account using their **username**, **uuid**, and **password**. After logging in. The user is able to view their followers or other users that they are able to follow.

When a user is viewing their followers, they are able to see the user's brief metadata. In addition, the user is able to remove a user from their follower list. The "Get Followers" button is able to fetch the current user's followers from the backend, but it currently has no UI functionality at this time.

To be implemented: From the View tab, the user can view a list of followers that are following them. In addition, the user can switch to a list of users that they are following, and choose to **Unfollow** them. From the "Find" tab, the user can view users that have not been followed yet and follow them via the **Follow** button.
