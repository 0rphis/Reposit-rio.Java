public class Livro extends Documento {
    private String isbn;


    public Livro(String titulo, Autor autor, int anoDePublicacao, String isbn) {
        super(titulo, autor, anoDePublicacao);
        this.isbn = isbn;
    }

    public String geStringtIsbn() { return isbn;}
    public void setIsbn(String isbn) { this.isbn = isbn; }


    @Override
    public String toString() {
        return super.toString() + ", ISBN: " + isbn;
    }
}
