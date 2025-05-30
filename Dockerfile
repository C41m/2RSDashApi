# Etapa de build
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copia tudo, incluindo a pasta libs com sajdbc4.jar
COPY . .

# Faz o build do projeto
RUN mvn clean package -DskipTests

# Etapa de runtime
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

EXPOSE 8080

# Copia o jar gerado na etapa de build
COPY --from=build /app/target/api-0.0.1-SNAPSHOT.jar app.jar

# Executa o jar
ENTRYPOINT ["java", "-jar", "app.jar"]
