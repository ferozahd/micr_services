package frz.ms.tutorial.cloudclient.feign;

import frz.ms.tutorial.resource.dummyjson.DummyJsonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "jplaceholder", url = "https://dummyjson.com")
public interface DummyJsonClient {

    @RequestMapping(method = RequestMethod.GET, value = "/products", consumes = "application/json;charset=utf-8")
    DummyJsonResponse getDummyClient();

}
