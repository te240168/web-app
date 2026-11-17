package uranai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Uranai {
	private String[] luckArray = {"超スッキリ", "スッキリ", "最悪"};
	int index = (int)(Math.random() * 3);
	String luck = luckArray[index];

	private LocalDate date = LocalDate.now();
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM月dd日");
	private String today = date.format(formatter);
	public String getToday() {
		return today;
	}
	public String getLuck() {
		return luck;
	}
}
