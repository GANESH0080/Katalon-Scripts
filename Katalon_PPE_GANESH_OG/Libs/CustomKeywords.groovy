
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "com.PPE.Database_Connection.connectDB"(
    	String url	
     , 	String port	
     , 	String dbname	
     , 	String username	
     , 	String password	) {
    (new com.PPE.Database_Connection()).connectDB(
        	url
         , 	port
         , 	dbname
         , 	username
         , 	password)
}

def static "com.PPE.Database_Connection.executeQuery"(
    	String queryString	) {
    (new com.PPE.Database_Connection()).executeQuery(
        	queryString)
}

def static "com.PPE.Database_Connection.closeDatabaseConnection"() {
    (new com.PPE.Database_Connection()).closeDatabaseConnection()
}

def static "com.PPE.Database_Connection.execute"(
    	String queryString	) {
    (new com.PPE.Database_Connection()).execute(
        	queryString)
}
