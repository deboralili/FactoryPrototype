package model;

import factory.ComandoEstadoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComandoEstadoTest {

    @Test
    void deveMarcarAssistido() {
        IComando comando = new ComandoEstadoFactory().obterComando();
        assertEquals("Filme assistido!", comando.assistido());
    }

    @Test
    void deveMarcarNaoAssistido() {
        IComando comando = new ComandoEstadoFactory().obterComando();
        assertEquals("Filme não assistido.", comando.naoAssistido());
    }
}