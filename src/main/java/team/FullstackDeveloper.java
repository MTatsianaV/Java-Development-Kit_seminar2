package team;

public class FullstackDeveloper extends Developer implements Backender, Frontender {
    @Override
    public void developServer() { System.out.println("Server done"); }
    @Override
    public void developGUI() { System.out.println("GUI done"); }


}
