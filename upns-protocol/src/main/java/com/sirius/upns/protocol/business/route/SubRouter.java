/* Copyright © 2010 www.myctu.cn. All rights reserved. */
package com.sirius.upns.protocol.business.route;

import com.sirius.upns.protocol.business.DeviceType;

/**
 * @project protocol
 * @date 2013-8-31-上午9:02:34
 * @author pippo
 */
public class SubRouter extends SubApply {

	private static final long serialVersionUID = 935937403970999912L;

	/* 24小时应该过期 */
	public static final long _EXPIRE = 1000 * 60 * 60 * 24;

	public static SubRouter from(SubApply apply) {
		SubRouter router = new SubRouter(apply.userId, apply.deviceToken, apply.deviceType);
		router.host = apply.host;
		return router;
	}

	public SubRouter() {

	}

	public SubRouter(String userId, String deviceToken, DeviceType deviceType) {
		super(userId, deviceToken, deviceType);
		expire = System.currentTimeMillis() + _EXPIRE;
	}

	@Override
	public String toString() {
		return String.format("SubRouter [id=%s, userId=%s, deviceToken=%s, deviceType=%s, host=%s, expire=%s]",
			id,
			userId,
			deviceToken,
			deviceType,
			host,
			expire);
	}

}
