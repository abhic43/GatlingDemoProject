#Gatling Performnace Testing
#Created on 08/29/2021
#creator : Abhinav Chaudhary 

#Steps required to run this project.
Prerequisites :  IntelliJ and JDK must be installed for running this project.

# DownLoad the Zip file. Extract the zip file.
# Open Intellij Idea and import the extracted folder.
# Right click on Project name and check for Module Settings.
# Goto Platform SDK and check if File path is present : C:\Program Files\Java\jdk1.8.0_261.  If not add the JDK path.
# Check for Scala Global Libraries : scala-sdk-2.13.6. If not present, click + button to download library.
# Now you have everything installed. 
# Goto path src/test/scala and right click on Engine and select run 'Engine'.
Choose a simulation number:
     [0] myGatlingProject._001_MyLogin
     [1] myGatlingProject._002_Registration
# Choose Simulation you want to run.
# Select run description or hit enter.
# Your project should be running mode.
# To check the output file goto *\GatlingDemoProject\target\gatling\ 
# and open the the simulation file you ran just now. Name can be seen from the console.
# It will give you a beatiful HTML report of all the request and responses.



# In order to view your report in Grafana , Please follow below steps .
# Prerequisites :
# Docker                           - download URL : https://docs.docker.com/desktop/windows/install/
# Docker compostie                 - download URL : https://docs.docker.com/compose/install/
# InfluxDB                         - download URL : https://portal.influxdata.com/downloads/ (Optional)
# Grafana                          - download URL : https://grafana.com/grafana/download/    (Optional)

# Steps 
# After you have installed docker and docker composite. Follow below steps
# Checkout the preconfigured monitoring environment:
  git clone https://github.com/abhic43/DockerGrafanaInfluxKit.git
# Open Command prompt and goto path you have cloned this repo.
# Go inside the imported folder : /~ cd DockerGrafanaInfluxKit
# Run the docker compose in a background mode: /~ docker-compose up -d
# Goto Grafana Dashboard http://localhost:3000
# Add data source Influx


# DockerGrafanaInfluxKit
Link to the related article: 
https://www.blazemeter.com/blog/how-to-create-a-lightweight-performance-monitoring-solution-with-docker-grafana-and-influxdb
