Sing-animal-behaviour-app

Singtel Code Assignment

Steps to run the project:

Please find git hub url for the assignment.

Download the application directly from the url https://github.com/munikumar555/animal-behaviour-app

Or

Clone the repository using below commands.

git config --global http.sslVerify false (work around to avoid ssl certificate issue while cloning)

Clone the repository using following command:

git clone https://github.com/munikumar555/animal-behaviour-app

After cloning the repository, use maven to build the project. Use following command to build the application.

C:> mvn clean install

Use Java tool to run the application

BONUS:

Designing RESTFUL WEBSERVICE :

First, a REST resource to GET a list of Animals: http://localhost:8080/animals

One more REST resource to GET details of Animal with name (Example:Rooster) http://www.animal.com/animals/rooster

Json Response:

{ "animal": { "type": "bird", "name": "rooster", "swim": "I cannot swim", "walk": "I am walking", "sing": "Cluck, cluck", "fly": "I cannot fly" } }
