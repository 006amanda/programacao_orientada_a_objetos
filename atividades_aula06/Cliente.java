public class Cliente extends Endereco{
    protected String nome;

    public static void main(String[] args){
        Cliente cl1 = new Cliente();
        cl1.nome = "Ana Carolina";
        cl1.cidade = "Santa Maria - RS";

        System.out.println("CADASTRO DO CLIENTE: ");
        System.out.println("NOME: " + cl1.nome);
        System.out.println("CIDADE: " + cl1.cidade);
    }
}
