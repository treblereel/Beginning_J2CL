Start J2CL dev mode by:

```
mvn clean j2cl:watch
```
on the root of the js-native-xml-marshaller. Once ...

```
----- Build Complete: ready for browser refresh ----- 
```
appears, open one more terminal window and run 

```
http-server -p 8000 
```
or any other light local web server at target/js-native-xml-marshaller-1.0-SNAPSHOT/js-native-xml-marshaller


Open web browser at 'http://127.0.0.1:8000'