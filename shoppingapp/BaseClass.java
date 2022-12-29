import java.time.LocalDate;

import customer.Customer;
import order.Order;
import product.Product;

public class BaseClass {

	public static void main(String[] args) {
		
		Customer cst = new Customer(0, null, 0);
		Product prd = new Product(0, null, null, 0);
		Order own = new Order(0, null, null, null, null, cst);

	}

}
