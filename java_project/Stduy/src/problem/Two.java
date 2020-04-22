package problem;

public class Two {

	
	String kid;
	int ball;
	
	Two(String kid, int ball){
		this.kid = kid;
		this.ball=ball;	
	}
	
	void win (int num) {
		ball = ball+num;
	}
	
	void lose (int num) {
		ball = ball-num;
	}
	
	void game(Two losekid,int ball) {
		win(ball);
		losekid.lose(ball);
	}
	
	
	
	
	
	
	
}
