package com.vicbot.brewery;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Brewery {

		private int id;
		private String name;
		private String breweryType;
		private String street;
		private String city;
		private String state;
		private String postalCode;
		private String country;
		private String longitude;
		private String latitude;
		private String phone;
		private String websiteUrl;
		private Date updatedAt;
		private List<String> tagList;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBreweryType() {
			return breweryType;
		}
		public void setBreweryType(String breweryType) {
			this.breweryType = breweryType;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPostalCode() {
			return postalCode;
		}
		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getLongitude() {
			return longitude;
		}
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
		public String getLatitude() {
			return latitude;
		}
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getWebsiteUrl() {
			return websiteUrl;
		}
		public void setWebsiteUrl(String websiteUrl) {
			this.websiteUrl = websiteUrl;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		public List<String> getTagList() {
			return tagList;
		}
		public void setTagList(List<String> tagList) {
			this.tagList = tagList;
		}
		@Override
	public String toString() {
		return "Brewery [id=" + id + ", name=" + name + ", breweryType=" + breweryType + ", street=" + street
				+ ", city=" + city + ", state=" + state + ", postalCode=" + postalCode + ", country=" + country
				+ ", longitude=" + longitude + ", latitude=" + latitude + ", phone=" + phone + ", websiteUrl="
				+ websiteUrl + ", updatedAt=" + updatedAt + ", tagList=" + tagList + "]";
	}
}
