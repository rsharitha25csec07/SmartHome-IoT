public class HomeHub {

    private String hubName;

    public HomeHub(String hubName) {
        this.hubName = hubName;
    }

    public void displayHub() {
        System.out.println("Home Hub: " + hubName);
    }

    public String getHubName() {
        return hubName;
    }
}
