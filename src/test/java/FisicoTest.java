import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FisicoTest {
    @Test
    void deveRetornarVelocidadeQuilometroHora() {
        Fisico estudante = new Fisico();
        estudante.setVelocidade(10.0F);

        assertEquals(36.0f, estudante.getVelocidade());
    }
    @Test
    void deveRetornarVelocidadeMetroSegundo() {
        Fisico estudante = new Fisico();
        estudante.setVelocidade(10.0F);

        assertEquals(10.0f, estudante.getVel());
    }



}