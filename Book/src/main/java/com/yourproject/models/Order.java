package com.yourproject.models; 

public class Order {
    private String orderNumber;
    private double totalAmount;

    public Order() {
       
        this.orderNumber = "ORD123";
        this.totalAmount = 0.0;
    }

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

  
}
