package com.htc.locus.model;

import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Represents a model class for RefreshTokenResponse.
 * 
 * @author HTC Global Services
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class RefreshTokenResponse {

	// identity_id
	private String identityId;
	// access_key_id
	private String accessKeyId;
	// secret_key
	private String secretKey;
	// session_token
	private String sessionToken;
	// id_token
	private String idToken;
	// refresh_token
	private String refreshToken;
	// user_details
	private UserDetails userDetails;

	public RefreshTokenResponse() {
	}

	/**
	 * @return the accessKeyId
	 */
	public String getAccessKeyId() {
		return accessKeyId;
	}

	/**
	 * @param accessKeyId the accessKeyId to set
	 */
	@JsonSetter("access_key_id")
	public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
	}

	/**
	 * @return the secretKey
	 */
	public String getSecretKey() {
		return secretKey;
	}

	/**
	 * @param secretKey the secretKey to set
	 */
	@JsonSetter("secret_key")
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	/**
	 * @return the sessionToken
	 */
	public String getSessionToken() {
		return sessionToken;
	}

	/**
	 * @param sessionToken the sessionToken to set
	 */
	@JsonSetter("session_token")
	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	/**
	 * @return the idToken
	 */
	public String getIdToken() {
		return idToken;
	}

	/**
	 * @param idToken the idToken to set
	 */
	@JsonSetter("id_token")
	public void setIdToken(String idToken) {
		this.idToken = idToken;
	}

	/**
	 * @return the refreshToken
	 */
	public String getRefreshToken() {
		return refreshToken;
	}

	/**
	 * @param refreshToken the refreshToken to set
	 */
	@JsonSetter("refresh_token")
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	/**
	 * @return the userDetails
	 */
	public UserDetails getUserDetails() {
		return userDetails;
	}

	/**
	 * @param userDetails the userDetails to set
	 */
	@JsonSetter("user_details")
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	/**
	 * @return the identityId
	 */
	public String getIdentityId() {
		return identityId;
	}

	/**
	 * @param identityId the identityId to set
	 */
	@JsonSetter("identity_id")
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	@Override
	public String toString() {
		return "RefreshTokenResponse [accessKeyId=" + accessKeyId + ", secretKey=" + secretKey + ", sessionToken="
				+ sessionToken + ", idToken=" + idToken + ", refreshToken=" + refreshToken + ", userDetails="
				+ userDetails + "]";
	}
}
