package com.kapil.serverless;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import java.util.function.Function;

@Component
public class Hello implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
    @Override
    public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent input) {
        APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
      
        List<String> companyNames = Arrays.asList("Oracle", "Google", "Microsoft", "Amazon", "Deloitte");
       
        responseEvent.setStatusCode(200);
        String delimiter = " ";
        responseEvent.setBody(Pattern.compile(delimiter).splitAsStream(input.getBody())
        .map(token -> companyNames.containsIgnoreCase(token) ? token.concat("©") : token)
        .collect(Collectors.joining(delimiter)));
        
        }
       
        
    
}
