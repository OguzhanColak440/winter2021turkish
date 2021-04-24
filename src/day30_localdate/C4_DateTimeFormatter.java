package day30_localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C4_DateTimeFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/d");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("y*M*d");
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("y-MMMM-d");
		
		LocalDate tarih=LocalDate.now();
		
		System.out.println(dtf.format(tarih));
		System.out.println(dtf2.format(tarih));
		System.out.println(dtf3.format(tarih));
		System.out.println(dtf4.format(tarih));

	}

}
