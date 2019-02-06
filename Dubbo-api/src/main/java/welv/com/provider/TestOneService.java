package welv.com.provider;

import java.util.List;

/**
 * Created by lvyj on 2019/2/2.
 */
public interface TestOneService {

    String sayHello(String name);

    public List getUsers();

    public RefundRet getRef(String msg);

}
