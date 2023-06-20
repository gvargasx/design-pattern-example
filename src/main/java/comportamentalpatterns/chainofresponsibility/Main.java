package comportamentalpatterns.chainofresponsibility;

import comportamentalpatterns.chainofresponsibility.middlewares.CheckPermissionMiddleware;
import comportamentalpatterns.chainofresponsibility.middlewares.CheckUserMiddleware;
import comportamentalpatterns.chainofresponsibility.middlewares.Middleware;
import comportamentalpatterns.chainofresponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init() {
        server = new Server();
        server.registerUser("testre@teste", "tetevdvd");
        server.registerUser("testes@teste", "qweqda");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean done;

        do {
            System.out.println("Digite email");
            String email = reader.readLine();
            System.out.println("Digite a senha");
            String password = reader.readLine();
            done = server.logIn(email, password);
        } while (!done);
    }
}
