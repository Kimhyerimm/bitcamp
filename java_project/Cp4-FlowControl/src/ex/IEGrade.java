package ex;

public class IEGrade {

	public static void main(String[] args) {
		
		int score = 99;
		
		String grade = ""; // a+ , a, a- , b+, b , b- , c
		
		// 100 ~ 98 :A+ , 97~64:A, 93~90:A-
		
		if(score >=90) {
			grade ="A";
			
			if(score>=98) {
			//	grade=grade +"+"
				grade += "+";
			}
			else if(score<94){ // 90이상
//				grade=grade+"-"
				grade += "-";
			}
		}
			else if(score>=80) { // 90>socre>=80
		grade = "B";
				if(score>=88) { 
					
					grade += "+";
				}
				else if(score<84) { // 80 <=score<84
					grade +="-";
				}
		
		}
			
			else {
				
				grade="C";
			}
		
		System.out.println(grade);
		
		
		
		
	/*	if(score>=98 && score<=100) {
			grade ="A+";
		}
		
		if(score>=94 && score<=97) {
			grade ="A+";
		}


		if(score>=93 && score<=90) {
			grade ="A+";
		}
 */
		
		
		
	}

}