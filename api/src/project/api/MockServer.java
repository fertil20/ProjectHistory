package project.api;

import project.api.data.Movie;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*public class MockServer implements DataService {

    private static List<User> users = new ArrayList<>();

    public MockServer() {
    }

    public void createUser(final User user) {
        users.add(user);
    }

    public User getUser(final int id) {
        for (User user : users) {
            if (user.getId().getValue() == id) {
                return user;
            }
        }
        return null;
    }
}
*/
public class MockServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final int port = 8080;

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            System.out.println("Порт " + port + " занят");
            System.exit(-1);
        }

        Socket fromClient = null;
        while (true) {
            try {
                System.out.println("Ждем подключения от клиента");
                fromClient = serverSocket.accept();
                System.out.println("Клиент подключился");
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(-1);
            }

            final InputStream inputStream = fromClient.getInputStream();
            final OutputStream outputStream = fromClient.getOutputStream();

            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            final Movie movie1 = (Movie) objectInputStream.readObject();
            final Movie movie2 = (Movie) objectInputStream.readObject();

            PrintWriter printWriter = new PrintWriter(outputStream, true);
            final String name1 = movie1.getName();
            final String name2 = movie2.getName();

            if (name1 == null) {
                printWriter.println("Сервер остановлен");
            } else {

                printWriter.println("Ответ ::: " + (name1 + ' ' + name2 + '\n'));
            }
            printWriter.close();
            objectInputStream.close();
            if (name1 == null) {
                break;
            }
        }
        fromClient.close();
        serverSocket.close();
    }
}