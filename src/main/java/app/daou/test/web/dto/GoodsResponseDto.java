package app.daou.test.web.dto;

import app.daou.test.domain.goods.Goods;
import lombok.Getter;

@Getter
public class GoodsResponseDto {
    private Long id;
    private String name;
    private Long price;

    public GoodsResponseDto(Goods goods) {
        this.id = goods.getId();
        this.name = goods.getName();
        this.price = goods.getPrice();
    }
}
