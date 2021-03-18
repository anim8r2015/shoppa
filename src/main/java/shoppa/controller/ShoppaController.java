package shoppa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import shoppa.model.Item;

//@NoArgsConstructor

//@RequestMapping("items")
//@RestController

public class ShoppaController {
	
   
	public List<Item> getAllItems(){
						
		List<Item> items = new ArrayList<Item>();
		UUID uuid = UUID.randomUUID();
		items.add(new Item(uuid,"Ugali", Double.parseDouble("200")));
		items.add(new Item(uuid,"Fish", Double.parseDouble("100")));
		items.add(new Item(uuid,"Eggs", Double.parseDouble("500")));
		
		return items;
	}
	
	
}
