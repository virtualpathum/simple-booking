# Simple Booking

This is an automated meeting room booking application. Provides room availability check, booking, cancellation, room and user maintenance options. 

Developed using Spring, Java 8


### Prerequisites

Java 8, Spring Tool Suite or Eclipse, Apache Maven, PostgreSQL 9, PgAdmin


### Installing

```
Clone the given repository to your workspace
Three modules are availabe
* booking-domain
* booking-core
* booking-web

Open Eclipse or STS and right click on each project and select configure
Select convert to maven project
You can see the converted maven projects in the Project explorer section
Install the PostgreSQL if you don't have install it already and create a database as meeting-room
Please update the database credentials in the SysConfig file before build the booking-core project
```

booking-web module contains the controller APIs which should use by the front end application


## Running the tests

```
There are few unit test cases have provided to test the system configurations and the apis
You can access them in src/test/java package in the booking-web project
To test
* 1. First clean and build the booking-domain project
* 2. Then clean and build the booking-core project
* 3. Finally clean and build the booking-web project and which will execute the test cases as well 
```

Given test cases are provided to test the entire flow of the application apis. 

```
BookingControllerTest
MeetingRoomControllerTest
```

Once you execute the test cases it will save the sample data into the data base and retrieve the data from some APIs


## Assumptions made when developing

* 1. No meeting room supervisor
* 2. Not all rooms are available for all users. Only super user can view all rooms. Normal user cannot book some rooms
* 3. Super user can override bookings
* 4. When super user overrides, system will send notifications to the effected users who already booked the room
* 5. Normal users cannot override the bookings
* 6. Normal users can extend the booking time if the next time slot is availabe
* 7. Once user cancel a booking system will send notifications to the user who booked the adjecent time slot
* 8. All users can report issues in the meeting room
* 9. System administrator can view the reported issues

## Features implemented in this release

* 1. Check available rooms by entering the date and time and get the available rooms
* 2. Book the selected room
* 3. Cancel Booking if needed
* 4. Can update the booking date and time
* 5. Can view the bookings per user
* 6. Can view the bookings per room


## Features not implemented in this release

* 1. Report room problem
* 2. Override bookings by super user
* 3. View reported issues
* 4. System notifications
* 5. Access control and role maintenance


## Planned Enhancements
* 1. Implement spring security ACL to grant the permissions to each room instance per user to handle the room booking based on user   
     roles
* 2. Use spring security to handle the user authentication and authorization

