package welv.com.provider.service.impl;

import org.springframework.stereotype.Service;
import welv.com.provider.TestOneService;
import welv.com.provider.TestTwoService;

import java.util.List;

/**
 * Created by lvyj on 2019/2/4.
 */
@Service
public class TestTwoServiceImpl implements TestTwoService {

    @Override
    public int numAdd(int a, int b) {
        return a+b;
    }

    @Override
    public int numSc(int a, int b) {
        return a-b;
    }
}
