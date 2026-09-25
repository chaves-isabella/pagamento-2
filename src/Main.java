void main() {

    PagamentoPix pix = new PagamentoPix();
    pix.processarPagamento();
    IO.println("\n-------Pagamento---------\n");
    pix.processarPagamento();
    IO.println("\n-------Pagamento---------\n");
    Boleto boleto = new Boleto();
    boleto.processarPagamento();
    IO.println("\n-------Pagamento---------\n");
    boleto.processarPagamento();

}
