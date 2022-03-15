package ExerciciosClasses.Ex5_Pessoa;

public class TestePessoa {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Arthur");
        pessoa.setIdade(10);
        pessoa.setPeso(80);
        pessoa.setAltura(180);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Altura: " + pessoa.getAltura());

        pessoa.envelhecer(1);
        pessoa.engordar(10);

        System.out.println("Idade nova: " + pessoa.getIdade());
        System.out.println("Peso novo: " + pessoa.getPeso());
        System.out.println("Altura nova: " + pessoa.getAltura());

        pessoa.emagrecer(20);
        pessoa.crescer(10);

        System.out.println("Idade nova: " + pessoa.getIdade());
        System.out.println("Peso novo: " + pessoa.getPeso());
        System.out.println("Altura nova: " + pessoa.getAltura());

    }
}
