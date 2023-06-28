package flower_shop.entity.product;

import flower_shop.entity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractProduct extends AbstractEntity {
    protected AbstractProduct(int id) {
        super(id);
    }

    private int price;

}
