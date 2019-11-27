
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "com.PPE.Login.correctlogin"() {
    (new com.PPE.Login()).correctlogin()
}

def static "com.PPE.QuotePropertyDataSelection.QuoteCreation"() {
    (new com.PPE.QuotePropertyDataSelection()).QuoteCreation()
}

def static "com.PPE.IncorrectLogin.login"() {
    (new com.PPE.IncorrectLogin()).login()
}

def static "com.PPE.GetingOTP.connectDB"(
    	String url	
     , 	String port	
     , 	String dbname	
     , 	String username	
     , 	String password	) {
    (new com.PPE.GetingOTP()).connectDB(
        	url
         , 	port
         , 	dbname
         , 	username
         , 	password)
}

def static "com.PPE.GetingOTP.executeQuery"(
    	String queryString	) {
    (new com.PPE.GetingOTP()).executeQuery(
        	queryString)
}

def static "com.PPE.GetingOTP.closeDatabaseConnection"() {
    (new com.PPE.GetingOTP()).closeDatabaseConnection()
}

def static "com.PPE.GetingOTP.execute"(
    	String queryString	) {
    (new com.PPE.GetingOTP()).execute(
        	queryString)
}
