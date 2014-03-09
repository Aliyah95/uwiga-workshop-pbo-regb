package org.uwiga.penjualan.cutomer;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MasterCustomerModel model= new MasterCustomerModel();
		MasterCustomerView view = new MasterCustomerView(model);
		MasterCustomerController controller = new MasterCustomerController(view, model);
		view.setVisible(true);
	}

}
