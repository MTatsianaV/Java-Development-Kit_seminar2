package team;


public class Main {
    public static void main(String[] args) {
        Developer[] team = { new BackendDeveloper(), new FrontendDeveloper(), new FullstackDeveloper() };

        Developer dev = new FrontendDeveloper();
        if (dev instanceof Frontender) {
            ((Frontender) dev).developGUI();
            }
    }
}