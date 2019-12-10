package domain;

public class Car {
	private final String name;
	private int position = 0;

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

	// 움직이거나 멈추는 메소드
	public void game() {
		// 전진하는 조건은 0에서 9사이에서 random 값을 구한 후 random 값이 4이상일 경우 전진하고
		// 3 이하의값이면멈춘다.
		double randomValue = Math.random();
		int conditionValue = (int)(randomValue * 10);
		if (conditionValue >= 4) {
			position++;
		}
	}

	// 이름의 적합을 판단하는 메소드

}
