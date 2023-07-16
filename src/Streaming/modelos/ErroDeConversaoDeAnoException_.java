package Streaming.modelos;

public class ErroDeConversaoDeAnoException_ extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeAnoException_(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
