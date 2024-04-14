
public class Switch {

	public static void main(String[] args) {

		int score = 0;
	
		score = (int)(Math.random()*100)+1;
		switch(score / 10) {
		case 10 :  //범위를 함께 쓰고 싶으면 break를 쓰지 않음으로써 가능
		case 9: System.out.println("점수: " +score + "학점: A학점");
		break;
		case 8: System.out.println("점수: " +score + "학점: B학점");
		break;
		case 7: System.out.println("점수: " +score + "학점: C학점");
		break;
		default: System.out.println("점수: "+score +"학점: F학점");
	
		//범위 내에서 랜덤 돌리기 최소 60점..
		score= (int)(Math.random()*(100-60+1))+60;
		//0.999X40하면 39... 나오기때문에 +1 (최소값을 뺀다음에 +1)
		
		}
		
		
	}

}
