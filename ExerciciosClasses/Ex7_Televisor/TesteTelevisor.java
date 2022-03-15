package ExerciciosClasses.Ex7_Televisor;

public class TesteTelevisor {
    public static void main(String[] args) {

        Televisor televisor = new Televisor();
        System.out.println("Canal: " + televisor.getNumCanal());
        System.out.println("Volume: " + televisor.getVolume());

        televisor.mudarCanal(401);
        televisor.aumentarVolume(101);
        televisor.diminuirVolume(200);

        televisor.mudarCanal(26);
        televisor.aumentarVolume(10);
        televisor.diminuirVolume(17);
        System.out.println("Canal: " + televisor.getNumCanal());
        System.out.println("Volume: " + televisor.getVolume());
    }
}
