package co.objectivity.danielpokusa.cave;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CaveMessage {

    private Logger logger = LoggerFactory.getLogger(CaveMessage.class);

    private Faker faker;

    public CaveMessage() {
        this.faker = new Faker();
    }

    @Scheduled(fixedRate = 3000)
    public void generateLotrMessage() {
        String pattern = "LOTR Event: %s goes to %s";
        String message = String.format(
                pattern,
                faker.lordOfTheRings().character(),
                faker.lordOfTheRings().location()
        );

        logger.info(message);
    }

    @Scheduled(fixedRate = 5000)
    public void generateBackToTheFutureQuote() {
        logger.info("BTTF Event: "+faker.backToTheFuture().quote());
    }


    @Scheduled(fixedRate = 2000)
    public void generateHackerMessage() {
        var msg =  "About to " + faker.hacker().verb() + " " +
                faker.hacker().adjective() + " " +
                faker.hacker().ingverb() +
                faker.hacker().noun() +
                " into the " +
                faker.hacker().noun();
        logger.info(msg);
    }


    @Scheduled(cron = "0 0/5 * * * ?")
    public void caveEcho() {

        var messages = new EchoMessages();

        for (int i=0; i< 100; i++) {
            var msg = new EchoMessage(
                    UUID.randomUUID().toString(),
                    faker.chuckNorris().fact(),
                    faker.file().fileName(),
                    faker.file().mimeType()
            );
            messages.add(msg);
        }

        messages.add(
                new EchoMessage(
                        "7d55e070-f5b6-42e2-a4af-35f3e0704975",
                        "G.E.C.K",
                        "/home/presentation/.secrets/vault13.sh",
                        "Garden of Eden Creation Kit"
                )
        );

        messages.shuffle();

        ObjectWriter ow = new ObjectMapper().writer();
        try {
            String json = ow.writeValueAsString(messages);
            logger.info(json);
        } catch (JsonProcessingException e) {
            logger.error("These are not droids that you are looking for!");
        }

        logger.info("Echo: /home/presentation/.secrets/garden-of-eden-creation-kit.sh");
        logger.info("Echo: hard-to-find-file.sh");
    }


}
