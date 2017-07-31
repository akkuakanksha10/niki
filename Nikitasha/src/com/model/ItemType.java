package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the item_type database table.
 * 
 */
@Entity
@Table(name="item_type")
@NamedQuery(name="ItemType.findAll", query="SELECT i FROM ItemType i")
public class ItemType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ITEM_TYPE_ID")
	private String itemTypeId;

	@Column(name="ITEM_NAME")
	private String itemName;

	//bi-directional many-to-one association to Item
	@OneToMany(mappedBy="itemType")
	private List<Item> items;

	public ItemType() {
	}

	public String getItemTypeId() {
		return this.itemTypeId;
	}

	public void setItemTypeId(String itemTypeId) {
		this.itemTypeId = itemTypeId;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Item addItem(Item item) {
		getItems().add(item);
		item.setItemType(this);

		return item;
	}

	public Item removeItem(Item item) {
		getItems().remove(item);
		item.setItemType(null);

		return item;
	}

}