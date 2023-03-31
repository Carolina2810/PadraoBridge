package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaboTest {

    @Test
    void deveRetornarSalarioCaboComPreparatorio() {
        Escolaridade escolaridade = new Preparatorio();
        Cabo cabo = new Cabo(1000.0f);
        cabo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, cabo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCaboComPatente() {
        Escolaridade escolaridade = new Patente();
        Cabo cabo = new Cabo(1000.0f);
        cabo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, cabo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCaboComCapitao() {
        Escolaridade escolaridade = new Capitao();
        Cabo cabo = new Cabo(1000.0f);
        cabo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, cabo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCaboComTenente() {
        Escolaridade escolaridade = new Tenente();
        Cabo cabo = new Cabo(1000.0f);
        cabo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, cabo.calcularSalario(), 0.01f);
    }

}

