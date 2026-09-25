public class PagamentoPix extends FormaDePagamento {


    @Override
    public void processarPagamento() {
        IO.println("Seu pix foi realizado com sucesso!"
                + "\no código da operação é: " +  getCodigo()
                + "\nData de pagamento: " + getDataCriacao());
    }
}
