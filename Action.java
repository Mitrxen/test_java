class Action{
	public int action(int op1, String op, int op2){
		int answer = 0;
		switch(op){
			case "+": answer = op1 + op2; break;
			case "-": answer = op1 - op2; break;
			case "*": answer = op1 * op2; break;
			case "/": answer = op1 / op2; break;
			default: throw new NullPointerException("Ошибка: Неверный аргумент");
		}
		return answer;
	}
}
