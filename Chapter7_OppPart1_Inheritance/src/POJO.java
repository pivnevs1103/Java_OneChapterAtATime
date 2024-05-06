/* Used to house data, and pass data between functional classes, it usually has a few, if any
methods sother than getters and setters,
Many databases frameworks use POJOs to read data from, or to write data to, databases, files or streams
- JavaBean is just a POJO, with some extra rules applied to it
- A POJO sometimes called an Entity, because it mirrors databases entitites
- Another ancronym is DTO, for Data Transfer Object


 */
public class POJO {
    public static void main(String[] args) {

        // Calling the POJO
        for(int i = 1; i <= 5; i++){
            StudentPOJO s = new StudentPOJO("S92300" + i,
                    switch (i){
                        case 1 -> "Gretsky";
                        case 2 -> "Bedard";
                        case 3 -> "Stutzle";
                        case 4 -> "Raymond";
                        case 5 -> "Kane";
                        default -> "Unknown";
                    },  "01/01/2000", "Java Masterclass");
            System.out.println(s);
        }

        // Calling the record
        for(int i = 1; i <= 5; i++){
            RecordVSPojo s = new RecordVSPojo("W95945" + i,
                    switch (i){
                        case 1 -> "Larkin";
                        case 2 -> "Michlov";
                        case 3 -> "Ovechkin";
                        case 4 -> "Kucherov";
                        case 5 -> "Mathews";
                        default -> "Unknown";
                    },  "02/02/2000", "Java Masterclass");
        }

        StudentPOJO pojoStudent = new StudentPOJO("S923006", "Bedard", "01/05/2023",
                "Java Masterclass");

        RecordVSPojo recordStudent = new RecordVSPojo("W234566", "Michkov", "04/04/2001",
                "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        // calling POJO
        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());

        // Calling Record, notice how we didnt use any method with the word get, we just called the variable name
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());


    }
}
