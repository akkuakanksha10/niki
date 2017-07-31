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


@Path("/RestService")
public class RestService {
ItemImplementation itemImpl;

	

public ItemImplementation getItemImpl() {
	if(itemImpl==null){
		itemImpl=new ItemImplementation();
	}
	return itemImpl;
}
public void setItemImpl(ItemImplementation itemImpl) {
	this.itemImpl = itemImpl;
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
	getItemImpl().saveItemType(type);
	return ""+itemType;

}
}
