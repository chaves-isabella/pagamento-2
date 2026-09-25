import java.time.LocalDate;

public abstract class FormaDePagamento {

    private int codigo = 0;
    private LocalDate dataCriacao;

    public FormaDePagamento (){
        this.dataCriacao = dataCriacao.now(); //pega a data exata da operação
    }

    public int getCodigo() {
        codigo += 1;
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public abstract void processarPagamento();
}
