//usr/bin/env jshell --show-version "$0" "$@"; exit $?

import java.time.*;
import java.time.temporal.*;


// Devox Thursday Lunch in UTC
private static final String COFFEE_TIME = "2022-10-05T14:00:00.00Z"; 

private static final String ITS_COFFEE_MSG = "JDD coffee time! Hurry up!";
private static final String MINUTES_LEFT_MSG = "%d minutes left until coffee break!";

long calculateMinutesTo(Instant expectedTime) {
	var now = Instant.now();
	return ChronoUnit.MINUTES.between(now, expectedTime);
}

var lunchTime = Instant.parse(COFFEE_TIME); 
var minutesToLunch = calculateMinutesTo(lunchTime);

var msg = minutesToLunch > 0 ? String.format(MINUTES_LEFT_MSG, minutesToLunch) : ITS_COFFEE_MSG;
System.out.println(msg);

/exit

