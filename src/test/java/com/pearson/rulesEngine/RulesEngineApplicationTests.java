package com.pearson.rulesEngine;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.pearson.rulesEngine.controller.OfferController;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@EnableWebMvc
@ContextConfiguration(loader = AnnotationConfigWebContextLoader.class, classes = {
		OfferController.class, Main.class })
public class RulesEngineApplicationTests {

	MockMvc mockMvc;

	@Autowired
	WebApplicationContext webApplicationContext;

	String result = "[{\"offerId\":\"88f626e8-8403-442e-a863-ac300d3ba9b0\",\"title\":\"US Offer - 01\",\"alternateTitle\":\"test 01\",\"dateCreated\":\"2014-11-12T19:17:53.476Z\",\"dateModified\":\"2014-11-12T19:17:53.476Z\",\"createdBy\":\"string\",\"lastModifiedBy\":\"string\",\"offerStartDate\":\"2014-11-12T19:17:53.476Z\",\"offerEndDate\":\"2014-11-12T19:17:53.476Z\",\"description\":\"text\",\"offerStatus\":\"text\",\"orgId\":1,\"countryCode\":\"US\",\"offerType\":{\"offerTypeId\":1234567890,\"offerTypeCode\":\"Access Card\",\"offerTypeDefinition\":null},\"productId\":\"9876543345789\",\"sourceSystem\":\"string\"},{\"offerId\":\"88f626e8-8403-442e-a863-ac300d3ba9b0\",\"title\":\"US Offer - 02\",\"alternateTitle\":\"test 01\",\"dateCreated\":\"2014-11-12T19:17:53.476Z\",\"dateModified\":\"2014-11-12T19:17:53.476Z\",\"createdBy\":\"string\",\"lastModifiedBy\":\"string\",\"offerStartDate\":\"2014-11-12T19:17:53.476Z\",\"offerEndDate\":\"2014-11-12T19:17:53.476Z\",\"description\":\"text\",\"offerStatus\":\"text\",\"orgId\":2,\"countryCode\":\"US\",\"offerType\":{\"offerTypeId\":1234567890,\"offerTypeCode\":\"Access Card\",\"offerTypeDefinition\":null},\"productId\":\"9876543345789\",\"sourceSystem\":\"string\"},{\"offerId\":\"88f626e8-8403-442e-a863-ac300d3ba9b0\",\"title\":\"US Offer - 03\",\"alternateTitle\":\"test 01\",\"dateCreated\":\"2014-11-12T19:17:53.476Z\",\"dateModified\":\"2014-11-12T19:17:53.476Z\",\"createdBy\":\"string\",\"lastModifiedBy\":\"string\",\"offerStartDate\":\"2014-11-12T19:17:53.476Z\",\"offerEndDate\":\"2014-11-12T19:17:53.476Z\",\"description\":\"text\",\"offerStatus\":\"text\",\"orgId\":3,\"countryCode\":\"US\",\"offerType\":{\"offerTypeId\":1234567890,\"offerTypeCode\":\"Access Card\",\"offerTypeDefinition\":null},\"productId\":\"9876543345789\",\"sourceSystem\":\"string\"},{\"offerId\":\"88f626e8-8403-442e-a863-ac300d3ba9b0\",\"title\":\"US Offer - 04\",\"alternateTitle\":\"test 01\",\"dateCreated\":\"2014-11-12T19:17:53.476Z\",\"dateModified\":\"2014-11-12T19:17:53.476Z\",\"createdBy\":\"string\",\"lastModifiedBy\":\"string\",\"offerStartDate\":\"2014-11-12T19:17:53.476Z\",\"offerEndDate\":\"2014-11-12T19:17:53.476Z\",\"description\":\"text\",\"offerStatus\":\"text\",\"orgId\":4,\"countryCode\":\"US\",\"offerType\":{\"offerTypeId\":1234567890,\"offerTypeCode\":\"Access Card\",\"offerTypeDefinition\":null},\"productId\":\"9876543345789\",\"sourceSystem\":\"string\"},{\"offerId\":\"88f626e8-8403-442e-a863-ac300d3ba9b0\",\"title\":\"US Offer - 05\",\"alternateTitle\":\"test 02\",\"dateCreated\":\"2014-11-12T19:17:53.476Z\",\"dateModified\":\"2014-11-12T19:17:53.476Z\",\"createdBy\":\"string\",\"lastModifiedBy\":\"string\",\"offerStartDate\":\"2014-11-12T19:17:53.476Z\",\"offerEndDate\":\"2014-11-12T19:17:53.476Z\",\"description\":\"text\",\"offerStatus\":\"text\",\"orgId\":6,\"countryCode\":\"US\",\"offerType\":{\"offerTypeId\":1234567890,\"offerTypeCode\":\"Access Card\",\"offerTypeDefinition\":null},\"productId\":\"9876543345789\",\"sourceSystem\":\"string\"},{\"offerId\":\"88f626e8-8403-442e-a863-ac300d3ba9b0\",\"title\":\"UK Offer - 01\",\"alternateTitle\":\"test 01\",\"dateCreated\":\"2014-11-12T19:17:53.476Z\",\"dateModified\":\"2014-11-12T19:17:53.476Z\",\"createdBy\":\"string\",\"lastModifiedBy\":\"string\",\"offerStartDate\":\"2014-11-12T19:17:53.476Z\",\"offerEndDate\":\"2014-11-12T19:17:53.476Z\",\"description\":\"text\",\"offerStatus\":\"text\",\"orgId\":1,\"countryCode\":\"UK\",\"offerType\":{\"offerTypeId\":1234567890,\"offerTypeCode\":\"Access Card\",\"offerTypeDefinition\":null},\"productId\":\"9876543345789\",\"sourceSystem\":\"string\"},{\"offerId\":\"88f626e8-8403-442e-a863-ac300d3ba9b0\",\"title\":\"UK Offer - 02\",\"alternateTitle\":\"test 01\",\"dateCreated\":\"2014-11-12T19:17:53.476Z\",\"dateModified\":\"2014-11-12T19:17:53.476Z\",\"createdBy\":\"string\",\"lastModifiedBy\":\"string\",\"offerStartDate\":\"2014-11-12T19:17:53.476Z\",\"offerEndDate\":\"2014-11-12T19:17:53.476Z\",\"description\":\"text\",\"offerStatus\":\"text\",\"orgId\":2,\"countryCode\":\"UK\",\"offerType\":{\"offerTypeId\":1234567890,\"offerTypeCode\":\"Access Card\",\"offerTypeDefinition\":null},\"productId\":\"9876543345789\",\"sourceSystem\":\"string\"}]";

	// json to string convertor http://bernhardhaeussner.de/odd/json-escape/

	@Before
	public void Before() {

		this.mockMvc = webAppContextSetup(webApplicationContext).build();

	}

	@Test
	public void getOffer() throws Exception {
		String param1 = "userRole";
		this.mockMvc
				.perform(
						get("/offer").param(param1, "Student")
								.contentType(MediaType.ALL)
								.accept(MediaType.APPLICATION_JSON))
				.andExpect(content().string(result)).andExpect(status().isOk())
				.andDo(print());

		// need to know the way to mock a service call,
	}

}
