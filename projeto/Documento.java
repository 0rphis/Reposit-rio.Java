public class Documento {
    private String titulo;
    private Autor autor;
    private int anoDePublicacao;

    public Documento(String titulo, Autor autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }    
    

    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }

    public int getAnoDePublicacao() { return anoDePublicacao; }
    public void setAnoDePublicacao(int anoDePublicacao) { this.anoDePublicacao = anoDePublicacao; }


    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoDePublicacao;
    }
}
