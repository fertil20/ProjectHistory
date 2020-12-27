package project.client;
import project.api.MockServer;
import project.api.DataService;
import project.api.MainPage;

public class TestWorkingClient {
    public static void main(String[] args) {
    }
    public TestWorkingClient() {
        DataService service = (DataService) new MockServer();
        new MainPage(service);
    }
}