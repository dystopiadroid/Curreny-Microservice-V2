URLs

CURRENCY EXCHANGE SERVICE : 
http://localhost:8000/currency-exchange/from/USD/to/INR

CURRENCY CONVERSION SERVICE : 
http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10

EUREKA SERVER :
http://localhost:8761/

API GATEWAY :

	<!-- After changing in the application properties to lowercase -->
	<!-- Using discovery locator properties -->

	CURRENCY EXCHANGE SERVICE : 
	http://localhost:8765/currency-exchange/currency-exchange/from/USD/to/INR

	CURRENCY CONVERSION SERVICE : 
	http://localhost:8765/currency-conversion/currency-conversion/from/USD/to/INR/quantity/10

	<!-- Using API Gateway -->

	CURRENCY EXCHANGE SERVICE : 
	http://localhost:8765/currency-exchange/from/USD/to/INR

	CURRENCY CONVERSION SERVICE : 
	http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10
