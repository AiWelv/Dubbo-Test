package welv.com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import welv.com.provider.RefundRet;
import welv.com.provider.TestOneService;

/**
 * Created by lvyj on 2019/2/3.
 */
@Controller
@RequestMapping("/Test")
public class TestController {

    @RequestMapping("/paymentRefundsQry")
    @ResponseBody
    public RefundRet paymentRefundsQry(){
        RefundRet ret  = new RefundRet();
        System.out.println("paymentRefundsQry");
        ret.setREFUNDSTATE("N");
        ret.setFAILMSG("XXXXXXXX");
        return ret;
    }

    @Autowired
    private TestOneService testOneService;

    @RequestMapping("/test1")
    @ResponseBody
    public RefundRet test1(@RequestParam("acctId") String acctId){
        RefundRet ret  = new RefundRet();
        ret.setREFUNDSTATE(testOneService.sayHello(acctId));
        ret.setFAILMSG(testOneService.getUsers().get(0).toString());
        return ret;
    }

    @RequestMapping("/test2")
    @ResponseBody
    public RefundRet test2(@RequestParam("msg") String msg){
        return testOneService.getRef(msg);
    }

}
