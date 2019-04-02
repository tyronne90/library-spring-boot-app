01. Changes that needs to be done in application properties
-----------------------------------------
src/main/resources/application.properties
-----------------------------------------

02. Change MySQL Port <PORT>
---------------------------------------------------------------------------
spring.datasource.url = jdbc:mysql://localhost:<PORT>/library?useSSL=false
---------------------------------------------------------------------------

03. spring.jpa.hibernate.ddl-auto => none, validate, update, create, and create-drop.
--------------------------------------------------------------------------------------
Initialize with create -> 
	spring.jpa.hibernate.ddl-auto = create

after that change it to update ->
	spring.jpa.hibernate.ddl-auto = update
--------------------------------------------------------------------------------------

04. Change MySQL username & password
---------------------------------------
spring.datasource.username = <USERNAME>
spring.datasource.password = <PASSWORD>
---------------------------------------



---------------------------------------------------
Save MainClassification / Update MainClassification
---------------------------------------------------

{
    
	"mainClassName": "Story"

}


-------------------------------------------------
Save SubClassification / Update SubClassification
-------------------------------------------------

{
    
	"subClassId": "S04",
    
	"subClassName": "SubClassName4",
    
	"mainClassification": {
        
		"mainClassId": "2"
    
	}

}




----------------------------------
Save Book / Update Book
----------------------------------

{
	
	"id":"B1",
	
	"bookName": "Hobbit",
	
	"mainClassification": {
		
		"mainClassId":1
	
	},
	
	"subClassification": {
		
		"subClassId":"S01"
	
	}

}













