import Widgets.dropdown;
import Widgets.grid;
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
        return "<checkbox-group name=\"Checkbox49878\" enabled=\"true\">\n" +
                "            <layout>\n" +
                "                <grid-layout number-of-columns=\"2\" margin-width=\"5\" margin-height=\"5\" horizontal-spacing=\"5\" vertical-spacing=\"5\" />\n" +
                "            </layout>\n" +
                "            <layout-data>\n" +
                "                <grid-layout-data row-span=\"1\" col-span=\"1\" v-grab=\"false\" h-grab=\"false\" v-alignment=\"center\" h-alignment=\"center\" />\n" +
                "            </layout-data>\n" +
                "            <validators></validators>\n" +
                "            <events></events>\n" +
                "            <items>\n" +
                "                <checkbox selected=\"false\" name=\"checkItem49879\" enabled=\"true\">\n" +
                "                    <layout-data>\n" +
                "                        <grid-layout-data row-span=\"1\" col-span=\"1\" v-grab=\"false\" h-grab=\"false\" v-alignment=\"begin\" h-alignment=\"begin\" />\n" +
                "                    </layout-data>\n" +
                "                    <validators></validators>\n" +
                "                    <events></events>\n" +
                "                </checkbox>\n" +
                "                <checkbox selected=\"false\" name=\"checkItem49916\" enabled=\"true\">\n" +
                "                    <layout-data>\n" +
                "                        <grid-layout-data row-span=\"1\" col-span=\"1\" v-grab=\"false\" h-grab=\"false\" v-alignment=\"begin\" h-alignment=\"begin\" />\n" +
                "                    </layout-data>\n" +
                "                    <validators></validators>\n" +
                "                    <events></events>\n" +
                "                </checkbox>\n" +
                "            </items>\n" +
                "        </checkbox-group>";
    }
}


