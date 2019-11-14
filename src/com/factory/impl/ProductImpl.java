package com.factory.impl;

import com.factory.inter.ProductInter;

public class ProductImpl implements ProductInter {

	@Override
	public String printInfo() {
		return "i'm productimpl1";
	}
	public String getInfo() {
		return "productimpl1 就是我";
	}
}
