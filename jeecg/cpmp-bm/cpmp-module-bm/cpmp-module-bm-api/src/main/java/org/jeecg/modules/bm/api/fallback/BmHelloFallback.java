package org.jeecg.modules.bm.api.fallback;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.jeecg.modules.bm.api.BmHelloApi;
import lombok.Setter;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

/**
 * @author JeecgBoot
 */
@Slf4j
@Component
public class BmHelloFallback implements FallbackFactory<BmHelloApi> {
    @Setter
    private Throwable cause;

    @Override
    public BmHelloApi create(Throwable throwable) {
        log.error("微服务接口调用失败： {}", cause);
        return null;
    }

}
