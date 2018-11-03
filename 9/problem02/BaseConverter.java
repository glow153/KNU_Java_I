package practice_9th_week.problem02;

public class BaseConverter {
	public static String convert(int base10) {
		String result = "";
		while (base10 > 0) {
			result = base10 % 2 + result;
			base10 /= 2;
		}
		return result;
	}
	public static int convert(String base2) {
		int result = 0;
		int len = base2.length();
		for (int i = 0; i < len; i++) {
            if (base2.charAt(i) == '1')
                result |= (1 << len-i-1);
        }
		return result;
	}
}
