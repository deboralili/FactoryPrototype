package factory;

import model.ComandoEstado;
import model.IComando;

public class ComandoEstadoFactory implements IComandoFactory{
    @Override
    public IComando obterComando() {
        return new ComandoEstado();
    }
}
