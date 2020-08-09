# deloitteapp-kapil - serverless  example 
Serverless example - API that will use a string as input and does a find and replace for certain words and outputs the result. For example: replace Google for Google©
# What's Here
# Aws Service used in development
  S3 -  To Store application  JAR
  API Gateway -  To Create API and Invoke lamda function 
  Lamda function - 
  Cloud watch -  For logging 
# Request -
  curl --location --request POST 'https://h4mppdw6l8.execute-api.us-east-1.amazonaws.com/default/deloitte-spring-cloud-function' \
--header 'Content-Type: application/json' \
--data-raw 'We really like the new security features of Amazon Cloud'
# Response
  We really like the new security features of Amazon© Cloud
