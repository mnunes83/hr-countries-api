# Define a imagem base
FROM openjdk:17

# Copia o arquivo JAR do seu projeto para dentro do container
COPY target/hr-countries-api-1.0.jar /app/hr-countries-api-1.0.jar

# Define o diretório de trabalho
WORKDIR /app

# Expõe a porta do seu projeto
EXPOSE 8080

# Define o comando de inicialização do seu projeto
CMD ["java", "-jar", "hr-countries-api-1.0.jar"]