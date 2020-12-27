package project.server;

import com.caucho.hessian.server.HessianServlet;
import project.api.BasicAPI;


public class BasicService extends HessianServlet implements BasicAPI {

    @Override
    public String hello() {
        return "Hello!!!";
    }

    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }
}
