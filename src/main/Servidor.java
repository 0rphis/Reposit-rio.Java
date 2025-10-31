package main;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.List;
import com.google.gson.Gson;

public class Servidor {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/documentos", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                Biblioteca biblioteca = new Biblioteca();
                for (int i = 0; i < 5; i++) {
                    biblioteca.addDocumento(GeradorAleatorio.gerarLivro());
                    biblioteca.addDocumento(GeradorAleatorio.gerarArtigo());
                }

                List<Documento> docs = biblioteca.listarDocumentos();
                String json = new Gson().toJson(docs);

                exchange.getResponseHeaders().set("Content-Type", "application/json; charset=UTF-8");
                exchange.sendResponseHeaders(200, json.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(json.getBytes());
                os.close();
            }
        });

        System.out.println("Servidor rodando em http://localhost:8080/");
        server.start();
    }
}
