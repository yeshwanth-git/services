package com.insurance.portal.response;

import java.io.Serializable;

public class WebResponse<T> implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7590801922861791985L;
	private Integer status;
	private T results;
	
	public WebResponse() {
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public T getResults() {
		return results;
	}

	public void setResults(T results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "WebResponse [status=" + status + ", results=" + results + "]";
	}
	
	

}
