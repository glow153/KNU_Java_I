package endterm.exam02;

public class WordCount {
	private StringBuffer news;
	private int cntAndroid, cntIphone;

	public WordCount() {
		cntAndroid = 0;
		cntIphone = 0;
		news = new StringBuffer("애플ㆍ삼성ㆍ구글 ‘페이 전쟁’, 결국 스마트폰 싸움 [헤럴드경제=이형석 기자]\n"
				+ "구글도 기존 구글 월렛을 대체할 새로운 모바일 결제 시스템을 내놨다. 미국 시장을 중심으로 ‘애플 페이’와 ‘삼성 페이’ 등 모바일 결제 시장을 두고 3강 구도가 "
				+ "본격화될 것으로 전망된다. 구글은 지난 28일(현지시간) 미국 샌프란시스코에서 열린 구글 연례 개발자 회의 ‘구글 I/O 2015’ 에서 모바일 운영체제 안드로이"
				+ "드의 최신 버전 M과 함께 새로운 모바일 결제 방식인 ‘안드로이드 페이’를 발표했다. NFC(near field communication, 근거리통신) 지원 안드로이드 "
				+ "운영체제를 탑재한 기기를 잠금해제한 후 매장이나 식당 내에 설치된 NFC 단말기에 갖다대기만 하면 결제가 이뤄지는 방식이다. 신용카드나 현금카드, 선불 카드 등"
				+ "의 정보를 미리 등록한 안드로이드 기기를 점포 내 결제 단말기에 갖다대면 자동으로 결제가 된다. 물론 결제 시 실제 카드 정보는 함께 전송되지 않으며 1회용 가상 계"
				+ "좌를 생성하는 방식으로 이뤄진다. 기기에 탑재된 다른 앱에서 결제를 할 때도 안드로이드 페이를 사용할 수 있다. 구글은 안드로이드 페이가 70만개 이상의 오프라인 "
				+ "매장과 1천개 이상의 앱에서 지원될 것으로 예상했다. 구글의 안드로이드 페이는 일단 같은 NFC 방식과 비접촉식 결제를 지원하는 애플 페이와 직접적인 경쟁을 벌"
				+ "일 것으로 예상된다. 비슷한 방식의 결제 시스템 때문에 결국 승부는 스마트폰을 비롯한 디바이스 시장에서 아이폰이나 애플 워치 등 애플의 모바일 단말기와 안드로이드"
				+ " 기기의 점유율이 양사간의 모바일 결제 시장 점유율을 가를 것이라는 얘기다. 아직 미국 시장에서 출시 시기가 확정되지 않은 ‘삼성 페이’의 경우에는 애플의 iOS나 구"
				+ "글의 안드로이드 등 운영체제에서 지원하는 방식이 아니라 기기에 내장한 결제 시스템이다. 애플이나 구글이 채용한 NFC방식 외에 마그네틱보안전송(MST)를 지원하기 "
				+ "때문에 범용성에 있어 우위를 인정받고 있다. 애플 페이와 안드로이드 페이를사용하기 위해서는 매장 내에 NFC 결제 단말기가 별도로 필요하지만, MST를 활용한 결제"
				+ "는 전세계 대부분의 매장 내에 있는 카드 결제기로 가능하기 때문이다. 삼성 페이 역시 이를 탑재한 갤럭시S6와 S6엣지 등 삼성전자의 스마트폰이 미국 시장을 얼마나 점"
				+ "유하느냐에 따라 애플, 구글의 모바일 결제 시장과의 승부가 갈릴 것으로 예상된다.");
	}

	public void countAndroid() {
		String[] words = { "안드로이드", "삼성", "구글" };
		for (int i = 0; i < news.length(); i++) {
			for(int j=0;j<words.length;j++) {
				if(news.substring(i).startsWith(words[j]))
					cntAndroid += 1;	
			}
		}
	}
	
	public void countIphone() {
		String[] words = { "애플", "아이폰" };
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
		System.out.println("안드로이드 관련 단어 : " + cntAndroid);
		System.out.println("아이폰 관련 단어 : " + cntIphone);
		if(cntAndroid > cntIphone)
			System.out.print("안드로이드");
		else
			System.out.print("아이폰");
		System.out.println(" 관련 단어가 더 많습니다.");
	}
}
