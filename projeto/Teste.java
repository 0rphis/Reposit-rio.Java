public class Teste {
        public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("Adicionando 5 livros e 5 artigos aleatórios à biblioteca...");

        // Adiciona 5 livros e 5 artigos gerados aleatoriamente
        for (int i = 0; i < 2; i++) {
            biblioteca.addDocumento(GeradorAleatorio.gerarLivro());
            biblioteca.addDocumento(GeradorAleatorio.gerarArtigo());
        }

        System.out.println("\n--- Conteúdo da Biblioteca ---");
        biblioteca.listaDocumentos();
        System.out.println("----------------------------");
    }
}
