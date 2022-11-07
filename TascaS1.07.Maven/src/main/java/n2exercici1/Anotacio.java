package n2exercici1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Anotacio {

	String jsonString();
	String rutaDirectorio();
}
