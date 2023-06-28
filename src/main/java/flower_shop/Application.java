package flower_shop;

import flower_shop.entity.product.AbstractProduct;
import flower_shop.entity.product.Flower;
import flower_shop.entity.product.FlowerType;
import flower_shop.entity.product.Seed;
import flower_shop.entity.product.assortment.Assortment;
import flower_shop.entity.shop.Address;
import flower_shop.entity.shop.Shop;

public class Application {
    public static void main(String[] args) {
        Flower flower = new Flower(1);
        flower.setPrice(100);
        flower.setType(FlowerType.ROSE);
        flower.setColor("White");

        Seed seed = new Seed(1);
        seed.setPrice(10);
        seed.setDerivative(FlowerType.SUNFLOWER);

        Assortment assortment = new Assortment(1);
        assortment.addProduct(flower);
        assortment.addProduct(seed);

        Shop shop = new Shop(1);
        shop.setAssortment(assortment);
        shop.setAddress(new Address(
                1, "Kazan", "Belarus", "Pushkina", 13, 23
        ));


        for (AbstractProduct product: shop.getAssortment().getProducts()) {
            System.out.println(product.getClass().getName());
        }
    }
}
