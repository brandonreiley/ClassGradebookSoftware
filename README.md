# SDSU-CS496-S21-G1
This is the README file for the class gradebook software system for CS496 Group 1 (Erik Torres, Brandon Reiley, Bhavya Desai).

The software system's purpose is to provide a way for instructors to manage class assignments.

 This class is designed to hold and allow access to the assignment objects.
 
Assignment: This class is used to create assignments that are essentially stored in a gradebook object.

What is Gradebook Software?
Gradebook software automates grade tracking, performance assessment and monitoring of student attendance and provides easy access to synchronized data for teachers, principals and school administrators.

In this gradebook we will provide services to the user such as adding assignment, edit assignment, list assignment and remove assignment.

The assignName attribute holds the name of an assignment and is of data type String. The assignID attribute holds the attached Identification number of an assignment and is of datatype int. The assignPercentage attribute is used to hold the percentage an assignment has for the total grade and is of datatype double. The assignDescription attribute is used to hold a description of an assignment; it uses a String datatype

the code gives you 5 options 
option 1: it allows the user to add the assignmnet
option 2: iT allows the user to edit the assignmnet which is already stored in the gradebook
option 3: it allows the user to view the assignment after submitting it 
oprion 4: it allows the user to remove the assignment 
option 5: it allows the user to exit the gradebook

The user will get an option to enter the name of the assignmnet. Then it allows the user to enter a description of the assignment.
after entering the description of the assignment the user will wull get an option to assign an ID. WHen all the steps are done the gradebook allows to assign a percentage to the assignment

We will be saving the array list in future. 

-----------------------------------------------------------------------------
User Manual:

Directions:
User will be prompted with a selection menu to either add assignment, edit, view, or remove. 

Note: User input with incorrect variable type (String when prompted int) may crash the program. 

Add Assignment:
User will be prompted to input information on the assignment.
Assignment data will be added to an assignment object and into an arraylist (gradebook) of assignment objects.

Edit Assignment:
User will be able to edit assignment name, type, description, ID, or percentage.
Any changes will be updated and saved in the gradebook.

List Assignment:
User will have the option to view all assignments in the gradebook sorted alphabetically by name.

Remove Assignment:
User can remove any assignment from the gradebook by choosing the assignment ID. 

System Requirements:
Will run on any current mac or pc system

Running the application: 
There will be an included jar file that will be able to run when opened. 
