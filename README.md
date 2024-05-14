# Tests for the `krasa-jaxb-tools` project

Provides functional tests together with a showcase on how to invoke  [Jaxn Bean Validation Annotation Plugin `krasa-jaxb-tools`](https://github.com/fillumina/krasa-jaxb-tools) .

Note that `krasa-jaxb-tools` in its current version (2.x) is boounded to work with **Java 8 (JDK 1.8)** because of some old projects still depends on it so all dependencies are peeked from the latest versions able to maintain that compatibility.

Tests are performed with these JAX-WS related frameworks:

- [`maven-jaxb2-plugin`](https://github.com/highsource/jaxb-tools)

- [`cxf-codegen-plugin`](https://cxf.apache.org/docs/maven-cxf-codegen-plugin-wsdl-to-java.html)

- [`cxf-xjc-plugin`](https://cxf.apache.org/cxf-xjc-plugin.html)