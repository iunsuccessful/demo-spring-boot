package iunsuccessful.demo.springboot.aware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * <p/>
 *
 * @author Created by 依韵 on 2019/3/29 .
 */
@Configuration
public class EnvironmentInit implements EnvironmentAware {

    private static final Logger logger = LoggerFactory.getLogger(EnvironmentInit.class);

    @Override
    public void setEnvironment(Environment environment) {
        logger.info("init environment aware");
    }
}
