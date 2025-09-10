package records_POJO;

public record PDCStudent(int id, String name, String house, String wand) {
    //Records were made to deal with the boilerplate code problem✅ of Pojo's and be more restrictive ( immutable☠️ ),
    // instead of writing dozens of line, Record does it in few while maintaining more control, also known as Plain Data Carriers

    /*
     *it works same as pojo, but in result we get [] brackets instead of curly
     * record header with each field separated by comma, each field is declared private and final
      */
}
