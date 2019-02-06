package welv.com.provider;

import org.springframework.stereotype.Service;
import welv.com.provider.RefundRet;
import welv.com.provider.TestOneService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvyj on 2019/2/2.
 */
public class TestOneServiceMock implements TestOneService {
    @Override
    public String sayHello(String name) {
        System.out.println("1111111111111");
        return null;
    }

    @Override
    public List getUsers() {
        System.out.println("1111111111111");
        return null;
    }

    @Override
    public RefundRet getRef(String msg) {
        System.out.println("1111111111111");
        return null;
    }
}
