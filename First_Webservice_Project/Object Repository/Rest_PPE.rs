<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Rest_PPE</name>
   <tag></tag>
   <elementGuidId>b5f9f5d4-03e1-440f-8058-e09905d40ad7</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody>&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?>
&lt;soap:Envelope xmlns:xsi=&quot;http://www.w3.org/2001/XMLSchema-instance&quot; xmlns:xsd=&quot;http://www.w3.org/2001/XMLSchema&quot; xmlns:soap=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot;>
&lt;soap:Body>
&lt;ConvertWeight xmlns=&quot;http://10.10.10.33/rater-ppe/api/rater&quot;>
Rater>
	&lt;SignIn>
		&lt;LoginName>admin&lt;/LoginName>
		&lt;Password>admin&lt;/Password>
		&lt;RequestVersion>1.5.1.0&lt;/RequestVersion>
		&lt;RaterVersion>1.5.1.0&lt;/RaterVersion>
		&lt;RulesVersion>1.5.1.0&lt;/RulesVersion>
		&lt;ReferenceQuoteId>872&lt;/ReferenceQuoteId>
		&lt;ShowPremium>Y&lt;/ShowPremium>
		&lt;ShowDeductibles>N&lt;/ShowDeductibles>
		&lt;ShowDesc>Y&lt;/ShowDesc>
		&lt;ShowResult>Y&lt;/ShowResult>
		&lt;ShowSteps>Y&lt;/ShowSteps>
		&lt;ShowVar>Y&lt;/ShowVar>
		&lt;ShowRateBasis>Y&lt;/ShowRateBasis>
		&lt;ShowPremiumSteps>Y&lt;/ShowPremiumSteps>
		&lt;RulesState>VA&lt;/RulesState>
		&lt;RaterUrl>http://10.10.10.33/rater-ppe/api/rater&lt;/RaterUrl>
		&lt;ProductCode>HO3&lt;/ProductCode>
		&lt;CoverHolder>IH&lt;/CoverHolder>
	&lt;/SignIn>
	&lt;RateParameter>
		&lt;Parameter        code=&quot;State&quot;>VA&lt;/Parameter>
		&lt;Parameter        code=&quot;County&quot;>arlington&lt;/Parameter>
		&lt;Parameter        code=&quot;InsuranceAmount&quot;>251166&lt;/Parameter>
		&lt;Parameter        code=&quot;ProtectionClass&quot;>6&lt;/Parameter>
		&lt;Parameter        code=&quot;Claims&quot;>
			&lt;NoofClaims>0&lt;/NoofClaims>
			&lt;LossType />
			&lt;LossAmount />
		&lt;/Parameter>
		&lt;Parameter        code=&quot;InsuredAge&quot;>0&lt;/Parameter>
		&lt;Parameter        code=&quot;Deductible&quot;>
			&lt;Type>RCV&lt;/Type>
			&lt;Amount>2500&lt;/Amount>
		&lt;/Parameter>
		&lt;Parameter        code=&quot;ExtReplacementCost&quot;>25&lt;/Parameter>
		&lt;Parameter        code=&quot;BurglaryAlarm&quot;>
			&lt;Opted>N&lt;/Opted>
			&lt;Type>none&lt;/Type>
		&lt;/Parameter>
		&lt;Parameter        code=&quot;SmokeDetectors&quot;>
			&lt;Opted>Y&lt;/Opted>
		&lt;/Parameter>
		&lt;Parameter        code=&quot;Deadbolt&quot;>
			&lt;Opted>Y&lt;/Opted>
		&lt;/Parameter>
		&lt;Parameter        code=&quot;HomeAge&quot;>2000&lt;/Parameter>
		&lt;Parameter        code=&quot;ContructionType&quot;>Masonry Veneer&lt;/Parameter>
		&lt;Parameter        code=&quot;PersonalLiability&quot;>100000&lt;/Parameter>
		&lt;Parameter        code=&quot;HeatingDevice&quot;>
			&lt;Opted>N&lt;/Opted>
			&lt;Type> &lt;/Type>
		&lt;/Parameter>
		&lt;Parameter        code=&quot;OtherStructure&quot;>10&lt;/Parameter>
		&lt;Parameter        code=&quot;PersonalProperty&quot;>50&lt;/Parameter>
		&lt;Parameter        code=&quot;WindCoverage&quot;>
			&lt;Opted>Y&lt;/Opted>
			&lt;Limit>1&lt;/Limit>
		&lt;/Parameter>
		&lt;Parameter        code=&quot;UserInfo&quot;>
			&lt;Name> &lt;/Name>
			&lt;Address>529 N Oxford St, Arlington, VA 22203, USA&lt;/Address>
		&lt;/Parameter>
		&lt;Parameter />
		&lt;Parameter        code=&quot;WaterBackup&quot;>25000&lt;/Parameter>
	&lt;/RateParameter>
&lt;/Rater>
&lt;/soap:Body>
&lt;/soap:Envelope></httpBody>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://10.10.10.33/rater-ppe/api/rater</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
