import Attributes.Form.GeneralForm;
import Attributes.Form.Glossary;
import Attributes.Form.ResourcesForm;
import Base.Form;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main {

    public static void main(String[] args) {

        try {
            XmlMapper xmlMapper = new XmlMapper();
            GeneralForm pojo = xmlMapper.readValue(getXmlString(), GeneralForm.class);
            System.out.println(pojo);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    private static String getXmlString() {
        return "<form xmlns=\"http://www.itorbit.net/goofy/v2/form-definition\"\n" +
                "\t\t\t\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "\t   \t\t\tname=\"TestForm2\"\n" +
                "\t   \t\t\tclient-side-language=\"skippy\"\n" +
                "\t   \t\t\ttitle=\"TestForm2\" \t   \t\t\t\n" +
                "\t   \t\t\tvisible=\"false\" \t   \t\t\tlayoutable=\"true\" \t   \t\t\tenabled=\"true\" \t   \t\t\trendered=\"true\" \t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\tresizable=\"false\" \t   \t\t\tdraggable=\"true\" \t   \t\t\t\n" +
                "\t   \t\t\tversion=\"1\" \n" +
                "\t   \t\t\t>\n" +
                "\n" +
                "\t\t\t\t<resources>\n" +
                "\t\t\t\t\t<glossary name=\"MyReports\"/>\n" +
                "\t\t\t\t</resources>\n" +
                "\t</form>";
    }
}


