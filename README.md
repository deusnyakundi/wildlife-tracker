# Wildlife Tracker
A wildlife tracking web application

This application is designed to assist rangers to track, collect and update info about wild animals

By **Nyakundi Deus.**

## Description

The website allows Rangers to track wildlife sightings in the area. A ranger may then log the sighting into the system as is either an Animal or an endangered animal.
The app allows the ranger to specificy the location of the sighting and the health condition of the endangered animal. These options are available from drop down menus.
A user is able to view all sightings made by rangers by clicking on them.


## Technologies Used

- Java Spark 
- PostgreSQL for DB
- JUnit for Unit Testing
- Git and Github for Version control

## Contact Information

- 📧 Email -nyakundideus1@gmail.com


## Set up instructions
- Clone the project from https://github.com/deusnyakundi/wildlife-tracker.git
- Set Up database and tables in your local machine Postgresql via SQLShell as described below

1.   Use the following command to create a database```CREATE DATABASE wildlife_tracker;```
2.  Connect to the database using the following command ```\c wildlife_tracker;```
2. Use the following command to create tables```CREATE TABLE sightings(id serial PRIMARY KEY,wild_life_id int,zone varchar, ranger_name varchar,time timestamp);```
3. ```CREATE TABLE animals(id serial PRIMARY KEY,name varchar,type varchar, age varchar,health varchar);```

- Run `gradle build` to build the project and install the dependencies. The build artifacts will be stored in the `build/` directory.
- Hit the `run` button to continue in App.java .
- From your favourite browser, Navigate to `http://localhost:4567/`
- Enjoy

## To note during setup
- Take note of the port your postgres runs on and adjust the port number accordingly
- ensure you update the DB credentials to suit the credentials you used for postgres

### License

MIT License

Copyright (c) 2023

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

-Nyakundi Deus