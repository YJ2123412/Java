package day6;


public class MultiArray2one {

	public static void main(String[] args) {
	
		
		int[][] arr = new int[5][5];
		
		
		System.out.println("--------과제1--------");
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j <i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			/*
			 * --------과제1--------
			  *
			  **
			  ***
			  **** */
		}
		System.out.println("--------과제2--------");
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr.length-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		
		
		
		System.out.println("--------3--------");
		for (int i = 1; i < arr.length; i++) {
			for(int j = arr.length; j >i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * -------3
		  ****
		  ***
		  **
		  *  */
		
		//안찍히는게 공백으로 되어야함/ 특정조건에 만족하면 별이 찍힐거야
		System.out.println("--------4--------");
		for(int i = 1; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int k = 1 ; k<i; k++) {
				System.out.print("*");
			}
			for(int k = 0 ; k<i; k++) {
				System.out.print("*");
			}
			for(int n = 4; n>i; n--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		/*
		 * --------4--------
		 
		
		    *
		   *** 
		  ***** 
		 ********/
		System.out.println("--------5--------");
		for(int i = 1; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int k = 0 ; k<2*i-1; k++) {
				System.out.print("*");
			}
			for(int n = 4; n>i; n--) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
