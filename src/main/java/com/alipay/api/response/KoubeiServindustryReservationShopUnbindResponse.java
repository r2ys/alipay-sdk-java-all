package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.reservation.shop.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-02 10:10:01
 */
public class KoubeiServindustryReservationShopUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 2543172482652747292L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 业务是否 成功true，失败false
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}