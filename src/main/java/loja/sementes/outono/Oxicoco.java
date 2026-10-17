package main.java.loja.sementes.outono;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Oxicoco extends Semente {

   public Oxicoco(){
       super(Estacao.OUTONO, new ValidarPrecoSemente(PrecoSemente.PRECO_OXICOCO));
   }

   @Override
    protected String getNome(){
       return "Oxicoco";
   }
}
