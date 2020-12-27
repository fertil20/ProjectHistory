package project.api;

import project.api.data.User;

public interface DataService {
    void MainPage(final MainPage mainPage);

    void createUser(final User user);

    User getUser(final int id);

}
