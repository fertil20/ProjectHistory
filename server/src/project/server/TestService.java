package project.server;

import com.caucho.hessian.server.HessianServlet;
import project.api.TestApi;

public class TestService extends HessianServlet implements TestApi {
    @Override
    public int test(int a) {
        return a * a;
    }

    @Override
    public int test(String a) {
        return 111;
    }

    @Override
    public int test(boolean a) {
        return 222;
    }
}
