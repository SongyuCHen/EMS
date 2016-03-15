package nju.software.ems.service.model;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ��ѯ����ע��
 * @author Admin
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Query {
	String table();
	String sqlY();
	String sqlN() default "";
}

