package project.client;

import com.caucho.hessian.client.HessianProxyFactory;
import project.api.BasicAPI;
import project.api.TestApi;

import java.net.MalformedURLException;

public class Client {

    public static void main(String[] args) throws MalformedURLException {

        final String url = "http://127.0.0.1:8080/";

        final HessianProxyFactory factory = new HessianProxyFactory();
        factory.setOverloadEnabled(true);

        final BasicAPI service = (BasicAPI) factory.create(BasicAPI.class, url);
        System.out.println(service.hello());
        System.out.println(service.plus(1, 2));
        System.out.println(service.minus(7, 3));

        final TestApi test = (TestApi) factory.create(TestApi.class, url + "test/");
        System.out.println(test.test(8));
        System.out.println(test.test("9999aaaa"));
        System.out.println(test.test(true));

    }


}