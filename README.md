# Match

Login to Heroku and connect this github repo and host

This Application uses inbuilt H2 database and internal tomcat server


Endpoints

For Health Check of the  application, just give slash after portnumber in your local

eg: localhost:8080/

To Add player as id of the player is auto generated

find the sample curl

curl --location --request POST 'localhost:8080/register' \
--header 'Content-Type: application/json' \
--data-raw '{
"name": "deepak",
"dateOfBirth":"20nov",
"email": "some@test.com",
"status": "win",
"noShow": "Y"
}'


