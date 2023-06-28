package flower_shop.entity.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower extends AbstractProduct {
    public Flower(int id) {
        super(id);
    }
    private FlowerType type;
    private String color;
}
