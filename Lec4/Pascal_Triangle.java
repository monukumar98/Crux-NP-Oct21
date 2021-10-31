package Lec4;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int row=0;
		int nst =1;
		while(row<n) {
			
			
			int cst = 0;
			int val=1;
			while(cst<nst) {
				System.out.print(val+" ");
				val = ((row-cst)*val)/(cst+1);
				
				cst++;
			}
			System.out.println();
			row++;
			nst++;
			
			
		}
		
	

	}

}
