package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.orderapply.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-08 09:48:44
 */
public class AlipayInsSceneApplicationOrderapplyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3828197247716348445L;

	/** 
	 * 流水号
	 */
	@ApiField("biz_flow_no")
	private String bizFlowNo;

	/** 
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	public void setBizFlowNo(String bizFlowNo) {
		this.bizFlowNo = bizFlowNo;
	}
	public String getBizFlowNo( ) {
		return this.bizFlowNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

}