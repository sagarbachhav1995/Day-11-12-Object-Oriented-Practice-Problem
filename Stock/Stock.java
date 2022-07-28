package com.java.Stock;

public class Stock {
	private String stockNames;
	private int numuberOfShares;
	private Double sharePrice;

	public Stock() {
		super();
	}

	public Stock(String stockNames, int numuberOfShares, Double sharePrice) {
		super();
		this.stockNames = stockNames;
		this.numuberOfShares = numuberOfShares;
		this.sharePrice = sharePrice;
	}
 
	public String getStockNames() {
		return stockNames;
	}

	public void setStockNames(String stockNames) {
		this.stockNames = stockNames;
	}

	public int getNumuberOfShares() {
		return numuberOfShares;
	}

	public void setNumuberOfShares(int numuberOfShares) {
		this.numuberOfShares = numuberOfShares;
	}

	public Double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(Double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public Double getNumOfShare() {

		return null;

	}

}
