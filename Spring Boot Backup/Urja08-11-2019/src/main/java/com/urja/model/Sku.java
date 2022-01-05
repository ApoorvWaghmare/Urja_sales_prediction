package com.urja.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sku")
public class Sku implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sku_id")
	private int skuId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id")
	private int catId;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "quantity_unit")
	private String quantityUnit;

	@Column(name = "pieces_per_box")
	private int piecesPerBox;

	@Column(name = "is_deleted")
	private int isDeleted;

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public int getPiecesPerBox() {
		return piecesPerBox;
	}

	public void setPiecesPerBox(int piecesPerBox) {
		this.piecesPerBox = piecesPerBox;
	}

	public String getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public int getSkuId() {
		return skuId;
	}

	public void setCatName(int skuId) {
		this.skuId = skuId;
	}

}
