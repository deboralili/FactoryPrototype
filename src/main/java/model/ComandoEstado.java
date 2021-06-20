package model;

public class ComandoEstado implements IComando{
    public String assistido() {
        return "Filme assistido!";
    }

    public String naoAssistido() {
        return "Filme não assistido.";
    }
}
