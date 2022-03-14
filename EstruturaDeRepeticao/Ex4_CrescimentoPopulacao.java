package EstruturaDeRepeticao;

public class Ex4_CrescimentoPopulacao {
    public static void main(String[] args){
        double populacaoA = 80000;
        double populacaoB = 200000;
        int anosNecessarios = 0;

        boolean continuarLoop = true;

        while (continuarLoop){
            populacaoA += populacaoA * 0.03;
            populacaoB += populacaoB * 0.015;
            anosNecessarios += 1;

            if (populacaoA >= populacaoB){
                continuarLoop = false;
                System.out.println("Será necessário: " + anosNecessarios + " anos.");
            }
        }
    }
}
