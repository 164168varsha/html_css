package corejava;



public class Armstrong1 {
public static void main(String[] args) {
	int number;
	for(number=100;number<=999;number++){
	int temp=number;

	int remainder = 0,sum=0;
	while(number > 0){
	   remainder= number%10;
	   number = number/10;
	   sum = sum +( remainder*remainder*remainder );
	 
	   
	}  if(temp == sum){
		System.out.println("armstrong number=" +sum);
	}
}
}
}
