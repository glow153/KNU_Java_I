package endterm.exam02;

public class WordCount {
	private StringBuffer news;
	private int cntAndroid, cntIphone;

	public WordCount() {
		cntAndroid = 0;
		cntIphone = 0;
		news = new StringBuffer("���ä��Ｚ������ ������ ���, �ᱹ ����Ʈ�� �ο� [�췲�����=������ ����]\n"
				+ "���۵� ���� ���� ������ ��ü�� ���ο� ����� ���� �ý����� ������. �̱� ������ �߽����� ������ ���̡��� ���Ｚ ���̡� �� ����� ���� ������ �ΰ� 3�� ������ "
				+ "����ȭ�� ������ �����ȴ�. ������ ���� 28��(�����ð�) �̱� �������ý��ڿ��� ���� ���� ���� ������ ȸ�� ������ I/O 2015�� ���� ����� �ü�� �ȵ����"
				+ "���� �ֽ� ���� M�� �Բ� ���ο� ����� ���� ����� ���ȵ���̵� ���̡��� ��ǥ�ߴ�. NFC(near field communication, �ٰŸ����) ���� �ȵ���̵� "
				+ "�ü���� ž���� ��⸦ ��������� �� �����̳� �Ĵ� ���� ��ġ�� NFC �ܸ��⿡ ���ٴ�⸸ �ϸ� ������ �̷����� ����̴�. �ſ�ī�峪 ����ī��, ���� ī�� ��"
				+ "�� ������ �̸� ����� �ȵ���̵� ��⸦ ���� �� ���� �ܸ��⿡ ���ٴ�� �ڵ����� ������ �ȴ�. ���� ���� �� ���� ī�� ������ �Բ� ���۵��� ������ 1ȸ�� ���� ��"
				+ "�¸� �����ϴ� ������� �̷�����. ��⿡ ž��� �ٸ� �ۿ��� ������ �� ���� �ȵ���̵� ���̸� ����� �� �ִ�. ������ �ȵ���̵� ���̰� 70���� �̻��� �������� "
				+ "����� 1õ�� �̻��� �ۿ��� ������ ������ �����ߴ�. ������ �ȵ���̵� ���̴� �ϴ� ���� NFC ��İ� �����˽� ������ �����ϴ� ���� ���̿� �������� ������ ��"
				+ "�� ������ ����ȴ�. ����� ����� ���� �ý��� ������ �ᱹ �ºδ� ����Ʈ���� ����� ����̽� ���忡�� �������̳� ���� ��ġ �� ������ ����� �ܸ���� �ȵ���̵�"
				+ " ����� �������� ��簣�� ����� ���� ���� �������� ���� ���̶�� ����. ���� �̱� ���忡�� ��� �ñⰡ Ȯ������ ���� ���Ｚ ���̡��� ��쿡�� ������ iOS�� ��"
				+ "���� �ȵ���̵� �� �ü������ �����ϴ� ����� �ƴ϶� ��⿡ ������ ���� �ý����̴�. �����̳� ������ ä���� NFC��� �ܿ� ���׳�ƽ��������(MST)�� �����ϱ� "
				+ "������ ���뼺�� �־� ������ �����ް� �ִ�. ���� ���̿� �ȵ���̵� ���̸�����ϱ� ���ؼ��� ���� ���� NFC ���� �ܸ��Ⱑ ������ �ʿ�������, MST�� Ȱ���� ����"
				+ "�� ������ ��κ��� ���� ���� �ִ� ī�� ������� �����ϱ� �����̴�. �Ｚ ���� ���� �̸� ž���� ������S6�� S6���� �� �Ｚ������ ����Ʈ���� �̱� ������ �󸶳� ��"
				+ "���ϴ��Ŀ� ���� ����, ������ ����� ���� ������� �ºΰ� ���� ������ ����ȴ�.");
	}

	public void countAndroid() {
		String[] words = { "�ȵ���̵�", "�Ｚ", "����" };
		for (int i = 0; i < news.length(); i++) {
			for(int j=0;j<words.length;j++) {
				if(news.substring(i).startsWith(words[j]))
					cntAndroid += 1;	
			}
		}
	}
	
	public void countIphone() {
		String[] words = { "����", "������" };
		for (int i = 0; i < news.length(); i++) {
			for(int j=0;j<words.length;j++) {
				if(news.substring(i).startsWith(words[j]))
					cntIphone += 1;
			}
		}
	}
	
	public void compare() {
		countAndroid();
		countIphone();
		System.out.println("�ȵ���̵� ���� �ܾ� : " + cntAndroid);
		System.out.println("������ ���� �ܾ� : " + cntIphone);
		if(cntAndroid > cntIphone)
			System.out.print("�ȵ���̵�");
		else
			System.out.print("������");
		System.out.println(" ���� �ܾ �� �����ϴ�.");
	}
}