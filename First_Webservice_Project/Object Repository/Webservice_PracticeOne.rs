<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Webservice_PracticeOne</name>
   <tag></tag>
   <elementGuidId>53ea1a0c-3406-4ddd-9846-d703ac5bad0f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>2335</value>
   </httpHeaderProperties>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;Rater>
	&lt;SignIn>
		&lt;LoginName>admin&lt;/LoginName>
		&lt;Password>admin&lt;/Password>
		&lt;RequestVersion>1.5.1.0&lt;/RequestVersion>
		&lt;RaterVersion>1.5.1.0&lt;/RaterVersion>
		&lt;RulesVersion>1.5.1.0&lt;/RulesVersion>
		&lt;ReferenceQuoteId>873&lt;/ReferenceQuoteId>
		&lt;ShowPremium>Y&lt;/ShowPremium>
		&lt;ShowDeductibles>Y&lt;/ShowDeductibles>
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
		&lt;Parameter        code=&quot;County&quot;>Arlington&lt;/Parameter>
		&lt;Parameter        code=&quot;InsuranceAmount&quot;>250000&lt;/Parameter>
		&lt;Parameter        code=&quot;ProtectionClass&quot;>8&lt;/Parameter>
		&lt;Parameter        code=&quot;Claims&quot;>
			&lt;NoofClaims>3&lt;/NoofClaims>
			&lt;LossType>Wind and hail&lt;/LossType>
			&lt;LossAmount>3636&lt;/LossAmount>
		&lt;/Parameter>
		&lt;Parameter        code=&quot;InsuredAge&quot;>94&lt;/Parameter>
		&lt;Parameter        code=&quot;Deductible&quot;>
			&lt;Type>RCV&lt;/Type>
			&lt;Amount>3000&lt;/Amount>
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
		&lt;Parameter        code=&quot;HomeAge&quot;>2015&lt;/Parameter>
		&lt;Parameter        code=&quot;ContructionType&quot;>Masonry&lt;/Parameter>
		&lt;Parameter        code=&quot;PersonalLiability&quot;>250000&lt;/Parameter>
		&lt;Parameter        code=&quot;HeatingDevice&quot;>
			&lt;Opted>Y&lt;/Opted>
			&lt;Type>Central-Electric&lt;/Type>
		&lt;/Parameter>
		&lt;Parameter        code=&quot;OtherStructure&quot;>10&lt;/Parameter>
		&lt;Parameter        code=&quot;PersonalProperty&quot;>45&lt;/Parameter>
		&lt;Parameter        code=&quot;WindCoverage&quot;>
			&lt;Opted>Y&lt;/Opted>
			&lt;Limit>5&lt;/Limit>
		&lt;/Parameter>
		&lt;Parameter        code=&quot;UserInfo&quot;>
			&lt;Name>Roger Nelson&lt;/Name>
			&lt;Address>520 N Jackson St, Arlington, VA 22201, USA&lt;/Address>
		&lt;/Parameter>
		&lt;Parameter />
		&lt;Parameter        code=&quot;WaterBackup&quot;>10000&lt;/Parameter>
	&lt;/RateParameter>
&lt;/Rater></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>POST</soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <wsdlAddress>http://10.10.10.33/rater-ppe/api/rater HTTP/1.1</wsdlAddress>
</WebServiceRequestEntity>
