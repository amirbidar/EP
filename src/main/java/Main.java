import Attributes.Form.Glossary;
import Attributes.Form.ResourcesForm;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main {

    public static void main(String[] args) {

        try {
            XmlMapper xmlMapper = new XmlMapper();
            ResourcesForm pojo = xmlMapper.readValue(getXmlString(), ResourcesForm.class);
            System.out.println(pojo.getGlossary().getName());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    private static String getXmlString() {
        return "<resources>\n" +
                "\t\t\t\t\t<glossary name=\"MyReports\"/>\n" +
                "\t\t\t\t</resources>";
    }
}


