package app.daou.test.domain.goods;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Repository
public class GoodsRepository{

    @PersistenceContext
    private EntityManager em;

    public Long save(Goods goods){
        em.persist(goods);
        return goods.getId();
    }

    public Goods find(Long id) {
        return em.find(Goods.class, id);
    }
}