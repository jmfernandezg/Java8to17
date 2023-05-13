package com.jmfg.training.java12;

public class SwitchPreview {

	public static void main(String [] args) {

		OrderStatus status = OrderStatus.CANCELLED;
		var displayStatus = processOrder(status);
		System.out.println(displayStatus);

	}

	private static String processOrder(OrderStatus status) {

		return switch (status) {
			case ORDERED -> "Food ordered,Restaurant will confirm";
			case COOKING -> "Restaurant confirmed order,food is being cooked";
			case DELIVERED -> "Food has been delivered";
			case CANCELLED -> "Food order has been cancelled";
		};
	}
}

enum OrderStatus {

	ORDERED, COOKING, DELIVERED, CANCELLED
}