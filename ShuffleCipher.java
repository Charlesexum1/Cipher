public class ShuffleCipher implements MessageEncoder {
	
	public ShuffleCipher() {}
	public ShuffleCipher(int n) {
		timesToShuffle = n;
		}
	
	public int timesToShuffle = 1;	
	
	public String encode(String text) {
		String t = text;
		String shuff = "Everything in life is only temporary...";		
		while (timesToShuffle > 0) {			
			shuff = "";
			int half = 0;		
			if (t.length() % 2 == 0) {
				half = t.length() / 2;
				for (int x = 0; x < t.length() / 2; x++, half++) {
					shuff += t.charAt(x);
					shuff += t.charAt(half);
					}
				timesToShuffle--;	
				}
			else if (t.length() % 2 > 0) {
				half = t.length() / 2;
				for (int y = 0; y < t.length() / 2; y++, half++) {
					shuff += t.charAt(y);
					shuff += t.charAt(half + 1);
					}
				shuff += t.charAt(half);
				timesToShuffle--;	
				}
			t = shuff;			
			}			
		return shuff;
		}
		
			
	
	public static void main(String[] args) {
		ShuffleCipher demo = new ShuffleCipher(2);
		System.out.println(demo.encode("big and nice"));
		
		}
	}
