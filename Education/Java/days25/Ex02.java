package days25;

public class Ex02 {

	enum Direction { EAST, SOUTH, WEST, NORTH }

	public static void main(String[] args) {
		// Type mismatch: cannot convert from int to Ex02.Direction
		// Direction d1 = 1;

		Direction d1 = Direction.EAST;
		System.out.println( d1 );
		System.out.println( d1.name() );  	// "EAST"
		System.out.println( d1.ordinal() );	// 0	상수의 순서

		Direction d2 = Direction.valueOf( d1.name() );
		System.out.println( d2 );

		switch (d2) {
		case EAST:	//1		Direction 생략되고 상수만 적으면 된다.
			break;
		case NORTH:	//2
			break;
		case SOUTH:	//3
			break;
		case WEST:	//4
			break;
		}


	} //main

} //class