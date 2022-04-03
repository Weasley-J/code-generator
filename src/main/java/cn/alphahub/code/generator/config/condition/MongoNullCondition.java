package cn.alphahub.code.generator.config.condition;

import cn.alphahub.code.generator.enums.DbType;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author gxz gongxuanzhang@foxmail.com
 */
public class MongoNullCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String property = context.getEnvironment().getProperty("code.generator.db-type", String.class);
        return !StringUtils.equalsIgnoreCase(DbType.MONGODB.getCode(), property);
    }
}
