package studio7;

public class Die {

	private int n;
	
	public Die() {
        n = 0;
     }
	
	public Die(int n) {
        this.n = n;
     }
	
	public int rollDie(){
		
		int random = (int)( Math.random() * n + 1);
		return random;
	}
	
	public static void main (String[] args) {
		Die d1 = new Die(6);
		Die d2 = new Die(12);
		
		System.out.println(d1.rollDie());
		d2.rollDie();
		
	}
}
