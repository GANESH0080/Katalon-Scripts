
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "com.PPE.Endorsement_UW.EndorsementByUW"() {
    (new com.PPE.Endorsement_UW()).EndorsementByUW()
}

def static "com.PPE.Saving_PropertyInfo_Page.PropertyPage"() {
    (new com.PPE.Saving_PropertyInfo_Page()).PropertyPage()
}

def static "com.PPE.Saving_PolicyHolderInfo_Page.PolicyHolderPage"() {
    (new com.PPE.Saving_PolicyHolderInfo_Page()).PolicyHolderPage()
}

def static "com.PPE.Login.correctlogin"() {
    (new com.PPE.Login()).correctlogin()
}

def static "com.PPE.Cancellation_UW.CancellationByUW"() {
    (new com.PPE.Cancellation_UW()).CancellationByUW()
}

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

def static "com.PPE.QuotePropertyDataSelection.QuoteCreation"() {
    (new com.PPE.QuotePropertyDataSelection()).QuoteCreation()
}

def static "com.PPE.IncorrectLogin.login"() {
    (new com.PPE.IncorrectLogin()).login()
}

def static "com.PPE.Policy_Creation.ApplicationBind"() {
    (new com.PPE.Policy_Creation()).ApplicationBind()
}

def static "com.PPE.Endorsement_Agent.EndorsementByUW"() {
    (new com.PPE.Endorsement_Agent()).EndorsementByUW()
}

def static "com.PPE.url_Navigation.gotoURL"() {
    (new com.PPE.url_Navigation()).gotoURL()
}

def static "com.PPE.Endorsement_Approval.EndorsementApprovedUW"() {
    (new com.PPE.Endorsement_Approval()).EndorsementApprovedUW()
}
