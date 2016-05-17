package test;

import java.util.concurrent.ConcurrentHashMap;

public class Test {

	class Inner {
		private void f() {
			System.out.println("I'm a Inner method");
		}

		class InnerInner {

			public void innerInnerMethod() {
				f();
			}
		}
	}

	public void outerMethod() {
		// f();
	}

	public static void main(String[] args) {
		// Test.Inner.InnerInner innerInner = new Test.Inner().InnerInner();
		
		ConcurrentHashMap map = new ConcurrentHashMap();
	}
}
