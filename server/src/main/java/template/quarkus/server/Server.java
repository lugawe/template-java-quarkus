package template.quarkus.server;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Server {

    public Server() {}

    public static void main(String[] args) {
        Quarkus.run(args);
    }
}
