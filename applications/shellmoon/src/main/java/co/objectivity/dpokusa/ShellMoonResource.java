package co.objectivity.dpokusa;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/status")
public class ShellMoonResource {

    private ShellMoonFactory factory;

    public ShellMoonResource(ShellMoonFactory factory) {
        this.factory = factory;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ShellMoon status() {
        return factory.getCurrentShellMoon();
    }
}
