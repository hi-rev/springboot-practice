package ex01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * 
 * Spring Boot Test Integration
 * 
 * Error:
 * Spring Boot Test Integration(@SpringBootTest)에서는
 * @Comfiguration을 달고 있는 설정 클래스를 스캔하지 못한다.
 *
 */

@SpringBootTest
public class MyApplicationTest02 {
	
	@Autowired
	private MyComponent myComponent;

	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
