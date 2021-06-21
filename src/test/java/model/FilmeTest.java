package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Filme filme = new Filme("Shrek", "2001/00", "2001", "Sinopse", "1h 30m", "EUA");

        Filme clonado = filme.clone();
        clonado.setNome("Shrek 2");
        clonado.setId("2004/002");
        clonado.setSinopse("Sinopse 2");
        clonado.setLancamento("2004");
        clonado.setDuracao("1h 33m");

        assertEquals("Filme{'Shrek', Ano de lançamento: '2001', Sinopse: 'Sinopse', Duração: '1h 30m', Nacionalidade: 'EUA'}", filme.infoFilme());
        assertEquals("Filme{'Shrek 2', Ano de lançamento: '2004', Sinopse: 'Sinopse 2', Duração: '1h 33m', Nacionalidade: 'EUA'}", clonado.infoFilme());
    }
}