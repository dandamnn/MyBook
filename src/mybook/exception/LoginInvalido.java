package mybook.exception;

/**
 * Caso o email ou a senha do usuário esteja incorreta
 *
 */
public class LoginInvalido extends Exception {

    public LoginInvalido() {
        super("E-mail ou senha inválidos!");
    }
}
