package main.java.loja.shared.exceptions.domain.estoque;

public class QuantidadeNegativaException extends IntegerException {
    public QuantidadeNegativaException(String message) {
        super(message);
    }
}
