package team;

public class BackendDeveloper extends Developer implements Backender{
    @Override
    public void developServer() {
        System.out.println("Writing server-side code");
    }
}
