import classtwo.autoConfig.config.AutoConfigStu;
import classtwo.autoConfig.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AutoConfigStu.class)
public class ApplicationTests {

	@Autowired
	Student student;

	@Test
	public void ApplicationTests() {
		System.out.println(student);
	}

}
