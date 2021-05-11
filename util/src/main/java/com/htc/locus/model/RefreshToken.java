package com.htc.locus.model;

/**
 * Represents a model class for RefreshToken.
 * 
 * @author HTC Global Services
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class RefreshToken {

	protected String id_token;
	protected String refresh_token;

	public RefreshToken() {
	}

	/**
	 * @param id_token
	 * @param refresh_token
	 */
	public RefreshToken(String id_token, String refresh_token) {
		super();
		this.id_token = id_token;
		this.refresh_token = refresh_token;
	}

	/**
	 * @return the id_token
	 */
	public String getId_token() {
		return id_token;
	}

	/**
	 * @param id_token the id_token to set
	 */
	public void setId_token(String id_token) {
		this.id_token = id_token;
	}

	/**
	 * @return the refresh_token
	 */
	public String getRefresh_token() {
		return refresh_token;
	}

	/**
	 * @param refresh_token the refresh_token to set
	 */
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	@Override
	public String toString() {
		return "RefreshToken [id_token=" + id_token + ", refresh_token=" + refresh_token + "]";
	}
}
