package com.aiims.antenatalcare.portal.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public final class DateUtil {

	private static final String DATE_FORMAT= "dd-MM-yyyy";

	private static final String TIME_FORMAT = "HH:mm";
	public static LocalDate stringToDate(String date) {

		return LocalDate.parse(date, DateTimeFormatter.ofPattern(DATE_FORMAT));
	}
	public static LocalTime stringToTime(String time) {
		return LocalTime.parse(time,  DateTimeFormatter.ofPattern(TIME_FORMAT));
	}

	public static String dateToString(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern(DATE_FORMAT));
	}

	public static String dateTimeToString(LocalDateTime dateTime) {
		return  dateTime.toString();

	}

}
