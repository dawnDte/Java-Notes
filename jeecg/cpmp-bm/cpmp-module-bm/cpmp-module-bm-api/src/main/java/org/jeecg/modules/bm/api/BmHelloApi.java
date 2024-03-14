package org.jeecg.modules.bm.api;
import org.jeecg.modules.bm.api.fallback.BmHelloFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "jeecg-bm", fallbackFactory = BmHelloFallback.class)
public interface BmHelloApi {

    /**
     * bm hello 微服务接口
     * @param
     * @return
     */
    @GetMapping(value = "/bm/hello")
    String callHello();
}
