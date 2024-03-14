package org.jeecg.modules.bm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.jeecg.modules.bm.entity.BmHelloEntity;

/**
 * 测试接口
 */
public interface IBmHelloService extends IService<BmHelloEntity> {

    String hello();

}
