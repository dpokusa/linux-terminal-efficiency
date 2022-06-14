package co.objectivity.danielpokusa.cave;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EchoMessages {

    private List<EchoMessage> echo;

    public EchoMessages() {
        echo = new ArrayList<>();
    }

    public EchoMessages add(EchoMessage m) {
        this.echo.add(m);
        return this;
    }

    public void shuffle() {
        Collections.shuffle(echo);
    }

    public List<EchoMessage> getEcho() {
        return echo;
    }
}
