/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zople.controller.util;

import java.sql.Types;
import org.hibernate.dialect.PostgreSQL81Dialect;
import org.hibernate.type.descriptor.sql.BlobTypeDescriptor;
import org.hibernate.type.descriptor.sql.ClobTypeDescriptor;
import org.hibernate.type.descriptor.sql.SqlTypeDescriptor;

public class PostgreSQLDialect extends PostgreSQL81Dialect {
	public PostgreSQLDialect(){
		super();
		registerColumnType( Types.BLOB, "bytea" );
	}
	
	@Override
	public SqlTypeDescriptor getSqlTypeDescriptorOverride(int sqlCode) {
		SqlTypeDescriptor descriptor;
		switch ( sqlCode ) {
			case Types.BLOB: {
				descriptor = BlobTypeDescriptor.STREAM_BINDING;
				break;
			}
			case Types.CLOB: {
				descriptor = ClobTypeDescriptor.CLOB_BINDING;
				break;
			}
			default: {
				descriptor = super.getSqlTypeDescriptorOverride( sqlCode );
				break;
			}
		}
		return descriptor;
	}
}

