package com.factory.factory;

public class Factory {
	public static Object getInstance(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> clazz = Class.forName(className);
		return clazz.newInstance();
	}
}
