
public class Artigo  extends Documento{
    private String  revista;

    public Artigo(String titulo, Autor autor, int anoDePublicacao, String revista) {
        super(titulo, autor, anoDePublicacao);
        this.revista = revista;
    }

    public String getRevista() { return revista; }
    public void setRevista(String revista) { this.revista = revista; }    

    @Override
    public String toString() {
        return super.toString() + ", Revista: " + revista;
    }
    
}
