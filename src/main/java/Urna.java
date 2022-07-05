import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Urna implements Iterable<Eleitor>{

    private List<Eleitor> eleitores = new ArrayList<Eleitor>();

    public Urna(Eleitor... eleitores) {
        this.eleitores = Arrays.asList(eleitores);
    }

    @Override
    public Iterator<Eleitor> iterator() {
        return eleitores.iterator();
    }

}


