package imc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa p = new Pessoa();

    @Test
    void testIMCFemininoNormal() {
        p.setPeso(76);
        p.setAltura(1.76);
        assertEquals("Peso normal", p.classificarIMC());
    }

    @Test
    void testIMCMasculinoAbaixoDoPeso() {
        Pessoa p = new Pessoa(60, 1.80, "M");
        assertEquals("Abaixo do peso", p.classificarIMC());
    }
}
