# Tests for the `krasa-jaxb-tools` project using JDK 21

Provides functional tests together with a showcase on how to invoke  [Jaxn Bean Validation Annotation Plugin `krasa-jaxb-tools`](https://github.com/fillumina/krasa-jaxb-tools)  using **JDK 21**.

This is a fork of [GitHub - fillumina/krasa-jaxb-tools-example](https://github.com/fillumina/krasa-jaxb-tools-example) with many more different projects and compiled with JDK 21 rather than JDK 8.

## Projects

| Project Name                                                                                                                                                             | Package   | Source |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | --------- | ------ |
| [krasa-cxf-codegen-plugin-javax-jdk21-example](https://github.com/fillumina/krasa-jaxb-tools-jdk21-example/tree/master/krasa-cxf-codegen-plugin-jakarta-jdk21-example)   | javax     | wsdl   |
| [krasa-cxf-codegen-plugin-jakarta-jdk21-example](https://github.com/fillumina/krasa-jaxb-tools-jdk21-example/tree/master/krasa-cxf-codegen-plugin-jakarta-jdk21-example) | jakarta   | wsdl   |
| [krasa-cxf-xjc-plugin-javax-jdk21-example](https://github.com/fillumina/krasa-jaxb-tools-jdk21-example/tree/master/krasa-cxf-xjc-plugin-javax-jdk21-example)             | javax     | xsd    |
| [krasa-cxf-xjc-plugin-jakarta-jdk21-example](https://github.com/fillumina/krasa-jaxb-tools-jdk21-example/tree/master/krasa-cxf-xjc-plugin-jakarta-jdk21-example)         | jakarta   | xsd    |
| [krasa-maven-jaxb2-plugin-javax-jdk21-example](https://github.com/fillumina/krasa-jaxb-tools-jdk21-example/tree/master/krasa-maven-jaxb2-plugin-javax-jdk21-example)     | javax     | wsdl   |
| [krasa-maven-jaxb2-plugin-jakarta-jdk21-example](https://github.com/fillumina/krasa-jaxb-tools-jdk21-example/tree/master/krasa-maven-jaxb2-plugin-jakarta-jdk21-example) | **mixed** | wsdl   |
| [krasa-jaxb2-maven-plugin-javax-jdk21-example](https://github.com/fillumina/krasa-jaxb-tools-jdk21-example/tree/master/krasa-jaxb2-maven-plugin-javax-jdk21-example)     | javax     | xsd    |
| [krasa-jaxb2-maven-plugin-jakarta-jdk21-example](https://github.com/fillumina/krasa-jaxb-tools-jdk21-example/tree/master/krasa-jaxb2-maven-plugin-jakarta-jdk21-example) | **mixed** | xsd    |
| [krasa-jaxb-maven-plugin-javax-jdk21-example](https://github.com/fillumina/krasa-jaxb-tools-jdk21-example/tree/master/krasa-jaxb-maven-plugin-javax-jdk21-example)       | javax     | xsd    |
| [krasa-jaxb-maven-plugin-jakarta-jdk21-example](https://github.com/fillumina/krasa-jaxb-tools-jdk21-example/tree/master/krasa-jaxb-maven-plugin-jakarta-jdk21-example)   | jakarta   | xsd    |
| [krasa-jaxws-maven-plugin-javax-jdk21-example](https://github.com/fillumina/krasa-jaxb-tools-jdk21-example/tree/master/krasa-jaxws-maven-plugin-javax-jdk21-example)     | javax     | wsdl   |
| [Krasa-jaxws-maven-plugin-jakarta-jdk21-example](https://github.com/fillumina/krasa-jaxb-tools-jdk21-example/tree/master/Krasa-jaxws-maven-plugin-jakarta-jdk21-example) | **mixed** | wsdl   |

In the table the **package** column refers to the packages used in the generated classes:

- **jakarta** when both validation and XML bind annotations use the `jakarta` prefix, ie:
  
  ```java
  import jakarta.validation.Valid;
  import jakarta.xml.bind.annotation.XmlAccessType;
  ```

- **javax** when both validation and XML bind annotations use the `javax` prefix, ie:
  
  ```java
  import javax.validation.Valid;
  import javax.xml.bind.annotation.XmlAccessType;
  ```

- **mixed** when validation annotations produced by `krasa-jaxb-tools` use the `jakarta` package while XML bind annotations produced by the XJC plugin use `javax` package, ie:
  
  ```java
  import javax.xml.bind.annotation.XmlType;
  import jakarta.validation.Valid;
  ```

Having a mixed packages is usually undesirable but might be needed because of other constraints. When the project has to work with older packages that supports `javax` just prefer that, otherwise migrate to the new packages `jakarta` which is supported by the newest and better projects.

## Migration from `javax` to `jakarta`

- Migration guide: https://github.com/highsource/jaxb-tools/wiki/JAXB-Tools-Migration-Guide 
  
  