package flower_shop.entity.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seed extends AbstractProduct{
    public Seed(int id) {
        super(id);
    }
    private FlowerType derivative;
}
