import java.util.Random;

public class GeradorAleatorio {
    private static final String[] nomes = { "Ana", "Alice", "Maria", "Helena", "Laura", "Valentina", "Heloísa",
            "Maria Alice", "Maria Clara", "Maria Cecília", "José", "João",
            "Antônio", "Francisco", "Carlos", "Miguel", "Arthur", "Davi",
            "Bernardo", "Gabriel", "Heitor", "Pedro", "Lucas", "Mateus",
            "Enzo", "Sophia", "Felipe", "Samuel", "Bruno", "Rafael" };

    private static final String[] sobrenomes = { "Silva", "Santos", "Oliveira", "Souza", "Rodrigues", "Ferreira",
            "Pereira", "Almeida", "Costa", "Gomes", "Lima", "Martins",
            "Fernandes", "Alves", "Ribeiro", "Carvalho", "Barbosa", "Moreira",
            "Machado", "Pinto", "Dias", "Lopes", "Gonçalves", "Soares",
            "Cruz", "Mendes", "Ramos", "Castro", "Freire", "Fonseca" };

    private static final String[] titulos = { "O Pequeno Príncipe", "Cem Anos de Solidão", "1984",
            "A Culpa é das Estrelas", "O Apanhador no Campo de Centeio",
            "Dom Quixote de La Mancha", "O Senhor dos Anéis",
            "Harry Potter e a Pedra Filosofal", "O Diário de Anne Frank",
            "O Alquimista", "Grande Sertão: Veredas", "Vidas Secas",
            "Memórias Póstumas de Brás Cubas", "O Primo Basílio",
            "Capitães da Areia", "O Cortiço", "Quarto de Despejo",
            "O Guarani", "Iracema", "Macunaíma",
            "Auto da Barca do Inferno", "O Gato Preto",
            "O Estranho Caso de Dr. Jekyll e Mr. Hyde", "O Sol é Para Todos",
            "O Código Da Vinci", "A Metamorfose", "O Nome da Rosa",
            "A Cabana", "O Diário de um Banana", "Extraordinário" };

    private static final String[] revistas = { "Veja", "IstoÉ", "Época", "Superinteressante", "Piauí",
            "Quatro Rodas", "Galileu", "National Geographic",
            "Saúde! É Vital", "Você S/A", "Exame", "Revista Crescer",
            "Claudia", "Marie Claire", "Casa e Jardim",
            "Arquitetura e Construção", "Viagem e Turismo",
            "Mundo Estranho", "Mundo dos Super-Heróis", "Rolling Stone Brasil",
            "Time", "Vogue Brasil", "Capricho", "Caras", "GQ Brasil",
            "Runner's World", "Revista do Fim do Mundo",
            "Pesquisa FAPESP", "Revista Cult", "Recreio" };

    private static final Random random = new Random();

    public static Autor gerarAutor() {
        String nome = nomes[random.nextInt(nomes.length)];
        String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
        return new Autor(nome, sobrenome);
    }

    public static Livro gerarLivro() {
        String titulo = titulos[random.nextInt(titulos.length)];
        Autor autor = gerarAutor();
        int anoDePublicacao = 1900 + random.nextInt(124); // Ano entre 1900 e 2023
        String isbn = random.nextInt(999999) + "-" + random.nextInt(999999);
        return new Livro(titulo, autor, anoDePublicacao, isbn);
    }

    public static Artigo gerarArtigo() {
        String titulo = "Artigo sobre " + titulos[random.nextInt(titulos.length)];
        Autor autor = gerarAutor();
        int ano = 2000 + random.nextInt(25);
        String revista = revistas[random.nextInt(revistas.length)];
        return new Artigo(titulo, autor, ano, revista);
    }
}
