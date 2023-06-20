package comportamentalpatterns.chainofresponsibility.middlewares;

public class CheckPermissionMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("teste@teste")) {
            System.out.println("teste");
            return true;
        }
        System.out.println("Bem vindo!");
        return checkNext(email, password);

    }
}
