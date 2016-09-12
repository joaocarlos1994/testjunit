package br.com.keepinshape.service;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

public class DataBaseConnection {
	
	private ObjectContainer db;
	
	public ObjectContainer getConexao(){
		db = Db4o.openFile("Teste.yap");
		return db;
	}
	
	public void closeConexa(){
		db.close();
		db = null;
	}

}
