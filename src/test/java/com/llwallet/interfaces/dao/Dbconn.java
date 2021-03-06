package com.llwallet.interfaces.dao;

import com.tools.db.MySql;
import com.tools.db.Oracle;
import com.tools.utils.Property;

public class Dbconn {
	
	public static Oracle getDBConnCust() throws Exception {
		return new Oracle(Property.get("db.servertaf.connect"),
				Property.get("db.servertaf.username"),
				Property.get("db.servertaf.password"));
	}
	
	public static MySql getDBConn() throws Exception {
		return new MySql(Property.get("db.llpmobtest.connect"),
				Property.get("db.llpmobtest.username"),
				Property.get("db.llpmobtest.password"));
	}
}
