package org.uwiga.penjualan.cutomer;

import javax.swing.text.View;

public class MasterCustomerController {
	private MasterCustomerView view;
	private MasterCustomerModel model;
	public MasterCustomerController() {
		//TODO Auto-generated constructor stub
	}
	
	public MasterCustomerController(MasterCustomerView parView, MasterCustomerModel pasModel){
		this.view = parView;
		view.reset();
	}
	public static void main(String[] args) {
		MasterCustomerModel model= new MasterCustomerModel();
		MasterCustomerView view = new MasterCustomerView(model);
		MasterCustomerController controller = new MasterCustomerController(view, model);
		view.setVisible(true);
	}
}