package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidationTest {

	@Test
	void testEmailValidation() throws Exception {
		Validation testRegex = new Validation();
		assertTrue(testRegex.emailIsValid("name23@example.com"));
		assertTrue(testRegex.emailIsValid("name25@example.com"));
		assertTrue(testRegex.emailIsValid("name@example"));

		assertFalse(testRegex.emailIsValid("nameexample123.com"));
		assertFalse(testRegex.emailIsValid("nameexample321.com"));
		assertFalse(testRegex.emailIsValid("@example1.com"));
	}

	@Test
	void testPhoneNumbersValidation() throws Exception {
		Validation testRegex = new Validation();
		assertTrue(testRegex.phoneNumberIsValid("018-5828587"));

		assertFalse(testRegex.phoneNumberIsValid("452727782"));
		assertFalse(testRegex.phoneNumberIsValid("018 5464564"));
		assertFalse(testRegex.phoneNumberIsValid("018 542 7879"));
		assertFalse(testRegex.phoneNumberIsValid("A18-4577244"));
	}

}
