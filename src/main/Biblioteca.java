package main;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Documento> documentos = new ArrayList<>();

    // Adiciona um documento na lista
    public void addDocumento(Documento d) {
        documentos.add(d);
    }

    // ✅ Método 1: imprime todos os documentos no console
    public void listaDocumentos() {
        for (Documento d : documentos) {
            System.out.println(d);
        }
    }

    // ✅ Método 2: retorna a lista de documentos (usado no Servidor.java)
    public List<Documento> listarDocumentos() {
        return documentos;
    }

    @Override
    public String toString() {
        return "Biblioteca com " + documentos.size() + " documentos.";
    }
}
