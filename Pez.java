public class Pez implements Nadador, Respirador{
    @Override
    public void nadar() {
        System.out.println("Pez nadar");
    }

    @Override
    public void respirar() {
        System.out.println("Pez respirar");
    }
}
