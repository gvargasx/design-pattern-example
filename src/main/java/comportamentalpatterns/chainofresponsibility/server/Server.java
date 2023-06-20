package comportamentalpatterns.chainofresponsibility.server;

import comportamentalpatterns.chainofresponsibility.middlewares.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Teste");
            System.out.println("Teste");
            return true;
        }
        return false;
    }

    public void registerUser(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }


    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }
}
