If we run this application in default profile it goes to DB (in built H2)

if we run this in "redis" profile that hits resdis server.

Requests:

curl -X POST -H 'Content-Type: application/json' -i http://localhost:80
80/person --data '{
"firstName":"Ravi",
"lastName":"Chappa"
}'

curl -X GET -H 'Content-Type: application/json' -i http://localhost:808
0/persons


