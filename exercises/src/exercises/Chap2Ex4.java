package exercises;

public class Chap2Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int TotalPop=80000;
		int TotalMen,IllMen,LitMen;
				
		TotalMen= (52 * 80000)/100;
		LitMen=(35*TotalMen)/100;
		IllMen=TotalMen - LitMen;
				
		System.out.println("Number of Illiterate Men= " + IllMen);

	}

}
