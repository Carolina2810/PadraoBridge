package bridge;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.basic.BasicGraphicsUtils;

import static org.junit.jupiter.api.Assertions.*;

public class SoldadoTest {

    @Test
    void deveRetornarSalarioSoldadoComPreparatorio() {
        Escolaridade escolaridade = new Preparatorio();
        Soldado soldado = new Soldado(50.0f);
        soldado.setEscolaridade(escolaridade);
        soldado.setNumAtribuicoes(2);
        assertEquals(100.0f, soldado.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSoldadoComPatente() {
        Escolaridade escolaridade = new Patente();
        Soldado soldado = new Soldado(50.0f);
        soldado.setEscolaridade(escolaridade);
        soldado.setNumAtribuicoes(2);
        assertEquals(110.0f, soldado.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSoldadoComCapitao() {
        Escolaridade escolaridade = new Capitao();
        Soldado soldado = new Soldado(50.0f);
        soldado.setEscolaridade(escolaridade);
        soldado.setNumAtribuicoes(2);
        assertEquals(120.0f, soldado.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSoldadoComTenente() {
        Escolaridade escolaridade = new Tenente();
        Soldado soldado = new Soldado(50.0f);
        soldado.setEscolaridade(escolaridade);
        soldado.setNumAtribuicoes(2);
        assertEquals(130.0f, soldado.calcularSalario(), 0.01f);
    }
}
