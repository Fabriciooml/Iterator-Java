import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApuracaoTest {

    @Test
    void deveContarVotosNulosUrna() {
        Urna urna = new Urna(
                new Eleitor("Dwight", 0),
                new Eleitor("Michael", 4),
                new Eleitor("Jim", 5),
                new Eleitor("Pam", 3),
                new Eleitor("Andy", 0)
        );
        assertEquals(2, Apuracao.contarVotosNulosUrna(urna));
    }

    @Test
    void deveContarTotalVotosUrna() {
        Urna urna = new Urna(
                new Eleitor("Dwight", 0),
                new Eleitor("Michael", 4),
                new Eleitor("Jim", 5),
                new Eleitor("Pam", 3),
                new Eleitor("Andy", 0)
        );
        assertEquals(5, Apuracao.contarTotalVotosUrna(urna));
    }

    @Test
    void deveContarVotosVencedorUrna() {
        Urna urna = new Urna(
                new Eleitor("Dwight", 1),
                new Eleitor("Michael", 1),
                new Eleitor("Jim", 4),
                new Eleitor("Pam", 3),
                new Eleitor("Andy", 2)
        );
        assertEquals("Candidato 1 com 2 votos", Apuracao.contarVotosVencedorUrna(urna));
    }

}