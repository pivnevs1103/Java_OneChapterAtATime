/*
- The record is a special class that contains data, thats not meant to be altered
- In other words, it seeks to achieve immutability, for the data in its members
- It contains only the most fundamental methods, sich as constructors and accessors
 */
public record RecordVSPojo(String id, String name, String dateOfBirth, String classList) {
}

/* For each component in the header, JAVA generates:
- A field with the same name and delcrared type as the record component
- The field is declared private and final
- The field is sometimes referred to as a component field
- Java generates a toString method that prints out each attribute in a formatting String
- In Addition to creating a private final field for each component, JAva generates a public accessor method for each
component
- This method has the same name and type of the component, but it doesnt have any kind of specual prefix, no get,
or is, for example
- The accessor method, for id in this examole, is simply Id()
 */