package nl.rkuijt.demo.hateoas.api.controller.students.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StudentDtoResponseTest {

	StudentDtoResponse sut = new StudentDtoResponse(1337L, "Henk", "Henksen");
	StudentDtoResponse expected = new StudentDtoResponse(1337L, "Henk", "Henksen");

	@Test
	void getId_given_objectInstantiated_thenExpect_getIdReturnsId() {
		assertThat(sut.getId()).isEqualTo(1337L);
	}

	@Test
	void getFirstName_given_objectInstantiated_thenExpect_getFirstNameReturnsFirstName() {
		assertThat(sut.getFirstName()).isEqualTo("Henk");
	}

	@Test
	void getLastName_given_objectInstantiated_thenExpect_getLastNameReturnsLastName() {
		assertThat(sut.getLastName()).isEqualTo("Henksen");
	}

	@Test
	void equals_given_objectInstantiated_thenExpect_equalsToSameTypeWithSameFields() {
		assertThat(sut).isEqualTo(expected);
	}

	@Test
	@SuppressWarnings({"java:S5838", "EqualsWithItself"})
	void equals_given_objectInstantiated_thenExpect_equalsToSelf() {
		assertThat(sut.equals(sut)).isTrue();
	}

	@Test
	void equals_given_objectInstantiated_thenExpect_notEqualToNull() {
		assertThat(sut).isNotEqualTo(null);
	}

	@Test
	void equals_given_objectInstantiated_thenExpect_notEqualToOtherType() {
		assertThat(sut).isNotEqualTo("string");
	}

	@Test
	void hashcode_given_objectInstantiated_thenExpect_equalsToSameTypeWithSameFields() {
		assertThat(sut).hasSameHashCodeAs(expected);
	}
}
