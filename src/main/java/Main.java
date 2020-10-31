
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.json.JSONObject;
import org.json.XML;

public class Main {

    public static void main(String[] args) {
        try {
            /*XmlMapper xmlMapper = new XmlMapper();
            grid pojo = xmlMapper.readValue(getXmlString(), grid.class);*/
            JSONObject xmlJSONObj = XML.toJSONObject(getXmlString());
            System.out.println(xmlJSONObj.toString());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    private static String getXmlString() {
        return "\t<frame \n" +
                "\t\t\turl= \"asdasdasds\" \t\t\t\n" +
                "\t\t\n" +
                " name= \"Sasdasda\" \t\t enabled= \"true\" \t\t label= \"asdasdasdas\" \t layoutable= \"true\" \n" +
                "\t\t>\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
                "\t\t\t\n" +
                "\t\t\t\trow-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tcol-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-grab=\"true\" \n" +
                "\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-grab=\"true\" \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-alignment=\"center\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"center\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\n" +
                "\t   \t\t<events>\n" +
                "   \t\t\t\n" +
                "   \t\t\t\t\n" +
                "\t\n" +
                "\t <on-focus-lost\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"asdasd\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{asdasdas}\"\n" +
                "\t  submit-region=\"asdasd\"\n" +
                "\tname=\"event_3052\" \n" +
                "\tre-render=\"asdasd\" \n" +
                "\tfire-condition=\"asdasd\" \n" +
                "\tbefore=\"asdasdas\" \n" +
                "\ton-success=\"asdasd\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"asdasd\" value=\"asdasd\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"fdasfdf\" value=\"dfgdfbfd\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-focus-lost>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "   \t\t\t\n" +
                "   \t\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"asdasd\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{asdasdasds}\"\n" +
                "\t  submit-region=\"asdasd\"\n" +
                "\tname=\"event_3053\" \n" +
                "\tre-render=\"asdasd\" \n" +
                "\tfire-condition=\"asdasd\" \n" +
                "\tbefore=\"asdasdasd\" \n" +
                "\ton-success=\"dasdasd\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"asd\" value=\"asd\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"asd\" value=\"asdasd\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "   \t\t\t\n" +
                "   \t\t\t</events>\n" +
                "   \t\t\n" +
                "\t\t</frame>\n" +
                "\t\t";
    }
}


