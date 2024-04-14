import java.util.Arrays;

public class MaBangJin2 {

	public static void main(String[] args) {
		
		
		int[][] mabangjin = new int[5][5];
		
		int row = 0; //행
		int col = 2; //열
		
		mabangjin[row][col] = 1;
		
		for(int i = 2; i <= 25; i++) {
			row--;
			col++;
			
			
			//1. row가 벗어난다면
			if(row < 0 && col< 5) {
				row = 4;
			}
			
			//2. col이 벗어난다면
			if(row >= 0 && col>4) {
				col = 0; //해당 행의 마지막 행
		
			}
			//3. 둘 다 벗어남
			
			if(row < 0 && col >4) {
				row+=2;
				col--;
			}
				
			//4. 이동위치에 이미 값이 있는 경우
			if(mabangjin[row][col] !=0) {
					row+=2;
					col--;
			}
			
			mabangjin[row][col] = i;
		}
	
		for(int i =0; i< mabangjin.length ;  i++) {
			System.out.println(Arrays.toString(mabangjin[i]));
		}
	}
}
