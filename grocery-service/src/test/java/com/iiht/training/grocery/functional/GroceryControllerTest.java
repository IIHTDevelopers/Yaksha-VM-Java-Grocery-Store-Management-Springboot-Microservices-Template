package com.iiht.training.grocery.functional;

import static com.iiht.training.grocery.testutils.TestUtils.businessTestFile;
import static com.iiht.training.grocery.testutils.TestUtils.currentTest;
import static com.iiht.training.grocery.testutils.TestUtils.testReport;
import static com.iiht.training.grocery.testutils.TestUtils.yakshaAssert;
import static org.mockito.Mockito.when;

import java.util.List;

import com.iiht.training.grocery.controller.GroceryController;
import com.iiht.training.grocery.dto.GroceryDto;
import com.iiht.training.grocery.service.GroceryService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.iiht.training.grocery.testutils.MasterData;

@WebMvcTest(GroceryController.class)
@AutoConfigureMockMvc
public class GroceryControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private GroceryService groceryService;

	@AfterAll
	public static void afterAll() {
		testReport();
	}

	@Test
	public void grocery_testAddGrocery() throws Exception {
		GroceryDto dto = MasterData.getGroceryDto();
		GroceryDto savedDto = MasterData.getGroceryDto();
		when(this.groceryService.addGroceryDetails(dto)).thenReturn(savedDto);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/grocery")
				.content(MasterData.asJsonString(dto)).contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		yakshaAssert(currentTest(),
				(result.getResponse().getContentAsString().contentEquals(MasterData.asJsonString(savedDto)) ? "true"
						: "false"),
				businessTestFile);

	}

	@Test
	public void grocery_testAddGroceryIsServiceMethodCalled() throws Exception {
		final int count[] = new int[1];
		GroceryDto dto = MasterData.getGroceryDto();
		when(this.groceryService.addGroceryDetails(dto)).then(new Answer<GroceryDto>() {

			@Override
			public GroceryDto answer(InvocationOnMock invocation) throws Throwable {
				// TODO Auto-generated method stub
				count[0]++;
				return dto;
			}
		});
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/grocery")
				.content(MasterData.asJsonString(dto)).contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		yakshaAssert(currentTest(), count[0] == 1 ? true : false, businessTestFile);

	}


	@Test
	public void grocery_testFindGroceryById() throws Exception {
		List<GroceryDto> groceryDtoList = MasterData.getGroceryDtoList();
		when(this.groceryService.findGroceryById(1L)).thenReturn(groceryDtoList);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/grocery/1")
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		yakshaAssert(currentTest(),
				(result.getResponse().getContentAsString().contentEquals(MasterData.asJsonString(groceryDtoList))
						? "true"
						: "false"),
				businessTestFile);

	}

}
