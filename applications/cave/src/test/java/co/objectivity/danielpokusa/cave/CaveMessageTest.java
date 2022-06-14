package co.objectivity.danielpokusa.cave;

import org.junit.jupiter.api.Test;

class CaveMessageTest {


    @Test
    void shouldGenerateMessage() {

        var msg = new CaveMessage();


        msg.generateHackerMessage();
    }
}