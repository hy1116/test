package app.daou.test.domain.goods;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GoodsRepository extends JpaRepository<Goods,Long> {
    Optional<Goods> findById(Long id);
}
