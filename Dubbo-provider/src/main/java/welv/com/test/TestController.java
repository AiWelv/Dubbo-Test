package welv.com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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


}
