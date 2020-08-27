package nl.rkuijt.demo.hateoas.api.controller.students;

import nl.rkuijt.demo.hateoas.api.controller.students.dto.StudentDtoResponse;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

class StudentControllerTest {

	private final StudentController sut = new StudentController();

	@Test
	void get_given_randomId_thenExpect_resultStudentHasMatchingId() {
		Long randomId = new Random().nextLong();
		StudentDtoResponse expected = new StudentDtoResponse(randomId, "Henk", "Henksen");

		StudentDtoResponse actual = sut.get(randomId);
		assertThat(actual).isEqualTo(expected);
	}

}
