public class Pessoa {

    private String nome;

    public Pessoa(String xpto) {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Pessoa m = new Pessoa ("XPTO");
        m.getMarca();
        m.setMarca("Jonivaldo");
    }

    private void setMarca(String jonivaldo) {
    }

    private void getMarca() {
    }
}
