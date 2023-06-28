package flower_shop.entity.product.assortment;

import flower_shop.entity.AbstractEntity;
import flower_shop.entity.product.AbstractProduct;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Assortment extends AbstractEntity {
    public Assortment(int id) {
        super(id);
    }

    private List<AbstractProduct> products = new ArrayList<>();
    public void addProduct(AbstractProduct product) {
        products.add(product);
    }
}
