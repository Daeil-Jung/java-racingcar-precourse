import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 자동차 이름들을 입력 받음
		Scanner scanner = new Scanner(System.in);
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

		String carNames = scanner.nextLine();
		System.out.println(carNames);
		// 자동차 이름을 기반으로 자동차 객체를 생성함
		// 게임 반복 횟수를 받음
		// 게임을 반복함
		// 자동차의 위치를 받아와 우승자를 비교
		// 우승자를 출력
	}
}
