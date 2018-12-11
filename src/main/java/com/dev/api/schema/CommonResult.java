package com.dev.api.schema;

public class CommonResult {
	private Integer code = CommonCode.FAILED;

	private String msg;

	public CommonResult() {
	}

	public CommonResult(String msg) {
		this(CommonCode.FAILED, msg);
	}

	public CommonResult(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
