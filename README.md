# sonar-analysis-demo
##Istalacio de soar qube e codespace 
# Descargar SonarQube
wget https://binaries.sonarsource.com/Distribution/sonarqube/sonarqube-10.4.1.88267.zip

# Extraer el archivo
unzip sonarqube-10.4.1.88267.zip

# Moverlo a una carpeta más manejable
mv sonarqube-10.4.1.88267 sonarqube

# Entrar a la carpeta
cd sonarqube/bin/linux-x86-64

# Dar permisos de ejecución
chmod +x sonar.sh

# Iniciar SonarQube
./sonar.sh start
