package welv.com.provider.service.impl;

import org.springframework.stereotype.Service;
import welv.com.provider.RefundRet;
import welv.com.provider.TestOneService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvyj on 2019/2/2.
 */
@Service("testOneServiceAImpl")
public class TestOneServiceAImpl implements TestOneService {
    @Override
    public String sayHello(String name) {
        System.out.println("提供者A");
        return name+"aaaaaaaaa";
    }

    @Override
    public List getUsers() {
        List list = new ArrayList();
        list.add("a1");
        list.add("a2");
        return list;
    }

    @Override
    public RefundRet getRef(String msg) {
        RefundRet re = new RefundRet();
        re.setFAILMSG(msg+"aa");
        return re;
    }
}
