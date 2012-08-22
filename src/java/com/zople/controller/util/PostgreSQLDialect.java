/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zople.controller.util;

import org.hibernate.dialect.PostgreSQL81Dialect;

public class PostgreSQLDialect extends PostgreSQL81Dialect {
	public PostgreSQLDialect(){
		super();
	}
    @Override
    public boolean useInputStreamToInsertBlob() {
        return true;
    }

}

