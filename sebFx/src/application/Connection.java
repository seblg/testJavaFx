package application;

import java.io.*;
import java.net.*;
import javax.xml.xpath.*;
import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.*;
import org.apache.http.entity.*;
import org.apache.http.impl.client.*;
import org.apache.http.util.*;
import org.xml.sax.*;

public class Connection {
	
public String connect(){
	  String stubsApiBaseUri = "https://httpbin.org/get";
      String domain = "default";
      String environment = "addNumbers";
      String stubName = "1+1=2";

      
	try {
		HttpClient client = HttpClients.createDefault();
		 URIBuilder builder = new URIBuilder(stubsApiBaseUri);
        /* builder.addParameter("domain", domain);
         builder.addParameter("env", environment);
         builder.addParameter("stub", stubName);
         String listStubsUri = builder.build().toString();*/
		 URI uri = new URI(stubsApiBaseUri);
         HttpGet getStubMethod = new HttpGet(uri);
         HttpResponse getStubResponse = client.execute(getStubMethod);
         int getStubStatusCode = getStubResponse.getStatusLine()
               .getStatusCode();
         if (getStubStatusCode < 200 || getStubStatusCode >= 300) {
            // Traiter les codes d'état autres que 2xx
            return null;
         }
         String responseBody = EntityUtils
               .toString(getStubResponse.getEntity());
         // On suppose qu'un seul stub convient
         return responseBody;
      } catch (URISyntaxException | IOException e) {
         // Traiter les erreurs
    	  System.out.println("error    "+e);
      }
	return stubName;
	
	}
     
}