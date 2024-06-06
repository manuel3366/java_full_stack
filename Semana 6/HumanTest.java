public class HumanTest {
	public static void main(String[] args) {
		Human human = new Human();
		human.regulateTemperature();
        	human.startSleeping();
        	human.goToWork();

		boolean sleeping = human.isSleeping();
		if (sleeping) {
			 System.out.println("El humano esta durmiendo!");
		} else {
			 System.out.println("El humano esta despierto!");
		}
	}
}