package aula 8.pricipal.processos;

public class CartaoCredito implements pagamento {
    private String numeroCartao;
    private String nomeTitular;

    public CartaoCredito(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    public CartaoCredito() {
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }




    @Override
    public void processarPagamento(double valor) {
        if (validarDados()) {
            System.out.println("Processando pagamento de R$" + valor + " com Cartão de Crédito.");
        } else {
            System.out.println("Dados do cartão inválidos. Pagamento não processado.");
        }
    }

    @Override
    public String obterTipo() {
        return "Cartão de Crédito";
    } else {
            return "cartao de debito";
        }
    }

    @Override
    public boolean validarDados() {
        if (getNumeroCartao() ! = null && !getNomeTitular() ! = null &&
        !getNumeroCartao().isEmpty() && !getNomeTitular().isEmpty()
        && getNumeroCartao().length() == 16) {
            return true;
        } else {
            return false;
        }
    } 


}
