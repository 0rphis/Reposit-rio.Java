package aula 8.pricipal.processos;

public class Pix implements pagamento {
    private String pix;

    public pix(void){
    }

    puclic pix(String pix) {
        this.pix = pix;
    }
}
    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    @Override
    public void processarPagamento(double valor) {s
        if (validarDados()) {
            System.out.println("Processando pagamento via Pix no valor de: " + valor);
        } else {
            System.out.println("Dados do Pix inv-lidos. N-o foi poss-vel processar o pagamento.");
        }
    }

    @Override
    public String obterTipo() {
        return "Pix";
    }

    @Override
    public boolean validarDados() {
        if (getPix() != null && !getPix().isEmpty()) {
        // se o pix nao for nulo e nao estiver vazio, esta certo
            return true;
        }else {
            return false;
        }
    }