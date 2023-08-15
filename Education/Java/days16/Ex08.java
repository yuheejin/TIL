package Education.Java.days16;

import java.io.IOException;
import java.nio.CharBuffer;

public class Ex08 {
	public static void main(String[] args) {
		
		
		
		
		
	} //main
} //class

// 자바		~~able 인터페이스
interface Movable {
	// 1. 상수
	// 2. 추상메서드
	// 3. default 메서드
	// 4. static 메서드
	
	void move(int x, int y);  // public abstract
} //interface Movable

interface Attackable {
	void attack(Unit unit);
} //interface Attackable

// 인터페이스끼리 상속이 가능하고, 다중상속도 가능하다.
interface Fightable extends Attackable, Movable{
} //interface Fightable


abstract class Unit {
	int currentHP;  // 현재 유닛의 체력
	int x;		// 현재 유닛의 위치(x좌표)
	int y;		// 현재 유닛의 위치(y좌표)
} //class Unit

// 하늘 유닛
class AirUnit extends Unit {
} //class AirUnit

// 땅 유닛
class GroundUnit extends Unit {
} //GroundUnit


// 군인
class Fighter implements Fightable{
	@Override
	public void attack(Unit unit) {
		// 총 등등
	}

	@Override
	public void move(int x, int y) {
		// 걷기
	}
} //class Fighter


// 수리가 가능한 유닛
// 상수 X, 추상메서드 X
interface Repairable { } //interface Repairable

class Tank extends GroundUnit implements Fightable, Repairable{
	@Override
	public void attack(Unit unit) {
		// 포 쏘는 공격
	}

	@Override
	public void move(int x, int y) {
		// 탱크가 움직이는 행동
	}

} //class Tank


// SCV
// 수리할 수 있는 객체
// 수리 가능 :  Repairable 인터페이스를 구현한 클래스   Tank, SCV
// 수리 불가능 : Repairable 인터페이스를 구현하지 않은 클래스
class SCV extends GroundUnit implements Repairable {
	SCV() {}
	
	// 건물 짖기 메서드
	
	// 다른 유닛 수리하는 메서드
	// 				매개변수 다형성
	void repair( Repairable unit ) {
		if ( unit instanceof Tank ) {
			// Tank 수리 코딩
		} else if ( unit instanceof SCV ) {
			// SCV 수리 코딩
		} else if ( unit instanceof DropShip ) {
			// DropShip 수리 코딩
		} //if//if
	}
} //class SCV


// 탱크, 군인, 무기 등등 실어서 나를 수송선
class DropShip extends AirUnit implements Fightable, Repairable{
	@Override
	public void attack(Unit unit) {
		
	}

	@Override
	public void move(int x, int y) {
		
	}
} //class DropShip




















