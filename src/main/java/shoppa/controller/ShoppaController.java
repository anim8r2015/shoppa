package shoppa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.NoArgsConstructor;
import shoppa.model.Item;

//@NoArgsConstructor

//@RequestMapping("items")
//@RestController
@Controller
public class ShoppaController {
	
	UUID uuid;
	
	//@GetMapping("items/all")
	
	@RequestMapping(method = RequestMethod.GET, value = "items/all")
	@ResponseBody
	public List<Item> getAllItems(){
						
		List<Item> items = new ArrayList<Item>();
		uuid = UUID.randomUUID();
		items.add(new Item(uuid,"Ugali", Double.parseDouble("200")));
		items.add(new Item(uuid,"Fish", Double.parseDouble("100")));
		items.add(new Item(uuid,"Eggs", Double.parseDouble("500")));
		
		return items;
	}
	
	
}
