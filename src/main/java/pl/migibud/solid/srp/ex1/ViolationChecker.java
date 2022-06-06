package pl.migibud.solid.srp.ex1;

public class ViolationChecker {

	public static boolean isValid(Pair pair){

		String firstNumber = pair.getFirstValue();
		String secondNumber = pair.getSecondValue();
		try	{
			Integer.parseInt(firstNumber);
		}catch (NumberFormatException nfe){
			return false;
		}
		try	{
			Integer.parseInt(secondNumber);
		}catch (NumberFormatException nfe){
			return false;
		}
		return true;
	}

}
