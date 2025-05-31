FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copia o código e libs
COPY . .

# Instala manualmente o driver no Maven local do container
RUN mvn install:install-file \
    -Dfile=libs/sajdbc4.jar \
    -DgroupId=com.sap.sqlanywhere \
    -DartifactId=sajdbc4 \
    -Dversion=17 \
    -Dpackaging=jar

# Faz o build do projeto
RUN mvn clean package -DskipTests

# Imagem final
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

EXPOSE 8080

# Copia o jar gerado
COPY --from=build /app/target/api-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
