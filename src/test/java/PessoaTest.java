import org.example.Pessoa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa p = new Pessoa();

    @Test
    void testIMCFemininoNormal() {
        p.setPeso(76);
        p.setAltura(1.76f);
        p.setSexo("F");// Corrigido para float
        assertEquals("Peso normal", p.getIMC());
    }

    @Test
    void testIMCMasculinoAbaixoDoPeso() {
        Pessoa p = new Pessoa(60, 1.80f, "M"); // Corrigido para float
        assertEquals("Abaixo do peso", p.getIMC());
    }
}