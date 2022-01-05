package com.urja.bean;

public class SkuResponse {

	
	private int skuId;
	private int catId;
	private int quantity;
	private String quantityUnit;
	private int piecesPerBox;
	private int isDeleted;
	public int getSkuId() {
		return skuId;
	}
	public void setSkuId(int skuId) {
		this.skuId = skuId;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public int getPiecesPerBox() {
		return piecesPerBox;
	}
	public void setPiecesPerBox(int piecesPerBox) {
		this.piecesPerBox = piecesPerBox;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	
}
