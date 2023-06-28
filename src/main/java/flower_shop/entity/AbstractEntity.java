package flower_shop.entity;

import lombok.Getter;

@Getter
public abstract class AbstractEntity {
    private final int id;
    protected AbstractEntity(int id) {
        this.id = id;
    }
}
