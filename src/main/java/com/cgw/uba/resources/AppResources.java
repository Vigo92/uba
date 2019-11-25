package com.cgw.uba.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cgw.uba.model.PaymentDetailsBauTransfer;
import com.cgw.uba.model.PaymentDetailsBauTransferFees;
import com.cgw.uba.service.AppService;
import com.cgw.uba.service.AppService1;

@Path("v1")
public class AppResources{
	
	
	
	@GET
    @Path("table")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTable() {
		
		return "Table";
	}
	
	
	
	@GET
	@Path("transactionfees")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PaymentDetailsBauTransferFees>  getTransferFees(){
		
		
		List<PaymentDetailsBauTransferFees> list = AppService.getBankList();
		
		return list;
		
	}
	@GET
	@Path("transaction")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PaymentDetailsBauTransfer>  getTransfer(){
		
		
		List<PaymentDetailsBauTransfer> list = AppService1.getBankList();
		
		return list;
		
	}

}
