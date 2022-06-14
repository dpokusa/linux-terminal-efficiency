//usr/bin/env jshell --show-version "$0" "$@"; exit $?

import java.time.*;
import java.time.temporal.*;


// Devox Thursday Lunch in UTC
private static final String LUNCH_TIME = "2022-06-23T10:30:00.00Z"; 

private static final String ITS_LUNCH_MSG = "Lunch time! Hurry up!";
private static final String MINUTES_LEFT_MSG = "%d minutes left until lunch!";

long calculateMinutesTo(Instant expectedTime) {
	var now = Instant.now();
	return ChronoUnit.MINUTES.between(now, expectedTime);
}

var lunchTime = Instant.parse(LUNCH_TIME); 
var minutesToLunch = calculateMinutesTo(lunchTime);

var msg = minutesToLunch > 0 ? String.format(MINUTES_LEFT_MSG, minutesToLunch) : ITS_LUNCH_MSG;
System.out.println(msg);

/exit

