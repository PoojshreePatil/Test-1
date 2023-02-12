package AssignmentOfThisSuperAndConstructorChaning;

/*Constructor Chaining ASSIGNMENT
1.	Create a class Cycle with member variables: int accountNo, int noOfWheels.
2.	Create a default constructor with a SOP in it �I am default constructor�
3.	Create another constructor which takes 2 arguments, calls the default constructor
 using this() and has a SOP in it �I am another constructor�.
4.	In main method, create an object of type Cycle by using default constructor. Note the output.
5.	Create another object of type Cycle by using the parameterized constructor.
 Note the sequence of SOPs indicating that inner most ctor is called first.*/

public class Cycle {
	int aaccountNo, noOfEheels;

	Cycle() {
		System.out.println("i am default constructor");
	}
	
	Cycle(int a,int b){
		this();
		System.out.println("i am in another Constructor");
	}
}
