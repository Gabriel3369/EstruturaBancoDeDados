public class Principal{
    public static void main(String[] args) {
        ListaDupla<Produto> lista = new ListaDupla<Produto>("Produtos");

        Produto produto1 = new Produto("Notebook", 3200.00);
        Produto produto2 = new Produto("Mouse", 45.90);
        Produto produto3 = new Produto("Teclado", 120.50);

        lista.addInicio(produto1);
        lista.addFinal(produto2);
        lista.addMeio(produto3, 1);

        lista.imprimeLista();
        
        
        Produto removido = lista.removeMeio(1);
        System.out.println("Produto removido: " + removido);

        
        lista.imprimeLista();

        Produto produto4 = new Produto("Monitor", 899.00);
        Produto produto5 = new Produto("Webcam", 150.00);

        lista.addInicio(produto4);
        lista.addFinal(produto5);

        lista.imprimeLista();
        
    }
}
