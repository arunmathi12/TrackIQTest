package com.htc.locus.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.htc.locus.constants.OrderHiveLocusConstants;
import com.htc.locus.model.RefreshToken;
import com.htc.locus.model.RefreshTokenResponse;

/**
 * Represents a class to call the Orderhive url and get the accessKey,
 * secretKey, sessionToken, etc.
 * 
 * @author HTC Global Services
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class RefreshTokenService {

	private static final ObjectMapper objectMapper = new ObjectMapper()
			.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	static final Logger LOGGER = LoggerFactory.getLogger(RefreshTokenService.class);
	private static final String refreshTokenApi = System.getenv(OrderHiveLocusConstants.REFRESH_TOKEN_API);
	private static RefreshToken refreshToken = new RefreshToken();
	static {
		refreshToken.setId_token(System.getenv(OrderHiveLocusConstants.ID_TOKEN));
		refreshToken.setRefresh_token(System.getenv(OrderHiveLocusConstants.REFRESH_TOKEN));
	}

	/**
	 * This static method is used to get the refresh token informations
	 * 
	 * @param
	 * @return service token, secret key and other values
	 */
	public static RefreshTokenResponse getNewRefreshTokenAndDetails() {
		RefreshTokenResponse refreshTokenResponse = new RefreshTokenResponse();
		String requestJson = "";
		try {
			requestJson = objectMapper.writeValueAsString(refreshToken);
		} catch (JsonProcessingException e) {
			LOGGER.debug("Util - Error Occured when build the request Json" + e.getMessage());
		}
		try {
			ResponseEntity<String> thirdPartAPIResponse = null;
			HttpHeaders headers = setHeaderContent();
			RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());
			LOGGER.debug("Util - RefreshTokenService Rest Template Object Initialized");

			HttpEntity<String> entity = new HttpEntity<String>(requestJson.toString(), headers);
			thirdPartAPIResponse = restTemplate.exchange(refreshTokenApi.toString(), HttpMethod.POST, entity,
					String.class);
			refreshTokenResponse = objectMapper.readValue(thirdPartAPIResponse.getBody(), RefreshTokenResponse.class);
		} catch (Exception e) {
			LOGGER.error("Util - Exception Occured in getNewRefreshTokenAndDetails() method :: " + e.getMessage());
		}
		return refreshTokenResponse;
	}

	/**
	 * This private method is used to connection and read timeout
	 * 
	 * @param
	 * @return connection and read timeout
	 */
	private static SimpleClientHttpRequestFactory getClientHttpRequestFactory() {
		SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
		// Connect timeout
		clientHttpRequestFactory.setConnectTimeout(20000);
		// Read timeout
		clientHttpRequestFactory.setReadTimeout(20000);
		return clientHttpRequestFactory;
	}

	/**
	 * This private method is used to set the content type
	 * 
	 * @param
	 * @return application type
	 */
	private static HttpHeaders setHeaderContent() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}
}
