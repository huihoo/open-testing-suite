# 开放测试套件（Open Testing Suite）

## 测试用例，通过 mvn 构建

## checkstyle Maven 命令
mvn checkstyle:checkstyle

## site Maven 命令
mvn site

## test report Maven 命令
mvn test surefire-report:report

## maven 构建完整命令
mvn clean install checkstyle:checkstyle surefire-report:report site 

注：本项目以 [白盒测试实验](https://gitee.com/huizhuoli/white_box_test_experiment) 为起点，并在此为基础上逐步完善出一套完整的开放测试套件，包含更多的测试用例和应用场景，支持 TDD 和 BDD 等编程范式。
