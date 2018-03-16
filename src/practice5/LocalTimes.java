package practice5;

import java.time.*;

public class LocalTimes {
	public static void main(String[] args) {
		LocalTime rightNow = LocalTime.now();
		LocalTime bedtime = LocalTime.of(22, 30);
		System.out.println("bedtime: " + bedtime);
		bedtime = LocalTime.of(22, 30, 0);

		System.out.println("rightNow: " + rightNow);
		System.out.println("bedtime: " + bedtime);

		LocalTime wakeup = bedtime.plusHours(8); // wakeup is 6:30
		System.out.println("wakeup: " + wakeup);
		System.out.println("wakeup hour: " + wakeup.getHour());
		System.out.println("wakeup is before bedtime: " + wakeup.isBefore(bedtime));
	}
}
