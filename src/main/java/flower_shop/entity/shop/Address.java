package flower_shop.entity.shop;

import flower_shop.entity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address extends AbstractEntity {
    public Address(int id, String city, String country, String street, int homeNumber, int flatNumber) {
        super(id);
        this.city = city;
        this.country = country;
        this.street = street;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;
    }

    private String city;
    private String country;
    private String street;
    private int homeNumber;
    private int flatNumber;
}
