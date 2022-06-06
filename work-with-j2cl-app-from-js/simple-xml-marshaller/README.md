Start J2CL dev mode by:

```
mvn clean j2cl:watch
```
on the root of the simple-xml-marshaller. Once ...

```
----- Build Complete: ready for browser refresh ----- 
```
appears, open one more terminal window and run 

```
http-server -p 8000 
```
or any other light local web server at target/simple-xml-marshaller-1.0-SNAPSHOT/simple-xml-marshaller


Open web browser at 'http://127.0.0.1:8000'