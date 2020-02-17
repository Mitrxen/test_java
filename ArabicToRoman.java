class ArabicToRoman{
	public static String toRoman(int arg){
		String answerStr = "";
		int valDec = arg / 10;
		int valRest = arg - valDec*10;
		
		switch(valDec){
			case 0: answerStr = ""; break;
			case 1: answerStr = "X"; break;
			case 2: answerStr = "XX"; break;
			case 3: answerStr = "XXX"; break;
			case 4: answerStr = "XL"; break;
			case 5: answerStr = "L"; break;
			case 6: answerStr = "LX"; break;
			case 7: answerStr = "LXX"; break;
			case 8: answerStr = "LXXX"; break;
			case 9: answerStr = "XC"; break;
			case 10: answerStr = "C"; break;
			default: throw new NullPointerException("Ошибка: Неверный аргумент 2");
		}


		
		switch(valRest){
			case 0: answerStr += ""; break;
			case 1: answerStr += "I"; break;
			case 2: answerStr += "II"; break;
			case 3: answerStr += "III"; break;
			case 4: answerStr += "IV"; break;
			case 5: answerStr += "V"; break;
			case 6: answerStr += "VI"; break;
			case 7: answerStr += "VII"; break;
			case 8: answerStr += "VIII"; break;
			case 9: answerStr += "IX"; break;
			default: throw new NullPointerException("Ошибка: Неверный аргумент 3");
		}

		return answerStr;

	}
}
