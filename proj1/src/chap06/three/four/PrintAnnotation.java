package chap06_3_4;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ElementType.Type, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	
}