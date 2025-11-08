public class Ave implements Volador, Cantante{
    @Override
    public void volar() {
        System.out.println("Ave volar");
    }

    @Override
    public void cantar() {
        System.out.println("Ave cantar");
    }
}
