Steps to build the project :
 - Setup Maven locally.
 - Clone the project into your local git repository
 - open command line and run command : mvn clean install package 

Steps to Run the Project :
 - Once the above command is SUCCESS then run below command to run the project
   java -jar <path of your packaged jar file>
 - once the application is started we can test the APIs using Rest tools (Rested CLient / Postman)

 
Sample to call Service to add potato bag in Market.

Url : localhost:8080/addPotatoBagToMarket
Header : Content-Type = application/json
Body : {
	 "noOfPotatoes":"60",
	 "supplier":"DE_COSTER",
	 "packagingDate":"12/06/2016",
	 "price":25
}

Sample to call Service to get potato bags from Market.

Url : localhost:8080/getPotatoBagsForSale?noOfBagsToReturn=2
Parameter(Optional) :  noOfBagsToReturn = <any number>


