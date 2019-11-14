package com.factory.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.factory.factory.Factory;
import com.factory.inter.ProductInter;

public class Test {
	public static void main(String[] args) throws IllegalArgumentException, InvocationTargetException {
		try {
			ProductInter product = (ProductInter)Factory.getInstance("com.factory.impl.ProductImpl");
			String printInfo = product.printInfo();
			System.out.println(printInfo);
			try {
				Method method = product.getClass().getMethod("getInfo", null);
				Object invoke = method.invoke(product, null);
				System.out.println(method.toString());
				System.out.println(invoke.toString());
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
