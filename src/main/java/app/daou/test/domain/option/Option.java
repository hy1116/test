package app.daou.test.domain.option;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Long goods_id;
    @Column
    private String type;
    @Column
    private Long price;

    @Builder
    public Option(Long id, String name, Long goods_id, String type, Long price) {
        this.id = id;
        this.name = name;
        this.goods_id = goods_id;
        this.type = type;
        this.price = price;
    }
}
