package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import uni.pl.fmi.Order;

public class PayService {
    static HashMap<String, List<String>> orderNum = new HashMap<String, List<String>>();

	public static String orderInfo(String arts, String startOrder, String enterNames, String enterAdress,
			String enterPhone) {
		final Order newOrder = new Order(arts, startOrder, enterNames, enterAdress, enterPhone);
		List<Order> orders = getOrders();
		
		if(null == arts || "".equals(arts)) {
			return "Добавете артикул";
		}
		if(null == startOrder || "".equals(startOrder)) {
			return "Продължете пазаруването";
		}
		if(null == enterNames || "".equals(enterNames)) {
			return "Въведете името си";
		}
		if(null == enterAdress || "".equals(enterAdress)) {
			return "Въведете адрес";
		}
		if(null == enterPhone || "".equals(enterPhone)) {
			return "Въведете номер";
		}
		if (orderNum.containsKey(enterNames) && orderNum.get(enterNames).contains(enterAdress)) {
			return "Пратката не е налична" ;
		}
		
		orders.add(newOrder);
		return orders.contains(newOrder) ? "Успешно завършихте поръчката си"
				: "Поръчката не е завършена" ;
		
	}

	private static List<Order> getOrders() {
		final List<Order> result = new ArrayList<>();
		final Order order = new Order("Laptop", "Shopping", "Kostadin", "Plovdiv", "088888888");
		result.add(order);
		return result;
	}
    
    
}
