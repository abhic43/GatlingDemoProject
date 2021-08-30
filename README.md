*****************************Gatling Performance Testing***********************

created on 08/29/2021

creator : Abhinav Chaudhary 

*Steps required to run this project.
Prerequisites :  IntelliJ and JDK must be installed for running this project.

* DownLoad the Zip file. Extract the zip file.
* Open Intellij Idea and import the extracted folder.
* Right click on Project name and check for Module Settings.
* Goto Platform SDK and check if File path is present : C:\Program Files\Java\jdk1.8.0_261.  If not add the JDK path.
* Check for Scala Global Libraries : scala-sdk-2.13.6. If not present, click + button to download library.
* Now you have everything installed. Build you project before running.
* Goto terminal and run mvn gatling:test -Dgatling.simulationClass=myGatlingProject._002_Registration 
* Your project should be running mode.
* To check the output file goto *\GatlingDemoProject\target\gatling\ 
* and open the the simulation file you ran just now. Name can be seen from the console.
* It will give you a beatiful HTML report of all the request and responses.



* In order to view your report in Grafana , Please follow below steps .
* Prerequisites :
* Docker                           - download URL : https://docs.docker.com/desktop/windows/install/
* Docker compostie                 - download URL : https://docs.docker.com/compose/install/
* InfluxDB                         - download URL : https://portal.influxdata.com/downloads/ (Optional)
* Grafana                          - download URL : https://grafana.com/grafana/download/    (Optional)

* Steps 
* After you have installed docker and docker composite. Follow below steps
* Checkout the preconfigured monitoring environment:
  git clone https://github.com/abhic43/DockerGrafanaInfluxKit.git
* Open Command prompt and goto path you have cloned this repo.
* Go inside the imported folder : /~ cd DockerGrafanaInfluxKit
* Run the docker compose in a background mode: /~ docker-compose up -d
* Goto Grafana Dashboard http://localhost:3000

or You can run grafana and influx individually using below steps 
* Download Grafana https://grafana.com/grafana/download?pg=get&plcmt=selfmanaged-box1-cta1&platform=windows
* DownLoad Influx https://portal.influxdata.com/downloads/
* and Update influx.conf file from here https://github.com/abhic43/Influx-and-Grafana.git with below parameters 
### [[graphite]]
###
### Controls one or many listeners for Graphite data.
###
[[graphite]]
  # Determines whether the graphite endpoint is enabled.
   enabled = true
   database = "gatlingdb"
   retention-policy = ""
   bind-address = ":2003"
   protocol = "tcp"
   consistency-level = "one"
   templates = [
    "gatling.*.*.*.* measurement.simulation.request.status.field",
    "gatling.*.users.*.* measurement.simulation.measurement.request.field"
  ]
# 
* Goto the path of Influx with CMD and run command : /~ influxd -config influxdb.conf
* You will see influx db start running on port 8086.
* Now goto grafana path and start grafana server.
* goto http://localhost:3000 and you will see grafana running.
* Add data source as gatling from settings.
* Creadte a dashboard and use below queries for interactive graphs or  
* import my dashboard from here https://github.com/abhic43/Influx-and-Grafana.git file name:  Gatling_Performance-1630291574566.json


*****Thanks 
