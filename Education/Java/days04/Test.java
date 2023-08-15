package Education.Java.days04;

public class Test {
  public static void main(String [] args) {

    int sum=0;

    for(int i =1; i <11; i++) {
      sum += i;		
/*
      if (i == 10) {
        System.out.printf("%d=",i);	
        break;
      } //if
*/
      System.out.printf("%d+",i);

    } //for

    System.out.printf("\b=%d\n",sum);

  } //main
} //class