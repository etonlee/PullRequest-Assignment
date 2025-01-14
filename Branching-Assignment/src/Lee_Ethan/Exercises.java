/**
 * @author Ethan Lee 
 * 
 * Assignment Instructions:
 * 	- Right click on the src folder and create a new package.
 * 	- Name the package "lastName_firstName", replacing lastName with your last name and firstName with your first name.
 * 	- Inside that package, create a new class "Exercises".
 *    - YOU SHOULD ONLY BE MAKING CHANGES IN THIS PACKAGE
 * 	- Create a javadoc comment at the top with the '@author' tag with your name next to it (do this for all classes you create)
 * 	- Create the following static methods:
 * 		- int threeAndFive() : Returns the sum of all the multiples of 3 or 5 below 1000
 * 		- int evenFibSum() : Returns the sum of the even-valued terms less than 4 million in the Fibonacci Sequence
 * 		- int largestPrimeFactor() : Returns the largest prime factor of the number 600851475143
 * 	- Create a separate Driver class and test your program by outputting the answers to your static methods
 *
 * Submission Instructions:
 *  - Save your saved work on Eclipse - your workspace should be the file location of the cloned repo
 *  - In GitHub Desktop, add your summary and commit your changes
 *  - Then push your commits to GitHub
 *  - Go to your repo on GitHub.com
 *  - Click "New pull request"
 *  - Click "Create pull request"
 *  - In the summary for your request, put your first and last name
 *  - Send the request
 * 
 * 
 */

package Lee_Ethan;

public class Exercises 
{
	public static int threeAndFive()
	{
		int number = 0, sum = 0;
		while (number < 1000)
		{
			if (number % 3 == 0 || number % 5 == 0)
			{
				sum+=number;
			}
			number++;
		}
		return sum;
	}

	public static int evenFibSum()
	{
		int first = 1, second = 1, sum = 0;
		while(first < 4000000)
		{
			if(first % 2 == 0)
			{
				sum += first;
			}
			if(second % 2 == 0)
			{
				sum += second;
			}
			first = first + second;
			second = first + second;

		}
		return sum;
	}
	
	public static int largestPrimeFactor()
	{
		long biggest = 600851475143L;
		long factor = 2;
		while(biggest > factor)
		{
			if(biggest % factor == 0)
			{
				biggest = biggest/factor;
				factor = 2;
			}
			else
				factor++;
		}
		return (int)biggest;
	}
} 
