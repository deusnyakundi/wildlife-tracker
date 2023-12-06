# Wildlife Tracker
A wildlife tracking web application

This application is designed to assist rangers to track, collect and update info about wild animals

By **Nyakundi Deus.**

## Description

The website allows Rangers to track wildlife sightings in the area. A wildlife entity is either an Animal or an endagered animal.
When  world life is spotted, the ranger submits a form to create a sighting. The ranger can choose from a drop down, which kind of species they have seen.
A user can view rangers and clicking on them view all sightings they have done


## Technologies Used

- Java Spark 
- PostgreSQL
- SQL
- JUnit-Unit Testing
- Git and Github- Version control

## Contact Information

- 📧 Email -nyakundideus1@gmail.com


## Set up instructions
- Clone the project from https://github.com/deusnyakundi/wildlife-tracker.git
- Set Up database and tables in your local machine Postgresql

1.   ```CREATE DATABASE wildlife_tracker;```
2. ```CREATE TABLE sightings(id serial PRIMARY KEY,wild_life_id int,zone varchar, ranger_name varchar,time timestamp);```
3. ```CREATE TABLE animals(id serial PRIMARY KEY,name varchar,type varchar, age varchar,health varchar);```

- Run `gradle build` to build the project and install the dependencies. The build artifacts will be stored in the `build/` directory.
- Hit the `run` button to continue in App.java .
- Navigate to `http://localhost:4567/` in your browser.
- Enjoy


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