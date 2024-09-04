public class App {
    public static void main(String[] args) {
        MalaPractica userManager = new MalaPractica();

        userManager.registerUser("pepeBeraz", "ubu");
        userManager.registerUser("donTOÑO", "Noruega");

        userManager.aunthenticate("pepeBeraz", "ubu");
        userManager.aunthenticate("donTOÑO", "Noruega");

    }
}
