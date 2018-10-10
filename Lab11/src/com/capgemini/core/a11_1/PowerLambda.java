package com.capgemini.core.a11_1;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class PowerLambda {
	
	public static void main(String[] args) {
		BiFunction<Double, Double,Double> f=(x,y)->Math.pow(x, y);
		
		System.out.println(f.apply(2d,3d));
	}

}
