package app.daou.test;

import app.daou.test.domain.goods.Goods;
import app.daou.test.service.goods.GoodsService;
import app.daou.test.web.dto.GoodsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TestController {
    private final GoodsService goodsService;

    @GetMapping("/goods/{id}")
    public GoodsResponseDto findById(@PathVariable Long id){
        return null;
    }
}
