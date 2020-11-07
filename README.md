# Simpleclock  
Simpleclock is a simple Spring Boot app for studies as an example of using the Docker.  
  
### Docker  
  
##### GitHub  
* Build: 	
`docker build https://github.com/RaggerBreak/simpleclock.git -t simpleclock`  
* Run: 	
`docker run -d --name pwcho -p 8080:8080 simpleclock`  
##### Docker Hub  
* Build: 
`docker pull raggerbreak/simpleclock`  
* Run: 
`docker run -d --name pwcho -p 8080:8080 raggerbreak/simpleclock`  
  
##### Result  
  
Verify the deployment by navigating to your server address in your preferred browser.  
  
* ``127.0.0.1:8080``  
* ``http://localhost:8080/``
