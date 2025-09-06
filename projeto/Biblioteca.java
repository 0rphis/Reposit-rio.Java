import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Documento> documentos = new ArrayList<>();

    public void addDocumento(Documento doc) {
        documentos.add(doc);
    }


    public void listaDocumentos() {
        for (Documento d : documentos) {
            System.out.println(d);
        }
    }


    @Override
    public String toString () {
        return "Biblioteca com " + documentos.size() + " documentos.";
    }

}
