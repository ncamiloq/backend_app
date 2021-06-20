package com.backendapp.responses;

import java.util.Optional;

import com.backendapp.model.Producto;

public class Response {

	
	private String message="Success";
	private int code;
	private Optional<Producto> producto;
	public Response() {
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Optional<Producto> getProducto() {
		return producto;
	}
	public void setProducto(Optional<Producto> product) {
		this.producto = product;
	}
	@Override
	public String toString() {
		return "Response [message=" + message + ", code=" + code + ", producto=" + producto + "]";
	}
	
	
	
}
