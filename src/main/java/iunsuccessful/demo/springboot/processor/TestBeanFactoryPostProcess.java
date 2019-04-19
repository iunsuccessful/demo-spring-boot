package iunsuccessful.demo.springboot.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * <p/>
 *
 * @author Created by 依韵 on 2019/3/29 .
 */
@Component
public class TestBeanFactoryPostProcess implements BeanFactoryPostProcessor {

    private static final Logger logger = LoggerFactory.getLogger(TestBeanFactoryPostProcess.class);

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        logger.info("bean factory post process...");
    }
}
