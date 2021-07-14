# 开放测试套件（Open Testing Suite）

## Java 版本和许可证
当前使用 Java 11，Java 8 也没什么问题，稍后调整 Java 8, 11, 16 都支持，采用 Apache v2 许可证。

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

## TDD & BDD
![tdd-bdd](https://wiki.huihoo.com/images/9/97/Tdd-and-bdd.png)

这幅图将 TDD、BDD 和测试自动化的核心联系和区别做了很好诠释。

尤其是这两句，更是意义非凡。

Build the thing right 和 Build the right thing.

## 参与 
欢迎大家提交更多测试用例和应用场景，将 TDD & BDD 更好融入整个研发流程。