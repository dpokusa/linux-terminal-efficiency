//usr/bin/env jshell --show-version "$0" "$@"; exit $?

import java.time.*;
import java.time.temporal.*;


// geecon break in UTC
private static final String COFFEE_TIME = "2023-04-20T08:50:00.00Z"; 

private static final String ITS_COFFEE_MSG = "Geecon coffee time! Hurry up!";
private static final String MINUTES_LEFT_MSG = "%d minutes left until coffee break!";

long calculateMinutesTo(Instant expectedTime) {
	var now = Instant.now();
	return ChronoUnit.MINUTES.between(now, expectedTime);
}

var breakTime = Instant.parse(COFFEE_TIME); 
var minutesToBreak = calculateMinutesTo(breakTime);

var msg = minutesToBreak > 0 ? String.format(MINUTES_LEFT_MSG, minutesToBreak) : ITS_COFFEE_MSG;
System.out.println(msg);

/exit

