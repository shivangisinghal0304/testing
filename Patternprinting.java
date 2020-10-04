public class Pattern2 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			
			for(int j=4;j>=1;j++) {
				System.out.print("*");
			}
			
        for(int j=(i-1);j<=3;j++) {
				
				System.out.print(" ");
			}
			
			System.out.print("\n");
		}
		// TODO Auto-generated method stub

	}

}
