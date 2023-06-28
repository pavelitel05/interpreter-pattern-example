package flower_shop.entity.shop;

import flower_shop.entity.AbstractEntity;
import flower_shop.entity.product.assortment.Assortment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Shop extends AbstractEntity {
    public Shop(int id) {
        super(id);
    }

    private Assortment assortment;
    private Address address;
}
