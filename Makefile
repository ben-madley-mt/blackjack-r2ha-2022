test:
	./mvnw clean test

build:
	./mvnw clean package

run:
	java -jar target/blackjack-1.0.2.jar
