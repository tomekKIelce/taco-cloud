package tacos;
import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private int id;
    private Date createdAt;
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
