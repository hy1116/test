package app.daou.test.service.goods;

import app.daou.test.domain.goods.Goods;
import app.daou.test.domain.goods.GoodsRepository;
import app.daou.test.web.dto.GoodsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GoodsServiceImpl implements GoodsService{
    private final GoodsRepository goodsRepository;

    @Override
    public Goods findById(Long id) {
        return null;
    }
}
