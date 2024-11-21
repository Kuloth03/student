FROM eclipse-temurin:17
COPY target/student.jar student.jar
CMD [ "java", "jar", "student.jar" ] 