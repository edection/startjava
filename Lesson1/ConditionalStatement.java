public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 21;
		if (age > 20) {
			System.out.println("������ 20 ���");
		} else {
			System.out.println("������ 20 ���");
		}

		boolean male = true;
		if (male = true) {
			System.out.println("�������");
		} else {
			System.out.println("�� �������� ����");
		}
		
		if (male != false) {
			System.out.println("�� �������� ����");
		} else {
			System.out.println("�������");
		}

		float height = 1.80f;
		if (height < 1.80) {
			System.out.println("���� 1 ����� 80 ��.");
		} else {
			System.out.println("�� 1 ����� 80 ��.");
		}

		char firstInitial = 'M';
		if (firstInitial == 'M') {
			System.out.println("M - ������ ����� � �����");
		} else if (firstInitial == 'I') {
			System.out.println("I - ������ ����� � �����");
		} else {
			System.out.println(" ����� ������ ����� � �����, ����� M � I");
		}
	}
}