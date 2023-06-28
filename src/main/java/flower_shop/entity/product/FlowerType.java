package flower_shop.entity.product;

public enum FlowerType {
    ROSE("rose"),
    LILY("lily"),
    TULIP("tulip"),
    SUNFLOWER("sunflower"),
    PEONY("peony");

    private final String value;

    FlowerType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
