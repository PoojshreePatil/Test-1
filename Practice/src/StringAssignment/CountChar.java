package StringAssignment;

public class CountChar {
	public static void main(String[] args) {
		String s = "hello world";   //helloword
		char[] ch = s.toCharArray();
		char s1 = ' ';

		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			if (ch[i] != 0) {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {

						ch[j] = 0;
						count++;
              
					}

				}

				System.out.println(ch[i] + " " + count);

			}
		}
		
		
	}

	}
