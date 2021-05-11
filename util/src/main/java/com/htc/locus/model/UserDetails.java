package com.htc.locus.model;

import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Represents a model class for UserDetails.
 * 
 * @author HTC Global Services
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class UserDetails {
	// id
	protected Long userId;
	// timezone
	protected String userTimezone;
	// name
	protected String userName;
	// username
	protected String userEmail;
	// image
	protected String userImage;
	// active
	protected Boolean active;
	// expired
	protected Boolean expired;
	// department
	private String departmentName;
	// tenant_id
	private Long userTenantId;
	// plan_id
	private Long planId;
	// company_name
	private String companyName;
	// contact_no
	private String contactNo;
	// country_name
	private String countryName;
	// user_details
	private UserDetailsDetailed userDetailsDetailed;

	public UserDetails() {

	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	@JsonSetter("id")
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the userTimezone
	 */
	public String getUserTimezone() {
		return userTimezone;
	}

	/**
	 * @param userTimezone the userTimezone to set
	 */
	@JsonSetter("timezone")
	public void setUserTimezone(String userTimezone) {
		this.userTimezone = userTimezone;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	@JsonSetter("name")
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userName
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	@JsonSetter("username")
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the userImage
	 */
	public String getUserImage() {
		return userImage;
	}

	/**
	 * @param userImage the userImage to set
	 */
	@JsonSetter("image")
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	@JsonSetter("active")
	public void setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * @return the expired
	 */
	public Boolean getExpired() {
		return expired;
	}

	/**
	 * @param expired the expired to set
	 */
	@JsonSetter("expired")
	public void setExpired(Boolean expired) {
		this.expired = expired;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	@JsonSetter("department")
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the userTenantId
	 */
	public Long getUserTenantId() {
		return userTenantId;
	}

	/**
	 * @param userTenantId the userTenantId to set
	 */
	@JsonSetter("tenant_id")
	public void setUserTenantId(Long userTenantId) {
		this.userTenantId = userTenantId;
	}

	/**
	 * @return the planId
	 */
	public Long getPlanId() {
		return planId;
	}

	/**
	 * @param planId the planId to set
	 */
	@JsonSetter("plan_id")
	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	@JsonSetter("company_name")
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}

	/**
	 * @param contactNo the contactNo to set
	 */
	@JsonSetter("contact_no")
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName the countryName to set
	 */
	@JsonSetter("country_name")
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @return the userDetailsDetailed
	 */
	public UserDetailsDetailed getUserDetailsDetailed() {
		return userDetailsDetailed;
	}

	/**
	 * @param userDetailsDetailed the userDetailsDetailed to set
	 */
	@JsonSetter("user_details")
	public void setUserDetailsDetailed(UserDetailsDetailed userDetailsDetailed) {
		this.userDetailsDetailed = userDetailsDetailed;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userTimezone=" + userTimezone + ", userName=" + userName
				+ ", userEmail=" + userEmail + ", userImage=" + userImage + ", active=" + active + ", expired="
				+ expired + ", departmentName=" + departmentName + ", userTenantId=" + userTenantId + ", planId="
				+ planId + ", companyName=" + companyName + ", contactNo=" + contactNo + ", countryName=" + countryName
				+ ", userDetailsDetailed=" + userDetailsDetailed + "]";
	}

}
