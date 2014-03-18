package com.tareagrafica.ventas.service;

public interface GenericService {

	public Integer registrarGeneric(Object generic) throws GenericFailException;
	public Integer modificarGeneric(Object generic) throws GenericFailException;	
	public Integer eliminarGeneric(Integer idGeneric) throws GenericFailException;
	
}
