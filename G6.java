package pkg1;
class DivByZeroException extends Exception{
	public DivByZeroException(String message) {
		     super(message);
		
	}
	
}

public class G6 {

	public static void main(String[] args) {
		System.out.println("exception");
		int nr=10;
		int dr=0;
		int result;
		//System.out.println(result);
		try {
			//result=nr/dr;
			//System.out.println(result);

			if(dr==0) {
				throw new DivByZeroException("divied by zero not allowed");
				
			}
		}
		catch(DivByZeroException e1) {
			System.out.println("error:"+e1.getMessage());
			
		}
		catch(ArithmeticException e2) {
			System.out.println("error:"+e2.getMessage());
			
		}
		finally {
			System.out.println("finally block executed");
		}

	}

}
 