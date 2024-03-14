package org.jeecg.modules.bm.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jeecg.modules.bm.entity.BmHelloEntity;
import org.jeecg.modules.bm.mapper.BmHelloMapper;
import org.jeecg.modules.bm.service.IBmHelloService;
import org.springframework.stereotype.Service;

/**
 * 测试Service
 */
@Service
public class BmHelloServiceImpl extends ServiceImpl<BmHelloMapper, BmHelloEntity> implements IBmHelloService {

    @Override
    public String hello() {
        return "hello ，我是 bm 微服务节点!";
    }
}
