package project.client;

import project.api.data.Movie;

import java.io.*;
import java.net.Socket;

public class ClientApplication {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8080);
        final OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(outputStream);

        Movie movie1 = new Movie();
        movie1.setName("sdfgsdfgdsfg");

        oos.writeObject(movie1);

        Movie movie2 = new Movie();
        movie2.setName("dfzgxh");

        oos.writeObject(movie2);

        InputStream inputStream = socket.getInputStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));

        String fromServer = in.readLine();

        System.out.println(fromServer);

        oos.close();
        in.close();
    }
}
