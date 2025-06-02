# Etapa 1: Build da aplicação
FROM maven:3.9.6-eclipse-temurin-17 AS builder

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia os arquivos do projeto
COPY pom.xml .
COPY src ./src

# Faz o build do projeto, gerando o .jar
RUN mvn clean package -DskipTests

# Etapa 2: Imagem leve para execução
FROM eclipse-temurin:17-jre-alpine

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia o jar da etapa anterior
COPY --from=builder /app/target/*.jar app.jar

# Expõe a porta (Render automaticamente detecta 8080 como padrão)
EXPOSE 8080

# Comando para rodar o Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
