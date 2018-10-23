import com.mmall.vo.CartProductVo;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author: wenyer
 * @Date: 2018/10/23 11:20
 */
public class BigDecimalTest {

    @Test
    public void test1(){
        CartProductVo cartProductVo = new CartProductVo();
        cartProductVo.setId(1);
        cartProductVo.setUserId(1);
        cartProductVo.setProductId(1);
        System.out.println(cartProductVo.getProductTotalPrice());

        //cartProductVo.getProductTotalPrice().doubleValue();

    }
}
