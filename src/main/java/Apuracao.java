import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Apuracao {

    public static Integer contarVotosNulosUrna(Urna urna) {
        int quantidade = 0;
        for (Eleitor eleitor : urna) {
            if (eleitor.getVoto() == 0) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalVotosUrna(Urna urna) {
        int quantidade = 0;
        for (Iterator a = urna.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

    public static String contarVotosVencedorUrna(Urna urna) {
        Map<Integer,Integer> hashMapVotos = new HashMap<Integer,Integer>();
        int voto;
        for (Eleitor eleitor : urna) {
            voto = eleitor.getVoto();
            if (hashMapVotos.containsKey(voto)){
                hashMapVotos.put(voto, hashMapVotos.get(voto) + 1);
            }
            else {
                hashMapVotos.put(voto, 1);
            }
        }
        int vencedor = Collections.max(hashMapVotos.entrySet(), Map.Entry.comparingByValue()).getKey();

        return "Candidato " + vencedor + " com " + hashMapVotos.get(vencedor) + " votos";
    }

}
