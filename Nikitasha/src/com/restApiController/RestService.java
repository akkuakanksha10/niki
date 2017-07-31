package com.restApiController;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

import com.model.Item;
import com.model.ItemType;
import com.process.ItemImplementation;
import com.process.ItemTypeImplementation;

@Path("/RestService")
public class RestService {
ItemTypeImplementation itemTypeImpl;

	
public ItemTypeImplementation getItemTypeImpl() {
	if(itemTypeImpl==null){
		itemTypeImpl=new ItemTypeImplementation();
	}
	return itemTypeImpl;
}
public void setItemTypeImpl(ItemTypeImplementation itemTypeImpl) {
	this.itemTypeImpl = itemTypeImpl;
}
@GET
@Path("/getItems")
@Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
public String getItems(){
	System.out.println("NIKITASHA");
	/*JSONObject object=new JSONObject();
	ItemImplementation implementation=new ItemImplementation();
	try {
		implementation.getObjectList(Item.class);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	return "hello";
	
}
/*
 * Save Item Type
 */
@POST
@Path("/saveItemType")
@Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
public String saveItemType(@FormParam("itemType") String itemType){
	ItemType type=new ItemType();
	type.setItemName(itemType);
	getItemTypeImpl().saveItemType(type);
	return ""+itemType;

}
}
