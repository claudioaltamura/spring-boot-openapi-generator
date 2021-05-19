package de.claudioaltamura.springboot.openapi;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class OpenApiIntegrationTest {
	private static final String PETS_PATH = "/pets/";

	@Autowired
	private MockMvc mockMvc;

	@Test
	void whenReadAll_thenStatusIsNotImplemented() throws Exception {
		mockMvc.perform(get(PETS_PATH)).andExpect(status().isNotImplemented());
	}

	@Test
	void whenReadOne_thenStatusIsNotImplemented() throws Exception {
		mockMvc.perform(get(PETS_PATH + 1)).andExpect(status().isNotImplemented());
	}
}
