package co.objectivity.danielpokusa.cave;

public class EchoMessage {

    private String id;

    private String content;

    private String path;

    private String description;


    public EchoMessage(String id, String content, String path, String description) {
        this.id = id;
        this.content = content;
        this.path = path;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getPath() {
        return path;
    }

    public String getDescription() {
        return description;
    }
}
