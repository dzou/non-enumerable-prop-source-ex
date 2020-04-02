# Bootstrap Properties bug Repro

This reproduces an issue I encountered where it seems to be unable to create a non-enumerable bootstrap property
source.

Instructions:
Everything should work out of the box, just run the `Application.java` main. You will see an error:

```
***************************
APPLICATION FAILED TO START
***************************

Description:

Failed to bind properties under 'spring.cloud.config' to org.springframework.cloud.bootstrap.config.PropertySourceBootstrapProperties:

    Property: spring.cloud.config
    Value: constant-property
    Origin: "spring.cloud.config" from property source "bootstrapProperties-My-Custom-Bootstrap-Property-Source"
    Reason: Failed to enumerate property names due to non-enumerable property source: CustomPropertySource {name='My-Custom-Bootstrap-Property-Source'}

Action:

Update your application's configuration
```

In the sample I attempt to register a very basic, non-enumerable property source: `CustomPropertySource` which
simply returns a constant value for every possible property key.