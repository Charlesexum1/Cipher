public class SubstitutionCipher implements MessageEncoder {
	
	private int s;
	
	public SubstitutionCipher(int shift) {
		s = shift;
		}
	
	public String encode(String text) {
		text += ' ';
		char[] temp = text.toCharArray();
		String encoded = "";
		for (int x = 0; x < temp.length; x++) {
			if (temp[x] == ' ') {
				text += ' ';
				}
			else {
				char letter = temp[x];
				int val = (int)letter;
				val += s;
				letter = (char)val;
				text += letter;
				}	
			}				
		return text;
		}		
	
	public static void main(String[] args) {
		SubstitutionCipher demo = new SubstitutionCipher(2);		
		System.out.println(demo.encode("Hello world"));
		}
	}
