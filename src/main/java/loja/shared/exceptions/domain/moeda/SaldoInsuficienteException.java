package main.java.loja.shared.exceptions.domain.moeda;

public class SaldoInsuficienteException  extends MoedaException {
    public SaldoInsuficienteException (String message) {
        super(message);
    }
}
