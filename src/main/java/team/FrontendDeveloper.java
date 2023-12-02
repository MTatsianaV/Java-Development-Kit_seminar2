package team;

public class FrontendDeveloper extends Developer implements Frontender {

    @Override
    public void developGUI() {
        System.out.println("Programming UI forms");
    }
}
