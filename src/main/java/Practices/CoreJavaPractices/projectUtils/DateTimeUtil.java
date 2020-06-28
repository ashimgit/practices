package Practices.CoreJavaPractices.projectUtils;

import java.time.Instant;

public class DateTimeUtil {
	public static Long getCurrentTimeInEpochSec() {
		return Instant.now().getEpochSecond();
	}

	public static Long getCurrentTimeInEpochMiliSec() {
		return Instant.now().toEpochMilli();
	}

}
