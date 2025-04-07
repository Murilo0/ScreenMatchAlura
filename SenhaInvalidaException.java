public class SenhaInvalidaException extends RuntimeException {
    private String mensagem;
    public SenhaInvalidaException(String s) {
        this.mensagem = s;
    }
@Override
    public String getMessage() {
        return this.mensagem;
    }
}
