import java.io.*;

class Calc{
	public static String firstOp = "";
	public static String operation = "";
	public static String secondOp = "";
	public static String answerStr = "";
	public static int answerNum = 0;
	public static Operand firstOperand = new Operand();
	public static Operand secondOperand = new Operand();

	public static void dataInput(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(isr);
		String input = "";

		try{
			input = buffer.readLine();
			buffer.close();
		}catch(IOException e){
			System.out.println("Error input");
		}


		String[] arguments = input.split(" ");

		if(arguments.length != 3){
			throw new NullPointerException("Ошибка: неверное колличество аргументов");
		}

		firstOp = arguments[0];
		operation = arguments[1];
		secondOp = arguments[2];
		
	}

	public static void answerOutput(){
		if(firstOperand.romanNumber == secondOperand.romanNumber){
			Action y = new Action();
			answerNum = y.action(firstOperand.valNum, operation, secondOperand.valNum);

			if(firstOperand.romanNumber == true){
				ArabicToRoman x = new ArabicToRoman();
				System.out.println("\nOutput: \n" + x.toRoman(answerNum));
			}else{
				System.out.println("\nOutput: \n" + answerNum);
			}

		}else{
			throw new NullPointerException("Ошибка: несовместимые аргументы");
		}
	}
	

	public static void main(String[] args){
		System.out.println("\nInput: ");
		dataInput();
		firstOperand.test(firstOp);
		secondOperand.test(secondOp);
		answerOutput();

	}	
}
