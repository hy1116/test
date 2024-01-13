package app.daou.test.service.goods;

import app.daou.test.domain.goods.Goods;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GoodsServiceImpl implements GoodsService{
    @Override
    public Goods findById(Long id) {
        return null;
    }
}
