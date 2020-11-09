public class Unicode {
	public static void main(String[] args) {
		char unicode = 33;
		int startNum = 33; // начало диапазона
		int finishNum = 126; // конец диапазона

		System.out.println(startNum + " = " + unicode);
		do {
			unicode++;
			startNum++;
			System.out.println(startNum + " = " + unicode);
		} while(unicode <finishNum);
	}
}