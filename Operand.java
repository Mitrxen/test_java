class Operand{
	public boolean romanNumber = false;
	public int valNum = 0;
	public void test(String val){

		try{
			valNum = Integer.parseInt(val);
			if (valNum < 1 || valNum > 10){
				System.out.println("Аргумент вне диапазона 1 - 10");
				throw new NullPointerException();
			}
			
		}catch(Exception e){
			switch(val.toUpperCase()){
				case "I": valNum = 1; break;
				case "II": valNum = 2; break;
				case "III": valNum = 3; break;
				case "IV": valNum = 4; break;
				case "V": valNum = 5; break;
				case "VI": valNum = 6; break;
				case "VII": valNum = 7; break;
				case "VIII": valNum = 8; break;
				case "IX": valNum = 9; break;
				case "X": valNum = 10; break;
				default: throw new NullPointerException("Ошибка: Неверный аргумент");
			}
			romanNumber = true;
		}
	}
}
