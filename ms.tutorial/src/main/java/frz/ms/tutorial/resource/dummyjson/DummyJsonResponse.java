package frz.ms.tutorial.resource.dummyjson;

import lombok.Data;

import java.util.List;
@Data
public class DummyJsonResponse {
    private List<Product> products;
    private Integer total ;
    private Integer skip;
    private Integer limit ;
}
