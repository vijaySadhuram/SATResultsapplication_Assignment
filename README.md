
                                                           Output Screenshot
                                                               
                                                               
 ---------------                                                              
 1. Insert data
 ---------------
                                                               
![image](https://user-images.githubusercontent.com/98251620/235087256-7fd04f63-5f07-4bea-a207-9f55af1d874f.png)

![image](https://user-images.githubusercontent.com/98251620/235087319-252d0e11-d1cc-44e7-be35-a63f60145bce.png)

-----------------
2. View all data
----------------

![image](https://user-images.githubusercontent.com/98251620/235088774-e317db72-97d8-458c-8cb6-dd1a89638548.png)

--------------
3. Get rank
-------------
![image](https://user-images.githubusercontent.com/98251620/235089179-0017712c-432d-4d63-88a6-4b018463733e.png)
---------------
4. Update score
---------------

![image](https://user-images.githubusercontent.com/98251620/235089668-2dc443ae-b294-4f5a-8783-5d7fe0c8022f.png)
--------------------
5. Delete one record
-------------------

![image](https://user-images.githubusercontent.com/98251620/235090135-c85aaafa-c175-49b8-8b60-9fbb27c49ea1.png)











#Assignment_Output

Select an option:
1. Insert data
2. View all data
3. Get rank
4. Update score
5. Delete one record
6. Exit

1

Enter name:

vijay

Enter address (city country pincode):

hyderabad,india,501401

Enter SAT score:

120

Data inserted successfully!
Select an option:
1. Insert data
2. View all data
3. Get rank
4. Update score
5. Delete one record
6. Exit

1

Enter name:

suresh

Enter address (city country pincode):

hyderabad,india,501401

Enter SAT score:

200

Data inserted successfully!

Select an option:
1. Insert data
2. View all data
3. Get rank
4. Update score
5. Delete one record
6. Exit
1

Enter name:

lokesh

Enter address (city country pincode):

lucknow,india,102202

Enter SAT score:

600

Data inserted successfully!

Select an option:
1. Insert data
2. View all data
3. Get rank
4. Update score
5. Delete one record
6. Exit
2

--------------All SAT results----------------------

suresh: hyderabad,india,501401, SAT score: 200, Passed

lokesh: lucknow,india,102202, SAT score: 600, Passed

vijay: hyderabad,india,501401, SAT score: 120, Passed

Select an option:
1. Insert data
2. View all data
3. Get rank
4. Update score
5. Delete one record
6. Exit

3

Enter name:

vijay

Rank of vijay is 3

Select an option:
1. Insert data
2. View all data
3. Get rank
4. Update score
5. Delete one record
6. Exit

4

Enter name:
vijay
Enter new SAT score:
500

Score updated successfully!

Select an option:
1. Insert data
2. View all data
3. Get rank
4. Update score
5. Delete one record
6. Exit

5

Enter name:

lokesh

Record deleted successfully!

Select an option:
1. Insert data
2. View all data
3. Get rank
4. Update score
5. Delete one record
6. Exit
2
-------------All SAT results-------------------------

suresh: hyderabad,india,501401, SAT score: 200, Passed

vijay: hyderabad,india,501401, SAT score: 500, Passed

Select an option:
1. Insert data
2. View all data
3. Get rank
4. Update score
5. Delete one record
6. Exit

                                                              Problem Statement
                                                                     
                             
                             
Create an application with the following features:

- Must have menu to select option from 
	1. Insert data
	2. View all data
	3. Get rank
	4. Update score
	5. Delete one record
- Insert data - this needs to handle input data for the following Object and store in memory:
	SAT Results 
	- Name (Unique Identifier)
	- Address
	    - City
	    - Country
	    - Pincode
	- SAT score
	- Passed - this needs to be calculated in the backend as follows - if SAT score > 30% = Pass else Fail
- View all data - this should display all the data from the memory in Json format
- Get rank - this takes the name and returns their rank according to the data from the memory
- Update score - this allows to update SAT score for a candidate by name 
- Delete one record - this deletes a record by name
- (Optional) Make use of a database of your choice




