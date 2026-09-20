public class Produto{
    private String nome;
    private double preco;

    public Produto(){
        this("", 0.0);
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    @Override
    public String toString(){
        return "Produto{ nome: " + getNome() + ", preco: R$ " + String.format("%.2f", getPreco()) + " }";
    }
}
