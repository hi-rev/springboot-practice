package ex01;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * 
 * Spring Test Integration
 *
 */

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {MyApplication.class})
public class MyApplicationTest01 {
	
	@Autowired
	private MyComponent myComponent;

	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
