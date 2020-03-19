Build with : 

`mvn clean install`

Run with:

`mvn exec:java -Dexec.mainClass="org.test.resteasy.Main"`

Test OK : 

`curl http://localhost:8000/1000000 --out /tmp/resp1.bin`

Test KO : 

`curl http://localhost:8000/10000000 --out /tmp/resp2.bin`
