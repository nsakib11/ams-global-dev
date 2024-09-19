package com.ams.api.util;

import static com.ams.api.util.GlobalConstant.KEY_MAP_MESSAGE_TYPE;
import static com.ams.api.util.GlobalConstant.KEY_MAP_PROCESSING_TIME;
import static com.ams.api.util.GlobalConstant.MESSAGE_DURATION_SEPARATOR;
import static com.ams.api.util.GlobalConstant.MESSAGE_SEPARATOR;

import java.util.HashMap;
import java.util.Map;

public final class SessionMap {

	private SessionMap() {
	}

	private static final ThreadLocal<Object> CONTEXT = new ThreadLocal<Object>() {
		protected Object initialValue() {
			return new HashMap<String, Object>();
		}
	};

	private static Map<String, Object> getContext() {
		return (Map<String, Object>) CONTEXT.get();
	}

	public static final void setContext(String key, Object value) {
		getContext().put(key, value);
	}

	public static final Object getValue(String key) {
		return getContext().get(key) == null ? null : getContext().get(key);
	}

	public static final void addContext(String key, Object value) {
		Object newValue;
		Object oldValue = getValue(key);
		if (oldValue != null) {
			newValue = value.toString().concat(MESSAGE_SEPARATOR).concat(oldValue.toString());
		} else {
			newValue = value;
		}
		getContext().put(key, newValue);
	}
	
	public static void addContext(String key, String value, long processingTime) {

		long endTime = System.currentTimeMillis();

		Object messageType = SessionMap.getValue(KEY_MAP_MESSAGE_TYPE);

		if (messageType != null) {
			value = messageType.toString().concat(MESSAGE_DURATION_SEPARATOR).concat(value);
			SessionMap.remove(KEY_MAP_MESSAGE_TYPE);
		}

		String time = String.valueOf(endTime - processingTime);

		SessionMap.remove(KEY_MAP_PROCESSING_TIME);
		SessionMap.addContext(KEY_MAP_PROCESSING_TIME, time);

		String newValue = value.concat(MESSAGE_DURATION_SEPARATOR).concat(time).concat("ms");
		Object oldValue = getValue(key);
		if (oldValue != null && !oldValue.equals("")) {
			newValue = newValue.concat(MESSAGE_SEPARATOR).concat(oldValue.toString());
		}
		getContext().put(key, newValue);
	}

	public static final boolean has(String key) {
		if (getContext() != null) {
			return getContext().get(key) != null;
		}
		return false;
	}

	public static final void remove(String key) {
		getContext().remove(key);
	}

	public static final void remove() {
		getContext().clear();
	}
}