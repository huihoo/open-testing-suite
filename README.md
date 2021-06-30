# 测试用例，通过 mvn 构建

# checkstyle Maven 命令
mvn checkstyle:checkstyle

# site Maven 命令
mvn site

# test report Maven 命令
mvn test surefire-report:report

# maven 构建完整命令
mvn clean install checkstyle:checkstyle surefire-report:report site 
