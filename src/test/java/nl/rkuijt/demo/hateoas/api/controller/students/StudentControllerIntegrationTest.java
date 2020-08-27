package nl.rkuijt.demo.hateoas.api.controller.students;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentController.class)
class StudentControllerIntegrationTest {

	private final String path = "/student/";

	@Autowired
	private MockMvc mockMvc;

	@Test
	void get_given_endpointCalledWithId_thenExpect_jsonResponseWithHal() throws Exception {
		this.mockMvc.perform(get(path + "/1337"))
					.andDo(print())
					.andExpect(status().isOk())
					.andExpect(content().string(equalTo(
							"{\"id\":1337,\"firstName\":\"Henk\",\"lastName\":\"Henksen\",\"_links\":{\"self\":{\"href\":\"http://localhost/student/1337\"}}}"
					)));
	}

	@Test
	void get_given_endpointCalledWithIdNonNumerical_thenExpect_numberFormatExceptionResponse() throws Exception {
		this.mockMvc.perform(get(path + "/thisIsNotANumber"))
					.andDo(print())
					.andExpect(status().isBadRequest());
	}

}
