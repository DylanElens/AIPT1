FROM openjdk:20
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac -d . src/**/*.java
CMD ["java", "-cp", ".", "NRow.App"]
