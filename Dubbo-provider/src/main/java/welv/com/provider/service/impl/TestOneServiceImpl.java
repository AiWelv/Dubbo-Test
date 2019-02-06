package welv.com.provider.service.impl;

import org.springframework.stereotype.Service;
import welv.com.provider.RefundRet;
import welv.com.provider.TestOneService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvyj on 2019/2/2.
 */
@Service("testOneServiceImpl")
public class TestOneServiceImpl implements TestOneService {
    @Override
    public String sayHello(String name) {
        System.out.println("提供者1");
        return name+"AAAAAAAAAAAA";
    }

    @Override
    public List getUsers() {
        List list = new ArrayList();
        list.add("c1");
        list.add("c2");
        return list;
    }

    @Override
    public RefundRet getRef(String msg) {
        RefundRet re = new RefundRet();
        re.setFAILMSG(msg);
        return re;
    }
}
