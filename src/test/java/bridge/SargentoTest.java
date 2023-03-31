package bridge;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SargentoTest {

    @Test
    void deveRetornarSalarioSargentoComPreparatorio() {
        Escolaridade escolaridade = new Preparatorio();
        Sargento sargento = new Sargento(2000.0f);
        sargento.setEscolaridade(escolaridade);
        assertEquals(2000.0f, sargento.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSargentoComPatente() {
        Escolaridade escolaridade = new Patente();
        Sargento sargento = new Sargento(2000.0f);
        sargento.setEscolaridade(escolaridade);
        assertEquals(2200.0f, sargento.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSargentoComCapitao() {
        Escolaridade escolaridade = new Capitao();
        Sargento sargento = new Sargento(2000.0f);
        sargento.setEscolaridade(escolaridade);
        assertEquals(2400.0f, sargento.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSargentoComTenente() {
        Escolaridade escolaridade = new Tenente();
        Sargento sargento = new Sargento(2000.0f);
        sargento.setEscolaridade(escolaridade);
        assertEquals(2600.0f, sargento.calcularSalario(), 0.01f);
    }
}
