package app.daou.test.domain.goods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class GoodsRepositoryTest {

    @Autowired GoodsRepository goodsRepository;
    @Test
    @Transactional
    @Rollback(false)
    public void testGoods() throws Exception{
        // given
        Goods goods = new Goods();
        goods.setName("itemA");
        goods.setPrice(10000L);

        // when
        Long saveId = goodsRepository.save(goods);
        Goods findGoods = goodsRepository.find(saveId);

        // then
        assertThat(findGoods.getId()).isEqualTo(goods.getId());
        assertThat(findGoods.getName()).isEqualTo(goods.getName());
        assertThat(findGoods).isEqualTo(goods);
    }
}