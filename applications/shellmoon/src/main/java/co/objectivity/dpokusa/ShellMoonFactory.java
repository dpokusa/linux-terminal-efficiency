package co.objectivity.dpokusa;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

@ApplicationScoped
public class ShellMoonFactory {

    private static final Logger LOG = Logger.getLogger(ShellMoonFactory.class);

    @ConfigProperty(name = "moon.rising.hour")
    private int hour;

    @ConfigProperty(name = "moon.rising.minutes")
    private int minute;

    @ConfigProperty(name = "moon.rising.time")
    private int risingTimeInMinutes;

    private ShellMoonColor currentColor;
    private Instant lastTimeColorChanged;

    ShellMoon getCurrentShellMoon() {
        Instant now = Instant.now();
        Instant risingTime = now.atZone(ZoneId.systemDefault()).withHour(hour).withMinute(minute).withSecond(0).toInstant();
        Instant raisedTime = risingTime.plus(risingTimeInMinutes, ChronoUnit.MINUTES);

        LOG.infof("Current time is %s. Rising time is %s", now, risingTime);

        if (now.isAfter(raisedTime)) {
            return ShellMoon.of(ShellMoonStatus.RAISED, ShellMoonColor.RED);
        } else if (now.isAfter(risingTime)) {
            return ShellMoon.of(ShellMoonStatus.RISING, getShellMoonColor(now));
        }
        LOG.infof(
                "Shell moon is hidden. It will start rising in about %d minutes",
                ChronoUnit.MINUTES.between(now, risingTime)
        );
        return ShellMoon.of(ShellMoonStatus.HIDDEN, ShellMoonColor.SILVER);
    }

    private ShellMoonColor getShellMoonColor(Instant now) {
        if (currentColor == null) {
            currentColor = ShellMoonColor.getRandomExceptRed();
            lastTimeColorChanged = now;
            return currentColor;
        }

        if (lastTimeColorChanged.plusSeconds(30_000).isBefore(now)) {
            currentColor = ShellMoonColor.getRandomExceptRed();
            lastTimeColorChanged = now;
            return currentColor;
        }
        return currentColor;
    }


}
