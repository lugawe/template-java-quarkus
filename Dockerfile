# BUILD

FROM maven:3-eclipse-temurin-25-alpine AS build

WORKDIR /app

COPY pom.xml ./pom.xml

RUN --mount=type=cache,target=/root/.m2 mvn -B quarkus:go-offline

COPY src ./src

RUN --mount=type=cache,target=/root/.m2 mvn -B clean package -DskipTests

# RUNTIME

FROM eclipse-temurin:25-jre-alpine AS runtime

RUN addgroup -S quarkus && adduser -S -G quarkus quarkus

WORKDIR /app

COPY --from=build --chown=quarkus:quarkus /app/target/quarkus-app /app

USER quarkus

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "quarkus-run.jar"]
