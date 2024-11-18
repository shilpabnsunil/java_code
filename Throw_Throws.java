package exception_handling;

import java.util.InputMismatchException;

public class Throw_Throws {
	
		public static void main(String[] args) throws NullPointerException,InputMismatchException
		{
			if(11==1)
			{
			throw new NullPointerException("Sorry your cell is empty");
			}
			else
			{
				throw new InputMismatchException("Sorry check your input before entering");
			}
					
		}
		}
